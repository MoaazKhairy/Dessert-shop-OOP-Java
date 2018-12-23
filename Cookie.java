package com.company;

public class Cookie extends DessertItem {
    protected int number ;
    protected int price_per_dozen ;

    public Cookie(String name, int number, int price_per_dozen) {
        super(name);
        this.number = number;
        this.price_per_dozen = price_per_dozen;
    }

    @Override
    public int getCost() {
        int cost = this.number * this.price_per_dozen /12;
        return cost;
    }
}
