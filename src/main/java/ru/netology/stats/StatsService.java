package ru.netology.stats;

public class StatsService {

    public int getMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long getAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long getAvgSales(long[] sales) {
        long sum = getAllSales(sales);
        return sum / sales.length;
    }

    public int countLessThanAvg(long[] sales) {
        long avg = getAvgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < avg) {
                months++;

            }
        }
        return months;
    }

    public int countMoreThanAvg(long[] sales) {
        long avg = getAvgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avg) {
                months++;

            }
        }
        return months;
    }
}
