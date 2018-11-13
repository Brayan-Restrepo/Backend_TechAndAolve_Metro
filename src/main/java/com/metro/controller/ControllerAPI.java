package com.metro.controller;

import com.metro.domain.MetroManager;
import com.metro.domain.subway.model.Station;
import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.domain.user.model.User;
import com.metro.domain.user.model.UserRol;
import com.metro.model.dto.in.RequestTravel;
import com.metro.model.dto.in.UserAuthenticationInDTO;
import com.metro.model.dto.out.Travel;
import com.metro.model.dto.out.UserRolOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.metro.controller.util.ControllerUtil;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerAPI {

    private final String _INVALID_ACCOUNT = "La cuenta o la contraseña es incorrecta.";

    @Autowired
    private MetroManager metroManager;

    @CrossOrigin(value = "*")
    @PostMapping("/authenticateUser")
    public ResponseEntity<UserRolOutDTO> authenticateUser(@RequestBody UserAuthenticationInDTO user) {

        User anUser = metroManager.findUser(user.getUserName(), user.getPassword());
        String userName = user.getUserName();
        String password = user.getPassword();
        if (anUser != null) {
            return new ResponseEntity<>(new UserRolOutDTO(anUser.getRol().getRol()), HttpStatus.ACCEPTED);        
        } else if (ControllerUtil.isNumeric(userName) && ControllerUtil.isNumeric(password) && userName.equals(password)) {
            return new ResponseEntity<>(new UserRolOutDTO(UserRol.INVIATADO.getRol()), HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(new UserRolOutDTO(_INVALID_ACCOUNT), HttpStatus.CONFLICT);
        }
    }

    @CrossOrigin(value = "*")
    @GetMapping("/historical")
    public List<StatisticalHistorical> retrieveStatisticalHistorical() {
        return metroManager.findStaticalHistorical();
    }

    @CrossOrigin(value = "*")
    @GetMapping("/underGroundStations")
    public List<String> retrieveUnderGroundStations() {
        return metroManager.getStations();
    }

    @CrossOrigin(value = "*")
    @PostMapping("/fastestTravel")
    public Travel retrievefastestTravel(@RequestBody RequestTravel requestTravel) {

        return new Travel(new ArrayList<Station>(), "10 min");
    }
}
