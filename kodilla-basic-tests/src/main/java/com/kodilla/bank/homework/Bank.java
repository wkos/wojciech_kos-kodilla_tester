package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        cashMachines = new CashMachine[0];
        numberOfCashMachines = 0;
    }

    public void addCashMachine(CashMachine cashMachine){
        numberOfCashMachines++;
        CashMachine[] newTable = new CashMachine[numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTable, 0, cashMachines.length);
        newTable[numberOfCashMachines - 1] = cashMachine;
        cashMachines = newTable;
    }

    public double cashMachinesBalance() {
        double sum = 0;
        for (CashMachine cashmachine : cashMachines) {
            sum += cashmachine.balance();
        }
        return sum;
    }

    public int numberOfWithdrawals() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.numberOfWithdrawals();
        }
        return count;
    }

    public int numberOfDeposits() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.numberOfDeposits();
        }
        return count;
    }

    public double withdrawals() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.withdrawals();
        }
        return sum;
    }

    public double withdrawalAverage() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.numberOfWithdrawals();
        }
        return withdrawals() / count;
    }

    public double deposits() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.deposits();
        }
        return sum;
    }
    public double depositAverage() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.numberOfDeposits();
        }
        return deposits() / numberOfDeposits();
    }

    public int getNumberOfCashMachines() {
        return numberOfCashMachines;
    }
}
