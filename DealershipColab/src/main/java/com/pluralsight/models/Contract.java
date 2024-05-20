package com.pluralsight.models;

import java.rmi.dgc.Lease;
import java.util.ArrayList;

public abstract class Contract
{
    private String dateVehicleSold;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String customerEmail;
    private Vehicle vehicleSold;
    private double totalPrice;
    private double monthlyPayment;
    private ArrayList<Contract> contracts;

    public Contract(String dateVehicleSold,String fullName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment) {
        this.dateVehicleSold = dateVehicleSold;
        this.fullName = fullName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
        contracts = new ArrayList<>();
    }

    public void addContract(SalesContract sales)
    {
        contracts.add(sales);
    }


    public void addContract(LeaseContract sales)
    {
        contracts.add(sales);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
