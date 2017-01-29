package com.brianhuynh.FlightCostTracker.enums;

/**
 * Created by brianhuynh on 1/28/17.
 */
public enum FlightType {

    ROUNDTRIP("ROUNDTRIP"), ONEWAY("ONEWAY");

    private String code;

    FlightType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
