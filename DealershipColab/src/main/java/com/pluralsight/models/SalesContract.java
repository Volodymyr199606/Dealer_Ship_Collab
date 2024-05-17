package com.pluralsight.models;

import com.sun.source.tree.BinaryTree;

public class SalesContract extends Contract {

    private static final double SalesTaxAmount = 0.05;
    private static final int RecordingFee = 100;
    private static final double ProcessingFee = 495;
    private  boolean finance;
    private  double monthlyPayment;

    public SalesContract (String fullName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double SalesTaxAmount, int RecodringFee, double ProcessingFee, boolean finance) {
        super(fullName, customerEmail, vehicleSold, totalPrice, monthlyPayment);


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

    public int getRecordingFee()
    {
        return RecordingFee;
    }

    public double getSalesTaxAmount()
    {
        return SalesTaxAmount;//already returns 0.05 5%
    }




    @Override
    public double getMonthlyPayment()
    {
        if(isFinance())
        {
            if(getTotalPrice() >= 10000)
            {
                double loanAmount = getTotalPrice();
                double interestRate = 4.25/100;
                int timePeriod = 3;

                interestRate = interestRate /(12 * 100);
                timePeriod = timePeriod * 12;
                double emi = (loanAmount * interestRate * Math.pow(1+ interestRate, timePeriod))/ (Math.pow(1+ interestRate,timePeriod)-1);
                return emi;


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
        double salesTaxAmount = super.getTotalPrice() + SalesTaxAmount;
        double totalPrice = super.getTotalPrice() + salesTaxAmount + RecordingFee + ProcessingFee;


        return totalPrice;

    }

}




