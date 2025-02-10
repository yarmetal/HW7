package ru.netology.stats;

public class StatService {

    public long sumAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum = (int) (sum + sale);
        }
        return sum;
    }

    public double averageSumSales(int[] sales) {
        double averageSum = 0;
        for (int sale : sales) {
            averageSum = (averageSum + sale);
        }
        return averageSum / sales.length;
    }

    public long maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int belowAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int sale : sales) {
            if (sale < averageSum)
                belowAverageMonth += 1;
        }
        return belowAverageMonth;
    }

    public long salesAboveAverage(int[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int sale : sales) {
            if (sale > averageSum)
                aboveAverageMonth += 1;
        }
        return aboveAverageMonth;

    }
}
