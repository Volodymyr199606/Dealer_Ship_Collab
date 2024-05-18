package com.pluralsight.models;

import com.sun.source.tree.NewArrayTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SalesContractTest
{

    @Test
    public void theAmountMonthlyPayment() {
        // Arrange
        Contract salesContract = new SalesContract("Ana","Ana@gmail.com", new Vehicle(1,2005, "BMW", "SUV", "car", "red",1005, 10000 ), 0, 48, 0.05,100,295, true);
        double expectedMonthlyPayment = 226.91;

        // Act
        double actualReturnValue = salesContract.getMonthlyPayment();

        // Assert
        assertEquals(expectedMonthlyPayment, actualReturnValue, "Monthly payment should be $226.91 with provided parameters.");
    }
}