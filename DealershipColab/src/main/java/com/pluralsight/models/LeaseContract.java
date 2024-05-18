package com.pluralsight.models;

public class LeaseContract extends Contract
{
    private double expectedEndingValue;
    private double leaseFee;
    private double totalIntrestPaid;
    private double totalCost;
    private double finance;


    public LeaseContract(String fullName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment, double expectedEndingValue, double leaseFee) {
        super(fullName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;

    }

    public double getExpectedEndingValue()
    {
        return expectedEndingValue = 0.5;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee= 0.07;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getMonthlyPayment()
    {
        double monthlyPayment = calculatePayment(getTotalPrice(),0.4,3);
        return monthlyPayment;
    }

    public double calculatePayment(double principal, double rate, int years)
    {
        int numberOfPayments = years * 12;
        double montlyRate = rate / 12;

        double numerator = montlyRate * Math.pow(1 + montlyRate, numberOfPayments);
        double denominator = Math.pow(1 + montlyRate, numberOfPayments) - 1;
        return principal * numerator / denominator;
    }

    @Override
    public double getTotalPrice()
    {
        double halfPriceVehicle = getExpectedEndingValue() * getVehicleSold().getPrice();
        double leasefee = getVehicleSold().getPrice() * getLeaseFee();
        double totalPrice = halfPriceVehicle + leasefee;
        return totalPrice;

    }
}
