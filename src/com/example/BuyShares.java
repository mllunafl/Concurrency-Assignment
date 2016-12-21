package com.example;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class BuyShares implements Runnable {
    TraderService traderService = new TraderServiceImpl();

    public BuyShares(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        System.out.println("Calling buyShares method");
        try {
            traderService.buyShares("Jack", "ABC", 5, 20);
        } catch (SharesException e) {
            e.printStackTrace();
        }
        System.out.println("Done calling buyShares method");
    }
}
