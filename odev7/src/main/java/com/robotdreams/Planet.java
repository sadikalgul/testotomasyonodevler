package com.robotdreams;

public enum Planet {
    Merkur(1,57910000d,2439d,58646760d),
    Venus(2,108200000d,6052d,224700900d),
    Dunya(3,149600000d,6371d,365256363d),
    Mars(4,227940000,3389,686980000),
    Jupiter(5,778330000d,71492d,4332299260d),
    Saturn(6,1429400000d,58232d,10759223700d),
    Uranus(7,2870990000d,25362,30685370400d),
    Neptun(8,4504300000d,24622,60182240000d);


    final int order;
    final double distance;
    final double diameter;
    final double duration;

    private Planet(int pOrder,double pDistance,double pDiameter,double pDuration) {
        this.order = pOrder;
        this.distance = pDistance;
        this.diameter = pDiameter;
        this.duration = pDuration;
    }

    public int getOrder() {
        return order;
    }

    public double getDistance() {
        return distance;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDuration() {
        return duration;
    }
}
