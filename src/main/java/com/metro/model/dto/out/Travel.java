package com.metro.model.dto.out;

import com.metro.domain.subway.model.Station;

import java.util.List;

public class Travel {

    private List<Station> route;
    private String timeOfTravel;

    public Travel(List<Station> route, String timeOfTravel) {
        this.route = route;
        this.timeOfTravel = timeOfTravel;
    }

    public List<Station> getRoute() {
        return route;
    }

    public String getTimeOfTravel() {
        return timeOfTravel;
    }
}
