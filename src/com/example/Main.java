package com.example;

public class Main {

    public static void main(String[] args) {
        TraderService traderService = new TraderServiceImpl();

        AddShares addShares = new AddShares(traderService);
        Thread thread1 = new Thread(addShares);
        thread1.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GetStock getStock = new GetStock(traderService);
        Thread thread2 = new Thread(getStock);
        thread2.start();
    }
}
