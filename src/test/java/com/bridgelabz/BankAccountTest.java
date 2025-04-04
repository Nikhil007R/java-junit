package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount(2000.0);
        assertTrue(account.withdraw(1900.0));
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdrawFailure() {
        BankAccount account = new BankAccount(500.0);
        assertFalse(account.withdraw(1000.0));
        assertEquals(500.0, account.getBalance());
    }
}