package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int numberOfTransactions;

    public CashMachine(){
        transactions = new double[0];
        numberOfTransactions = 0;
    }

    public double balance(){
        double sum = 0;
        for(int i = 0; i < transactions.length; i++){
            sum += transactions[i];
        }
        return sum;
    }

    public int getNumberOfTransactions(){
        return numberOfTransactions;
    }

    public void deposit(double value){
        numberOfTransactions++;
        double[] newTable = new double[numberOfTransactions];
        System.arraycopy(transactions, 0, newTable, 0, transactions.length);
        newTable[numberOfTransactions - 1] = value;
        transactions = newTable;
    }

    public double deposits(){
        double sum = 0;
        for(int i = 0; i < transactions.length; i++){
            if(transactions[i] > 0){
                sum += transactions[i];
            }
        }
        return sum;
    }

    public int numberOfDeposits(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] > 0){
                count++;
            }
        }
        return count;
    }

    public void withdraw(double value){
        if(value <= balance()) {
            numberOfTransactions++;
            double[] newTable = new double[numberOfTransactions];
            System.arraycopy(transactions, 0, newTable, 0, transactions.length);
            newTable[numberOfTransactions - 1] = -value;
            transactions = newTable;
        } else {
            System.out.println("Brak pieniędzy w bankomacie.");
        }
    }

    public double withdrawals(){
        double sum = 0;
        for(int i = 0; i < transactions.length; i++){
            if(transactions[i] < 0){
                sum += transactions[i];
            }
        }
        return -sum;
    }

    public int numberOfWithdrawals(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0){
                count++;
            }
        }
        return count;
    }

    public boolean canWithdraw(double value){
        return value <= balance();
    }
}
