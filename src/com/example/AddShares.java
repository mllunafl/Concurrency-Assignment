package com.example;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class AddShares implements Runnable {
    private TraderService traderService;

    public AddShares(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        System.out.println("Calling addShares");
        traderService.addShares("ABC", 10, 20);
        System.out.println("Done calling addShares");
    }
}
