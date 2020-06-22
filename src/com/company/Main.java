package com.company;
/*
 * Classname : Main
 * Description : The Main class
 *
 * @version 1.0 2020.06.22
 * @author Khnyznytskyj Evgen
 *
 * laboratory work. Variant 9
 *
 * Taxi: payment for km and for time.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TaxiPerHour> listOfTaxiDriversPerHour = new ArrayList<>();
        //adding taxi drivers
        listOfTaxiDriversPerHour.add(
                new TaxiPerHour("Jora", "1", "+380663253387", 35 , 250));
        listOfTaxiDriversPerHour.add(new TaxiPerHour(
                "Jura", "2","+380663253388", 39,320));
        listOfTaxiDriversPerHour.add(new TaxiPerHour(
                "Taras", "3", "+380663253389", 42,275));
        listOfTaxiDriversPerHour.add(new TaxiPerHour(
                "Nikolai", "4", "+380663253390", 30,312 ));
        listOfTaxiDriversPerHour.add(new TaxiPerHour(
                "Andrew", "5", "+380663253391", 48, 300 ));
        List<TaxiPerKilometers>  listOfTaxiDriversPerKilometers = new ArrayList<>();
        listOfTaxiDriversPerKilometers.add(new TaxiPerKilometers(
                "Cetherine", "6", "+380663253392", 8 , 1200));
        listOfTaxiDriversPerKilometers.add(new TaxiPerKilometers(
                "Vasilij", "7", "+380663253393", 7 , 1425));
        listOfTaxiDriversPerKilometers.add(new TaxiPerKilometers(
                "Petr", "8", "+380663253394", 7, 1365));
        listOfTaxiDriversPerKilometers.add(new TaxiPerKilometers(
                "Vlad", "9", "+380663253395", 6 ,1800));
        listOfTaxiDriversPerKilometers.add(new TaxiPerKilometers(
                "Vincent", "10", "+380663253396", 9 , 1375));

        List<ITaxi> listOfTaxiDrivers = new ArrayList<>();

        //get total salary table and push to listOfTaxiDri
        System.out.println("Salary table");
        //per hours drivers
        listOfTaxiDriversPerHour.stream().forEach(item ->{
            System.out.println(item.getDriverName() + " - " + item.getPaymentAmount());
            listOfTaxiDrivers.add(item);
        });
        //per kilometers drivers
        listOfTaxiDriversPerKilometers.stream().forEach(item ->{
            System.out.println(item.getDriverName() + " - " + item.getPaymentAmount());
            listOfTaxiDrivers.add(item);
        });

        //sum of all salary
        double allSalary = listOfTaxiDrivers.stream()
                .mapToDouble(ITaxi::getPaymentAmount)
                .sum();
        System.out.println("Всі таксисти за місяць заробили - " + allSalary);

        //What is the biggest salary?
        ITaxi maxSalary = listOfTaxiDrivers.stream()
                .max(Comparator.comparingDouble(ITaxi::getPaymentAmount))
                .orElse(null);
        System.out.println("Найбільший заробіток - " + maxSalary.getPaymentAmount());

        //What is the lesser salary?
        ITaxi minSalary = listOfTaxiDrivers.stream()
                .min(Comparator.comparingDouble(ITaxi::getPaymentAmount))
                .orElse(null);
        System.out.println("Найменший заробіток - " + minSalary.getPaymentAmount());

        //average salary
        double averageSalary = listOfTaxiDrivers.stream().mapToDouble(ITaxi::getPaymentAmount)
                .average().orElse(0);
        System.out.println("Середній заробіток - " + minSalary.getPaymentAmount());

        //compare two types of taxi
        double allSalaryPerHour = listOfTaxiDriversPerHour.stream()
                .mapToDouble(ITaxi::getPaymentAmount)
                .sum();
        double allSalaryPerKilometer = listOfTaxiDriversPerHour.stream()
                .mapToDouble(ITaxi::getPaymentAmount)
                .sum();

        if (allSalaryPerHour > allSalaryPerKilometer){
            System.out.println("Таксисти, що беруть оплату за годину заробляють більше");
        }else{
            System.out.println("Таксисти, що беруть оплату за кілометраж заробляють більше");
        }
    }
}
