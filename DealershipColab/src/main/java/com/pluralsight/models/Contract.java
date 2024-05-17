package com.pluralsight.models;

public abstract class Contract
{
    private String fullName;
    private String address;
    private String phoneNumber;
    private String customerEmail;
    private String vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String fullName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment) {
        this.fullName = fullName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
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

    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
