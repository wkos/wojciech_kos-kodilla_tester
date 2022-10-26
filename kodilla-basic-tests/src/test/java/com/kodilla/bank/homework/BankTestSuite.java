package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashMachineOne = new CashMachine();
    CashMachine cashMachineTwo = new CashMachine();
    CashMachine cashMachineThree = new CashMachine();

    @Test
    public void shouldReturnZeroWhenNoCashMachinesAdded(){
        int numberOfCashMachines = bank.getNumberOfCashMachines();
        assertEquals(0, numberOfCashMachines);
    }

    @Test
    public void shouldReturnZeroBalanceWhenNoCashMachinesAdded(){
        double balance = bank.cashMachinesBalance();
        assertEquals(0, balance);
    }

    @Test
    public void shouldReturnZeroValueOfWithdrawalsWhenNoCashMachinesAdded(){
        double withdrawals = bank.withdrawals();
        assertEquals(0, withdrawals);
    }

    @Test
    public void shouldReturnZeroValueOfDepositsWhenNoCashMachinesAdded(){
        double deposits = bank.deposits();
        assertEquals(0, deposits);
    }

    @Test
    public void shouldReturnOneWhenOneCashMachineAdded(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        int numberOfCashMachines = bank.getNumberOfCashMachines();
        assertEquals(1, numberOfCashMachines);
    }

    @Test
    public void shouldReturnthreeWhenthreeCashMachinesAdded(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);
        int numberOfCashMachines = bank.getNumberOfCashMachines();
        assertEquals(3, numberOfCashMachines);
    }

    @Test
    public void shouldReturnProperBalanceForOneCashMachine(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        double balance = bank.cashMachinesBalance();
        assertEquals(1500, balance, 0.01);
    }

    @Test
    public void shouldReturnProperBalanceForTwoCashMachines(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double balance = bank.cashMachinesBalance();
        assertEquals(4000, balance, 0.01);
    }

    @Test
    public void shouldReturnTwoWithdrawalsFromTwoCashMachines(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double numberOfWithdrawals = bank.numberOfWithdrawals();
        assertEquals(2, numberOfWithdrawals);
    }

    @Test
    public void shouldReturnFourDepositsInTwoCashMachines(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double numberOfDeposits = bank.numberOfDeposits();
        assertEquals(4, numberOfDeposits);
    }

    @Test
    public void shouldReturnZeroDepositsWhenNoDepositsMadeInTwoCashMachines(){
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double numberOfDeposits = bank.numberOfDeposits();
        assertEquals(0, numberOfDeposits);
    }

    @Test
    public void shouldReturnZeroWithdrawalssWhenNoWithdrawalsMade(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        bank.addCashMachine(cashMachineTwo);

        double numberOfWithdrawals = bank.numberOfWithdrawals();
        assertEquals(0, numberOfWithdrawals);
    }

    @Test
    public void shouldCountWithdrawalAverage(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double withdrawalAverage = bank.withdrawalAverage();
        assertEquals(750, withdrawalAverage, 0.01);
    }

    @Test
    public void shouldCountDepositAverage(){
        cashMachineOne.deposit(1000);
        cashMachineOne.deposit(1500);
        cashMachineOne.withdraw(1000);
        bank.addCashMachine(cashMachineOne);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.deposit(1500);
        cashMachineTwo.withdraw(500);
        bank.addCashMachine(cashMachineTwo);

        double depositAverage = bank.depositAverage();
        assertEquals(1375, depositAverage, 0.01);
    }
}
