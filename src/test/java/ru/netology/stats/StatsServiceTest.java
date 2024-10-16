package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumOfSalesInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, expected);
    }

    @Test
    public void testAverageSalesInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, expected);
    }

    @Test
    public void testHighestSaleInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.theHighestSale(sales);

        Assertions.assertEquals(expected, expected);
    }

    @Test
    public void testLeastSaleInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.theLeastSale(sales);

        Assertions.assertEquals(expected, expected);
    }

    @Test
    public void testLessThanAverageSaleInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numLessThanAverageSales(sales);

        Assertions.assertEquals(expected, expected);
    }

    @Test
    public void testBiggerThanAverageSaleInYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numBiggerThanAverageSales(sales);

        Assertions.assertEquals(expected, expected);
    }
}
