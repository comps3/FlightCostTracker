package com.brianhuynh.FlightCostTracker.enums;

/**
 * Created by brianhuynh on 1/28/17.
 */
public enum PriceFilter {

    LOWEST("LOWEST"), HIGHEST("HIGHEST");

    private String code;

    PriceFilter(String code) {
        this.code = code;
    }

    String getCode() {
        return code;
    }
}
