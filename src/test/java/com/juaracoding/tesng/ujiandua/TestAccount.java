package com.juaracoding.tesng.ujiandua;

import com.juaracoding.ujiandua.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAccount {

    Account account;

    @BeforeMethod
    public void setUp(){
        account = new Account();
    }

    @Test
    @Parameters({"acc_no", "name", "amount"})
    public void testInsert(int acc_no, String name, double amount) {
        account.insert(acc_no, name, amount);
        int expectedAcc = 1234;
        Assert.assertEquals(acc_no, expectedAcc);

        String expectedName = "Azis";
        Assert.assertEquals(name, expectedName);

        double expectedAmt = 1000;
        Assert.assertEquals(amount, expectedAmt);
    }

    @Test
    @Parameters({"amt"})
    public void testDeposit(double amt){
        account.deposit(2000);

        double expectedAmt = 2000;
        Assert.assertEquals(amt, expectedAmt);
    }

    @Test
    @Parameters({"amount", "amt"})
    public void testWithdraw(double amount, double amt){
        account.withdraw(amt);
        double expectedAmt = amount - amt;
        Assert.assertEquals(amt,expectedAmt);
    }

    @Test
    @Parameters({"amount"})
    public void testCheckBalance(double amount){
        account.checkBalance();
        double expectedBalance = amount;
        Assert.assertEquals(amount, expectedBalance);
    }

    @Test
    @Parameters({"acc_no", "name", "amount"})
    public void testDisplay(int acc_no, String name, double amount){
        account.insert(acc_no, name, amount);
        account.display();
        int actualAcc = acc_no;
        int expetedAcc = acc_no;
        String actualName = name;
        String expectedName = name;
        double actualAmount = amount;
        double expectedAmount = amount;
        Assert.assertEquals(actualAcc, expetedAcc);
        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualAmount, expectedAmount);
    }

}
