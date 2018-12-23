package com.company;
 
public class IceCream extends DessertItem  {
    protected int IceCream_cost;

    public IceCream(String name, int iceCream_cost) {
        super(name);
        IceCream_cost = iceCream_cost;
    }

    @Override
    public int getCost() {
        int cost = this.IceCream_cost;
        return cost;
    }
}
