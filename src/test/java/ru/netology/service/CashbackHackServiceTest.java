package ru.netology.service;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void testShouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldAmountNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -500;

        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testShouldAmountLargeNumber() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000500;

        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}