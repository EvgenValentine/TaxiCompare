package com.company;
/*
 * Classname : TaxiPerHour
 * Description : Class witch contains info about taxi per hour
 *
 * @version 1.0 2020.06.22
 * @author Khnyznytskyj Evgen
 *
 * laboratory work. Variant 9
 *
 * Taxi: payment for km and for time.
 */

import java.util.Objects;

public class TaxiPerHour implements ITaxi{
    private String driverName;
    private String carNumber;
    private String contact;         //drivers contact
    private double pricePerHour;
    private double hours;           //per month

    public TaxiPerHour(String driverName, String carNumber, String contact, double pricePerHour, double hours) {
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.contact = contact;
        this.pricePerHour = pricePerHour;
        this.hours = hours;
    }

    public TaxiPerHour() {
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "TaxiPerHour{" +
                "driverName='" + driverName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", contact='" + contact + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getPricePerHour()*getHours();
    }
}
