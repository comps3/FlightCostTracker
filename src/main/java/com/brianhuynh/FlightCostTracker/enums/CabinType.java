package com.brianhuynh.FlightCostTracker.enums;

/**
 * Created by brianhuynh on 1/28/17.
 */
public enum CabinType {

    ECONOMY("ECONOMY"), BUSINESS("BUSINESS"), FIRST("FIRST");

    private String code;

    CabinType(String code) {
        this.code = code;
    }

    String getCode() {
        return code;
    }
}
