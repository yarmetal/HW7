package ru.netology.stats;

public class StatService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageSumSales(int[] sales) {
        double averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum = (averageSum + sales[i]);
        }
        return averageSum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int belowAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum)
                belowAverageMonth += 1;
        }
        return belowAverageMonth;
    }

    public int salesAboveAverage(int[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum)
                aboveAverageMonth += 1;
        }
        return aboveAverageMonth;
    }
}
