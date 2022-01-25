package edu.ren.hackerrank.stock;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StockStatisticImplTest {
    StockStatistic stockStatistic = new StockStatisticImpl();

    @Test
    public void testAveragePrice() throws Exception {
        stockStatistic.push("AAPL", 50.0);
        stockStatistic.push("TCS", 170.0);
        stockStatistic.push("AAPL", 100.0);
        stockStatistic.push("TCS", 130.0);
        stockStatistic.push("AAPL", 75.0);

        assertThat(stockStatistic.getAveragePrice("TCS"), is(150.0));
        assertThat(stockStatistic.getTickCount("TCS"), is(2));

        assertThat(stockStatistic.getAveragePrice("AAPL"), is(75.0));
        assertThat(stockStatistic.getTickCount("AAPL"), is(3));

    }

    @Test
    public void testAveragePrice_MultiThreaded() throws Exception {
        Callable<Integer>[] callables = new Callable[5];
        callables[0] = () -> {
            stockStatistic.push("AAPL", 50.0);
            return 0;
        };
        callables[1] = () -> {
            stockStatistic.push("TCS", 170.0);
            return 0;
        };
        callables[2] = () -> {
            stockStatistic.push("AAPL", 100.0);
            return 0;
        };
        callables[3] = () -> {
            stockStatistic.push("TCS", 130.0);
            return 0;
        };
        callables[4] = () -> {
            stockStatistic.push("AAPL", 75.0);
            return 0;
        };
        ExecutorService executorService = Executors.newFixedThreadPool(25);
        List<Callable<Integer>> callableList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            callableList.add(callables[i % 5]);
        }
        executorService.invokeAll(callableList);
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        assertThat(stockStatistic.getTickCount("TCS"), is(200));
        assertThat(stockStatistic.getTickCount("AAPL"), is(300));

        assertThat(stockStatistic.getAveragePrice("TCS"), is(150.0));

        assertThat(stockStatistic.getAveragePrice("AAPL"), is(75.0));

    }
}