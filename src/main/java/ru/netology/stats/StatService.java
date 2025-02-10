package ru.netology.stats;

public class StatService {

    public long sumAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum = (int) (sum + sale);
        }
        return sum;
    }

    public double averageSumSales(long[] sales) {
        double averageSum = 0;
        for (long sale : sales) {
            averageSum = (averageSum + sale);
        }
        return averageSum / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int belowAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSum)
                belowAverageMonth += 1;
        }
        return belowAverageMonth;
    }

    public long salesAboveAverage(long[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSum)
                aboveAverageMonth += 1;
        }
        return aboveAverageMonth;

    }
}
