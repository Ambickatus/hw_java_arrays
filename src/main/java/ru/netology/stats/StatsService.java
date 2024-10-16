package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sumInYear  = 0;
        for (int i = 0; i < sales.length; i++) {
            sumInYear+=sales[i];
        }
        return sumInYear;
    }

    public long average(long[] sales) {
        long sumInYear  = 0;
        for (int i = 0; i < sales.length; i++) {
            sumInYear+=sales[i];
        }
        return sumInYear/12;
    }

    public int theHighestSale(long[] sales) {
        int numOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[numOfMonth])
                numOfMonth = i;
        }
        return numOfMonth+1;
    }

    public int theLeastSale(long[] sales) {
        int numOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[numOfMonth])
                numOfMonth = i;
        }
        return numOfMonth+1;
    }

    public int numLessThanAverageSales(long[] sales) {
        int numOfMonthes = 0;
        long averageSale = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSale)
                numOfMonthes++;
        }
        return numOfMonthes;
    }

    public int numBiggerThanAverageSales(long[] sales) {
        int numOfMonthes = 0;
        long averageSale = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSale)
                numOfMonthes++;
        }
        return numOfMonthes;
    }
}
