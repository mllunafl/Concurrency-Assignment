package com.example;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class Stock {
    private final String name;
    private final int price;
    private final int shares;

    public Stock(String name, int price, int shares) {
        this.name = name;
        this.price = price;
        this.shares= shares;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getShares() {
        return shares;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shares=" + shares +
                '}';
    }
}
