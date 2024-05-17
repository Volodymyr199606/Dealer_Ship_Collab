package com.pluralsight.models;

public class SalesContract extends Contract {

    private double SalesTaxAmount = 0.05;
    private int RecodringFee;
    private double ProcessingFee;
    private boolean finance;
    private double monthlyPayment;

    public SalesContract (String fullName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment, double SalesTaxAmount, int RecodringFee, double ProcessingFee, boolean finance) {
        super(fullName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.SalesTaxAmount = SalesTaxAmount;
        this.RecodringFee = RecodringFee;
        this.ProcessingFee = ProcessingFee;
        this.finance = finance;
    }

    public boolean isFinance()
    {
        return finance;
    }

    public void setFinance(boolean finance)
    {
        this.finance = finance;
    }

    public double getProcessingFee()
    {
        return ProcessingFee;
    }

    public void setProcessingFee(double processingFee)
    {
        ProcessingFee = processingFee;
    }

    public int getRecodringFee()
    {
        return RecodringFee;
    }

    public void setRecodringFee(int recodringFee)
    {
        RecodringFee = recodringFee;
    }

    public double getSalesTaxAmount()
    {
        return SalesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount)
    {
        SalesTaxAmount = salesTaxAmount;
    }

    public double getMonthlyPayment()
    {
        return monthlyPayment = 0;
    }

    public double getTotalPrice()
    {
        return 0;
    }
    {

    }
}




