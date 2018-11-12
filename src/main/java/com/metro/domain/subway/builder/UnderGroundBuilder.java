package com.metro.domain.subway.builder;

import com.metro.domain.subway.model.Route;
import com.metro.domain.subway.model.Station;
import com.metro.domain.subway.model.UnderGround;

public class UnderGroundBuilder {

	private Station[] stations = new Station[15];

	private UnderGround underGround = new UnderGround();

	public UnderGroundBuilder() {

		createStations();
		createRouteA();
		createRouteB();
		createRouteC();
		createRouteD();
		createRouteE();
		createRouteF();

	}

	private void createStations() {

		for (int i = 1; i < 16; i++) {

			Station station = new Station();
			station.setName(String.valueOf(i));
			stations[i - 1] = station;
		}

	}

	private void createRouteA() {

		// stations 1-2-3-7-4-5-6 ,
		underGround.addWay(stations[0], stations[1], 4, Route.A);
		underGround.addWay(stations[1], stations[2], 4, Route.A);
		underGround.addWay(stations[2], stations[6], 4, Route.A);
		underGround.addWay(stations[6], stations[3], 4, Route.A);
		underGround.addWay(stations[3], stations[4], 4, Route.A);
		underGround.addWay(stations[4], stations[5], 4, Route.A);

	}

	private void createRouteB() {

		// stations 1-2-11-12-13-14-9-10
		underGround.addWay(stations[0], stations[1], 4, Route.B);
		underGround.addWay(stations[1], stations[10], 4, Route.B);
		underGround.addWay(stations[10], stations[11], 4, Route.B);
		underGround.addWay(stations[11], stations[12], 4, Route.B);
		underGround.addWay(stations[12], stations[13], 4, Route.B);
		underGround.addWay(stations[13], stations[8], 4, Route.B);
		underGround.addWay(stations[8], stations[9], 4, Route.B);

	}

	private void createRouteC() {

		// stations 1-2-3-7-11-12-13-14-15
		underGround.addWay(stations[0], stations[1], 4, Route.C);
		underGround.addWay(stations[1], stations[2], 4, Route.C);
		underGround.addWay(stations[2], stations[6], 4, Route.C);
		underGround.addWay(stations[6], stations[10], 4, Route.C);
		underGround.addWay(stations[10], stations[11], 4, Route.C);
		underGround.addWay(stations[11], stations[12], 4, Route.C);
		underGround.addWay(stations[12], stations[13], 4, Route.C);
		underGround.addWay(stations[13], stations[14], 4, Route.C);
	}

	private void createRouteD() {

		// stations 10-9-8-7-11
		underGround.addWay(stations[9], stations[8], 4, Route.D);
		underGround.addWay(stations[8], stations[7], 4, Route.D);
		underGround.addWay(stations[7], stations[6], 4, Route.D);
		underGround.addWay(stations[6], stations[10], 4, Route.D);
	}

	private void createRouteE() {

		// stations 6-5-4-7-8-9-14-15
		underGround.addWay(stations[5], stations[4], 4, Route.E);
		underGround.addWay(stations[4], stations[3], 4, Route.E);
		underGround.addWay(stations[3], stations[6], 4, Route.E);
		underGround.addWay(stations[6], stations[7], 4, Route.E);
		underGround.addWay(stations[7], stations[8], 4, Route.E);
		underGround.addWay(stations[8], stations[13], 4, Route.E);
		underGround.addWay(stations[13], stations[14], 4, Route.E);
	}

	private void createRouteF() {

		// stations 2-3-7-8-9-14-13-12-11-2
		underGround.addWay(stations[1], stations[2], 4, Route.F);
		underGround.addWay(stations[2], stations[6], 4, Route.F);
		underGround.addWay(stations[6], stations[7], 4, Route.F);
		underGround.addWay(stations[7], stations[8], 4, Route.F);
		underGround.addWay(stations[8], stations[13], 4, Route.F);
		underGround.addWay(stations[13], stations[12], 4, Route.F);
		underGround.addWay(stations[12], stations[11], 4, Route.F);
		underGround.addWay(stations[11], stations[10], 4, Route.F);
		underGround.addWay(stations[10], stations[1], 4, Route.F);
	}

}
