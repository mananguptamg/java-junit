package com.bridgelabz.junittesting;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountTest {
    private static BankAccount bankAccount;

    @BeforeAll
    public static void setup(){
        bankAccount = new BankAccount();
        bankAccount.balance = 0.0;
    }

    @Test
    @Order(1)
    public void depositTest(){
        Assertions.assertEquals(2000, bankAccount.deposit(2000));
        Assertions.assertEquals(-1,bankAccount.deposit(-100));
    }

    @Test
    @Order(2)
    public void getBalanceTest(){
        Assertions.assertEquals(2000,bankAccount.getBalance());
    }

    @Test
    @Order(3)
    public void withdrawTest(){
        Assertions.assertEquals(1500, bankAccount.withdraw(500));
        Assertions.assertEquals(-1, bankAccount.withdraw(2000));
    }
}
    