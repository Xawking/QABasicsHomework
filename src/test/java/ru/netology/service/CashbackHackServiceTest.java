package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {
    @Test
    public void belowBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void aboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1200);
        int expected = 800;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void equalsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void aboveBoundaryButDividableByBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(10000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }


}