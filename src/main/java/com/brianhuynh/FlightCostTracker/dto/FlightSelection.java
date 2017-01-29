package com.brianhuynh.FlightCostTracker.dto;

import com.brianhuynh.FlightCostTracker.enums.PriceFilter;

/**
 * Created by brianhuynh on 1/28/17.
 */
public class FlightSelection {

    String flightNumber;

    PriceFilter priceFilter;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public PriceFilter getPriceFilter() {
        return priceFilter;
    }

    public void setPriceFilter(PriceFilter priceFilter) {
        this.priceFilter = priceFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSelection that = (FlightSelection) o;

        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        return priceFilter == that.priceFilter;

    }

    @Override
    public int hashCode() {
        int result = flightNumber != null ? flightNumber.hashCode() : 0;
        result = 31 * result + (priceFilter != null ? priceFilter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightSelection{" +
                "flightNumber='" + flightNumber + '\'' +
                ", priceFilter=" + priceFilter +
                '}';
    }
}
