package com.company;

public class Candy extends DessertItem  {
    protected double weight;
    protected int price_per_pound ;

    public Candy(String name, double weight, int price_per_pound) {
        super(name);
        this.weight = weight;
        this.price_per_pound = price_per_pound;
    }

    @Override
    public int getCost() {
        double cost = this.weight * this.price_per_pound ;
        return (int)cost;
    }
}
