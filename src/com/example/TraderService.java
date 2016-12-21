package com.example;

import java.util.List;

/**
 * Created by LunaFlores on 12/21/16.
 */
public interface TraderService {
    void addShares(String stockName, int numShares, int price);
    Stock getStock(String stockName);
    Trade buyShares(String traderName, String sockName, int numShares, int price) throws SharesException;
    void clearStocks();
    List<Trade> getTrades();
}
