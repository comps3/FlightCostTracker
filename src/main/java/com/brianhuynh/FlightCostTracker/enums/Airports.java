package com.brianhuynh.FlightCostTracker.enums;

/**
 * Created by brianhuynh on 1/28/17.
 */
public enum Airports {

    SFO("SFO"), MIA("MIA");

    private String code;

    Airports(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
