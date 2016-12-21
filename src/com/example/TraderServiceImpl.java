package com.example;

import sun.plugin2.message.Message;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class TraderServiceImpl implements TraderService {
    private Map<String, Stock> stocks = new HashMap<>();
    private List<Trade> trades = new ArrayList<>();

    @Override
    public synchronized void addShares(String stockName, int numShares, int price) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Stock stock = stocks.get(stockName);
        if (stock == null) {
            Stock stock2 = new Stock(stockName, numShares, price);
            stocks.put(stockName, stock2);
        } else {
            int newShares = stock.getShares() + numShares;
            Stock stock2 = new Stock(stockName, newShares, price);
            stocks.put(stockName, stock2);
        }
    }

    @Override
    public synchronized Stock getStock(String stockName) {
        return stocks.get(stockName);
    }

    @Override
    public Trade buyShares(String traderName, String sockName, int numShares, int price) throws SharesException {
        synchronized (this) {
            Stock stock = stocks.get(sockName);
            int newShares = stock.getShares() - numShares;
            if (stock == null){
                throw new SharesException();
            }
            if (stock.getShares() > numShares) {
                Stock stock2 = new Stock(sockName, price, newShares);
                stocks.put(sockName, stock2);
            } else throw new SharesException();
        }
            Trade trade = new Trade(sockName,price,numShares,traderName, LocalDate.now());
            trades.add(trade);
        return trade;
    }

    @Override
    public void clearStocks() {
        stocks.clear();
    }

    @Override
    public List<Trade> getTrades() {
        return trades;
    }
}
