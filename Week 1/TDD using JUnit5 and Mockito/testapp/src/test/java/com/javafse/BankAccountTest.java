package com.javafse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    /*
        Test Bank Account Class
    */
    private BankAccount bankAccount;

    /*
        Setup: Before each tests, setup new Bank Account.
        Teardown: After each tests, clear the Bank Account and clean data.
    */
    @BeforeEach
    void setup() {
        System.out.println("Setup: Opening a new Bank Account, initial balance: 100.00.");
        bankAccount = new BankAccount(100.00);
    }

    @AfterEach
    void teardown() {
        System.out.println("Teardown: Closing the Bank Account, and clearing data.");
        bankAccount = null;
    }

    /*
        Each Test
        - Arrange objects and variables will be needed!
        - Act calls the functions required!
        - Assert verifies the result as expected!
    */
    @Test
    void testSuccessfulWithdrawal() {
        double withdrawalAmount = 40.00;
        double expectedRemainingBalance = 60.00;
        
        boolean transactionSuccess = bankAccount.withdraw(withdrawalAmount);
        double actualBalance = bankAccount.getBalance();
        
        assertTrue(transactionSuccess, "The withdrawal of 40 should succeed.");
        assertEquals(expectedRemainingBalance, actualBalance, "The remaining balance should be exactly 60.");
    }
    
    @Test
    void testOverdraftFails() {
        double withdrawalAmount = 150.00;
        double expectedRemainingBalance = 100.00; 
        
        boolean transactionSuccess = bankAccount.withdraw(withdrawalAmount);
        double actualBalance = bankAccount.getBalance();
        
        assertFalse(transactionSuccess, "Withdrawing more than the balance should fail.");
        assertEquals(expectedRemainingBalance, actualBalance, "The balance should remain untouched at 100.");
    }

    @Test
    void testValidDeposit() {
        double depositAmount = 50.00;
        double expectedNewBalance = 150.00;

        bankAccount.deposit(depositAmount);
        double actualBalance = bankAccount.getBalance();

        assertEquals(expectedNewBalance, actualBalance, "Depositing 50 should raise the balance to 150.");
    }

}
