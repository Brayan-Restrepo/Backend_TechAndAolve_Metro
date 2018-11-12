package com.metro.controller;

import com.metro.domain.MetroManager;
import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.domain.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class controllerAPI {

    private static final String _USER_NOT_FOUND = "Esta cuenta Microsoft no existe.";
    private static final String _ACOUNT = "La cuenta o la contraseña es incorrecta.";

    @Autowired
    private MetroManager metroManager;

    @CrossOrigin(value = "*")
    @PostMapping("/userauthentication")
    public ResponseEntity<User> findUser(@RequestBody User user) {
        if ()

        return new ResponseEntity<User>(metroManager.findUser(user.getUserName(), user.getPassword()), HttpStatus.CONFLICT);
    }

    @GetMapping("/historical")
    public List<StatisticalHistorical> retrieveStatisticalHistorical() {
        return metroManager.findStaticalHistorical();
    }

}
