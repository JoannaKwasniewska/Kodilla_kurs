package com.kodilla.basic_assertion.CashMachine;

import com.kodilla.interitance.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {

    private void assertEquals(int i, int totalBalance) {

    }

    @Test
    public void shouldGetNumberOfWithdrawals() {
        Bank bank = new Bank(2);
        bank.deposit(0, 100);
        bank.deposit(1, 200);
        bank.withdraw(0, 50);
        bank.withdraw(1, 25);
        assertEquals(2, bank.getNumberOfWithdrawals());
    }

    @Test
    public void shouldGetNumberOfDeposits() {
        Bank bank = new Bank(2);
        bank.deposit(0, 100);
        bank.deposit(1, 200);
        bank.withdraw(0, 50);
        bank.deposit(1, 150);
        assertEquals(3, bank.getNumberOfDeposits());
    }

    @Test
    public void shouldGetAverageWithdrawal() {
        Bank bank = new Bank(2);
        bank.deposit(0, 100);
        bank.withdraw(0, 50);
        bank.withdraw(1, 25);
        assertEquals(-37.5, bank.getAverageWithdrawal(), 0.01);
    }

    private void assertEquals(double v, double averageWithdrawal, double v1) {

    }


}
