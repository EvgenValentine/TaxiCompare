package com.company;

import java.util.Objects;

public class TaxiPerKilometers implements ITaxi{
    private String driverName;
    private String carNumber;
    private String contact;
    private double pricePerKilometer;
    private double kilometers;

    public TaxiPerKilometers(String driverName, String carNumber, String contact, double pricePerKilometer, double kilometers) {
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.contact = contact;
        this.pricePerKilometer = pricePerKilometer;
        this.kilometers = kilometers;
    }

    public TaxiPerKilometers() {
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

    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(double pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "TaxiPerKilometers{" +
                "driverName='" + driverName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", contact='" + contact + '\'' +
                ", pricePerKilometer=" + pricePerKilometer +
                ", kilometers=" + kilometers +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getPricePerKilometer()*getKilometers();
    }
}
