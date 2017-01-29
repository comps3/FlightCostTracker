package com.brianhuynh.FlightCostTracker.dto;

import com.brianhuynh.FlightCostTracker.enums.Airports;
import com.brianhuynh.FlightCostTracker.enums.CabinType;
import com.brianhuynh.FlightCostTracker.enums.FlightType;

import java.time.LocalDate;

/**
 * Created by brianhuynh on 1/28/17.
 */
public class FlightSearchDetails {

    Airports departureAirport;

    Airports arrivalAirport;

    LocalDate fromDate;

    LocalDate toDate;

    FlightType flightType;

    Integer numberOfPassengers;

    CabinType cabinType;

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airports departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airports arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public CabinType getCabinType() {
        return cabinType;
    }

    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSearchDetails that = (FlightSearchDetails) o;

        if (departureAirport != that.departureAirport) return false;
        if (arrivalAirport != that.arrivalAirport) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        if (flightType != that.flightType) return false;
        if (numberOfPassengers != null ? !numberOfPassengers.equals(that.numberOfPassengers) : that.numberOfPassengers != null)
            return false;
        return cabinType == that.cabinType;

    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (flightType != null ? flightType.hashCode() : 0);
        result = 31 * result + (numberOfPassengers != null ? numberOfPassengers.hashCode() : 0);
        result = 31 * result + (cabinType != null ? cabinType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightSearchDetails{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", flightType=" + flightType +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cabinType=" + cabinType +
                '}';
    }
}
