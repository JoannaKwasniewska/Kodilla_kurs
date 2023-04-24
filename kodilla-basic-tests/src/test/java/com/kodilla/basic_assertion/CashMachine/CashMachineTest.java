package com.kodilla.basic_assertion.CashMachine;


import com.kodilla.interitance.bank.homework.Bank;
import com.kodilla.interitance.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTest {
    @Test
    public void shouldGetBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.deposit(200);
        assertEquals(250, cashMachine.getBalance());
    }

    @Test
    public void shouldGetNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.deposit(200);
        assertEquals(3, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldGetNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.deposit(200);
        assertEquals(2, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldGetNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.deposit(200);
        assertEquals(1, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldGetAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.deposit(200);
        assertEquals(150, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldGetAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.withdraw(50);
        cashMachine.withdraw(25);
        assertEquals(-37.5, cashMachine.getAverageWithdrawal(), 0.01);
    }
}


