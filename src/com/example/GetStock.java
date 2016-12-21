package com.example;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class GetStock implements Runnable {
    private TraderService traderService;

    public GetStock(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        System.out.println("Calling getStock");
         Stock stock =  traderService.getStock("ABC");
        System.out.println("Done calling getStock " + stock);
    }
}
