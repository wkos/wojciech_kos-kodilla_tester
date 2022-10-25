package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldReturnProperBalance() {
        cashMachine.deposit(4500);
        cashMachine.deposit(2000);
        cashMachine.withdraw(1500);
        cashMachine.withdraw(3000);
        double balance = cashMachine.balance();
        assertEquals(2000, balance, 0.01);
    }

    @Test
    public void shouldReturnZeroBalanceWhenNoCash() {
        double balance = cashMachine.balance();
        assertEquals(0, balance, 0.01);
    }

    @Test
    public void shouldNotWithdrawWhenValueIsGreaterThanBalance() {
        cashMachine.withdraw(3000);
        double numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldReturnTwoDepositTransactionsWithNoWithdrawals() {
        cashMachine.deposit(1500);
        cashMachine.deposit(2000);
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(2, numberOfTransactions);
    }

    @Test
    public void shouldReturnZeroTransactionsWhenThereIsNoCash() {
        cashMachine.withdraw(1500);
        cashMachine.withdraw(2000);
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldReturnFourDepositsAndWithdrawalsWhenBalanceIsZero() {
        cashMachine.deposit(1500);
        cashMachine.deposit(2000);
        cashMachine.withdraw(1500);
        cashMachine.withdraw(2000);
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(4, numberOfTransactions);
    }

    @Test
    public void shouldReturnZeroTransactionsWhenNoTransactionsWhereMade() {
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldReturnTwoWithdrawalTransactionsWithDeposits() {
        cashMachine.withdraw(1500);
        cashMachine.withdraw(2000);
        cashMachine.deposit(1500);
        cashMachine.deposit(2000);
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(2, numberOfTransactions);
    }

    @Test
    public void shouldNotChangeBalanceWhenWithdrawalIsGraterThanBalance() {
        cashMachine.deposit(3000);
        double balanceBeforeWithdrawal = cashMachine.balance();
        cashMachine.withdraw(5000);
        double balanceAfterWithdrawal = cashMachine.balance();
        boolean result = balanceAfterWithdrawal != balanceBeforeWithdrawal;
        assertFalse(result);
    }
}
