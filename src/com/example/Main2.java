package com.example;

public class Main2 {

    public static void main(String[] args) {
        TraderService traderService = new TraderServiceImpl();

//        AddShares addShares = new AddShares(traderService);
//        Thread thread1 = new Thread(addShares);
//        thread1.start();


        GetStock getStock2 = new GetStock(traderService);
        Thread thread3 = new Thread(getStock2);
        thread3.start();


        AddShares addShares2 = new AddShares(traderService);
        Thread thread4 = new Thread(addShares2);
        thread4.start();

        BuyShares buyShares = new BuyShares(traderService);
        Thread thread5 = new Thread(buyShares);
        thread5.start();



        while (traderService.getTrades().size() != 1 ){
            System.out.println(traderService.getTrades());
        }
        System.out.println(traderService.getTrades());
    }
}
