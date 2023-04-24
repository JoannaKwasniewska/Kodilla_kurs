package com.kodilla.interitance.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private CashMachine[] cash;

    public Bank(int numberOfCashMachines) {
        this.cashMachines = new CashMachine[numberOfCashMachines];
        for (int i = 0; i < numberOfCashMachines; i++) {
            this.cashMachines[i] = new CashMachine();
        }
    }

    public void deposit(int cashMachineNumber, int amount) {
        if (cashMachineNumber >= 0 && cashMachineNumber < this.cashMachines.length) {
            this.cashMachines[cashMachineNumber].deposit(amount);
        }
    }

    public void withdraw(int cashMachineNumber, int amount) {
        if (cashMachineNumber >= 0 && cashMachineNumber < this.cashMachines.length) {
            this.cashMachines[cashMachineNumber].withdraw(amount);
        }
    }

    public int getTotalBalance() {
        int balance = 0;
        for (CashMachine cashMachine : this.cash) ;


        return balance;
    }

    public int getNumberOfWithdrawals() {
        return 0;
    }

    public int getNumberOfDeposits() {

        return 0;
    }

    public double getAverageWithdrawal() {
        return 0;
    }
}
