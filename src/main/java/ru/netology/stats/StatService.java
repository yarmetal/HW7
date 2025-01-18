package ru.netology.stats;

public class StatService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
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

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
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
