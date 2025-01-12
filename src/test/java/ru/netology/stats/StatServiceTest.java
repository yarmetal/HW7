package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    void statSumAllSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumAllSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void statAverageSumSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSumSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void statMaxMonth() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void statMinMonth() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void statSalesBelowAverage() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void statSalesAboveAverage() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(actual, expected);
    }
}

