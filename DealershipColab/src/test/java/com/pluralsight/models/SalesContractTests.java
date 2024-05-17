package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesContractTests
{
    @Test
    public void theAmountMonthlyPayment()
    {
        //arrange
        Contract salesContract = new SalesContract("Ana","Ana@gmail.com","yes", 8000, 24, 0.05,100,295, true);
        double expectedMonthlyPayment = 70;


        //act
        double actualReturnValue = salesContract.getMonthlyPayment();

        //assert
        assertEquals(expectedMonthlyPayment, actualReturnValue, "Becuae the amount is under 10000 it is a monthly payment of $70 per month.");

    }


}