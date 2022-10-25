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
            for (double operation : cashMachine.getTransactions()) {
                if (operation < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numberOfDeposits() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double operation : cashMachine.getTransactions()) {
                if (operation > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double withdrawalAverage() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double operation : cashMachine.getTransactions()) {
                if (operation < 0) {
                    sum += operation;
                }
            }
        }
        return -sum / numberOfWithdrawals();
    }

    public double depositAverage() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double operation : cashMachine.getTransactions()) {
                if (operation > 0) {
                    sum += operation;
                }
            }
        }
        return sum / numberOfDeposits();
    }

    public int getNumberOfCashMachines() {
        return numberOfCashMachines;
    }
}
