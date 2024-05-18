package com.pluralsight.models;

import com.sun.source.tree.NewArrayTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public void theAmountMonthlyPayment()
{
    //arrange
    Contract salesContract = new SalesContract("Ana","Ana@gmail.com", new Vehicle(1,2005, "BMW", "SUV", "car", "red",1005, 10000 ), 0, 48, 0.05,100,295, true);
    double expectedMonthlyPayment = 226.91;


    //act
    double actualReturnValue = salesContract.getMonthlyPayment();

    //assert
    assertEquals(expectedMonthlyPayment, actualReturnValue, "Because the amount is under 10000 it is a monthly payment of $226.91 per month.");

}

class SalesContractTests
{
    @Test



}