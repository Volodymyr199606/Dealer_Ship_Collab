package com.pluralsight.models;

import com.sun.source.tree.BinaryTree;

public class  SalesContract extends Contract
{

    private  double SalesTaxAmount;
    private static final int RecordingFee = 100;
    private  double ProcessingFee ;
    private boolean finance;
    private double interestRate = 4.25 / 100;



    public SalesContract(String dateVehicleSold, String fullName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment, double SalesTaxAmount, int RecodringFee, double ProcessingFee, boolean finance)
    {
        super(dateVehicleSold,fullName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.finance = finance;
        this.SalesTaxAmount = SalesTaxAmount;
        this.re


    }

    public boolean isFinance()
    {
        return finance;
    }

    public double getSalesTaxAmount()
    {
        return SalesTaxAmount;
    }

    public int getRecordingFee()
    {
        return RecordingFee;
    }

    public double getProcessingFee()
    {
        if (getVehicleSold().getPrice() < 10000)
        {
            ProcessingFee = 295;
            return ProcessingFee;
        }
        else
        {
            return ProcessingFee = 495;
        }

    }


    @Override
    public double getTotalPrice()

    {
        double price = getSalesTaxAmount() + getRecordingFee() + getProcessingFee() + getVehicleSold().getPrice();

        return price;

    }

    @Override
    public double getMonthlyPayment()
    {
        if (isFinance())
        {
            if (getTotalPrice() < 10000)
            {
                double loanAmount = getTotalPrice();
                int timePeriod = 48;
                interestRate = 5.25 / 100;
                double monthlyPayment = (loanAmount * interestRate * Math.pow(1 + interestRate, timePeriod)) / (Math.pow(1 + interestRate, timePeriod) - 1);
                return monthlyPayment;

            }
            else{
                double loanAmount = getTotalPrice();
                int timePeriod = 24;
                interestRate = 4.25 / 100;
                double monthlyPayment = (loanAmount * interestRate * Math.pow(1 + interestRate, timePeriod)) / (Math.pow(1 + interestRate, timePeriod) - 1);
                return monthlyPayment;
            }
        }
        else
        {
            return getTotalPrice();
        }

    }
}





