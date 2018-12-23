package com.company;

public class Sundae extends IceCream  {
    protected int topping_cost ;
    protected String topping_name ;

    public Sundae(String name, int iceCream_cost, String topping_name, int topping_cost) {
        super(name, iceCream_cost);
        this.topping_cost = topping_cost;
        this.topping_name = topping_name;

    }

    @Override
    public int getCost() {
        int cost = this.topping_cost + this.IceCream_cost;
        return cost;
    }
}
