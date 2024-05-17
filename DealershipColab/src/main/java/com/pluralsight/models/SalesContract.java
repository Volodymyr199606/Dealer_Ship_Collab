package com.pluralsight.models;

import com.sun.source.tree.BinaryTree;

public class SalesContract extends Contract {

    private double SalesTaxAmount = 0.05;
    private int RecodringFee;
    private double ProcessingFee;
    private boolean finance;
    private double monthlyPayment;

    public SalesContract (String fullName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double SalesTaxAmount, int RecodringFee, double ProcessingFee, boolean finance) {
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
        return SalesTaxAmount;//already returns 0.05 5%
    }

    public void setSalesTaxAmount(double salesTaxAmount)
    {
        SalesTaxAmount = salesTaxAmount;
    }

    public double calculator(double totalPrice, )
    {

        float loanAmount;
        float interestRate;
        float timePeriod;

        interestRate = interestRate /(12 * 100);
        timePeriod = timePeriod * 12;
        double emi = (loanAmount * interestRate (float)Math.pow(1+ interestRate, timePeriod))/ (float)(Math.pow(1+ interestRate,timePeriod)-1);
        return (emi);

    }


    @Override
    public double getMonthlyPayment()
    {
        if(isFinance())
        {
            if(getTotalPrice() <= 10000)
            {
                float loanAmount = getTotalPrice();
                float interestRate = 4.25;
                float timePeriod = 48;

                interestRate = interestRate /(12 * 100);
                timePeriod = timePeriod * 12;
                double emi = (loanAmount * interestRate (float)Math.pow(1+ interestRate, timePeriod))/ (float)(Math.pow(1+ interestRate,timePeriod)-1);
                return (emi);

//                double monthlyPercentage = 0.0525; //5.25%
//                double monthlyPayment = monthlyPercentage / 24;
//                double monthlyPaymentAmount = getTotalPrice() * monthlyPayment;
//                return monthlyPaymentAmount;


            }
            else
            {
                return 0;

            }

        }

        return getTotalPrice();
    }

    public double getTotalPrice()
    {


    }
}




