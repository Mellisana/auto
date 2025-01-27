package ru.netology.service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @BeforeMethod
    public void setup() {
        service = new CashbackHackService();
    }

    @Test
    public void shouldReturnZeroForAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnOneForAmount999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999ForAmount1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500ForNegativeAmount() {
        int amount = -500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000ForZeroAmount() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500ForLargeNumber() {
        int amount = 1000500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}