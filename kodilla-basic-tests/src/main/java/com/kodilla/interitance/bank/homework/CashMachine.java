package com.kodilla.interitance.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            int[] newTransactions = new int[this.size + 1];
            System.arraycopy(this.transactions, 0, newTransactions, 0, this.size);
            newTransactions[this.size] = amount;
            this.transactions = newTransactions;
            this.size++;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && this.getBalance() >= amount) {
            int[] newTransactions = new int[this.size + 1];
            System.arraycopy(this.transactions, 0, newTransactions, 0, this.size);
            newTransactions[this.size] = -amount;
            this.transactions = newTransactions;
            this.size++;
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : this.transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return this.size;
    }

    public int getNumberOfDeposits() {
        int count = 0;
        for (int transaction : this.transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int transaction : this.transactions) {
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (int transaction : this.transactions) {
            if (transaction > 0) {
                sum += transaction;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (int transaction : this.transactions) {
            if (transaction < 0) {
                sum += transaction;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}

