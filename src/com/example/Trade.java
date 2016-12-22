package com.example;

import java.time.LocalDate;

/**
 * Created by LunaFlores on 12/21/16.
 */
public class Trade extends Stock {
    private final String personName;
    private final LocalDate dateTime;

    public Trade(String name, int price, int shares, String personName, LocalDate dateTime) {
        super(name, price, shares);
        this.personName = personName;
        this.dateTime = dateTime;
    }

    public String getPersonName() {
        return personName;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "personName='" + personName + '\'' +
                ", dateTime=" + dateTime + super.toString()+
                '}';
    }
}
