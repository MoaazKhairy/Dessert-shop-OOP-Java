package com.company;

import java.util.ArrayList;

public class Checkout {
    protected ArrayList<DessertItem> DessertItems;

    public Checkout() {
        this.DessertItems = new ArrayList<DessertItem>() ;
    }

    public int numberOfItems(){
        int number = this.DessertItems.size();
        return number;
    }

    public void enterItem(DessertItem item){
        this.DessertItems.add(item);
    }

    public void clear(){
        this.DessertItems.clear();
    }

    public int totalCost(){
        int sum =0;
        for (int i = 0 ; i<this.DessertItems.size() ; i++)
        {
            sum += this.DessertItems.get(i).getCost();
        }
        return sum;
    }

    public int totalTax(){
        int Tax = (int)Math.round(this.totalCost()*DessertShoppe.TAX_RATE/100);
        return Tax;
    }

    public String toString(){
        String str = String.format("%1$" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s\n" , DessertShoppe.STORE_NAME);
        str += String.format("%1$" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s\n\n" , "--------------------");
        for (int i = 0 ; i<this.DessertItems.size() ; i++)
        {
            if(this.DessertItems.get(i) instanceof Candy) {
                str += ((Candy) this.DessertItems.get(i)).weight + " lbs. @ " + ((Candy) this.DessertItems.get(i)).price_per_pound + " /lb.\n";
        }
        else if(this.DessertItems.get(i) instanceof Cookie){
            str += ((Cookie) this.DessertItems.get(i)).number + " @ " + ((Cookie) this.DessertItems.get(i)).price_per_dozen + " /dz.\n";
            }
        else if(this.DessertItems.get(i) instanceof Sundae){
            str += ((Sundae) this.DessertItems.get(i)).topping_name + " Sundae with\n" ;
            }

            str += String.format("%1$" + (-1 * DessertShoppe.MAX_ITEM_NAME_SIZE ) + "s%2$" + DessertShoppe.COST_WIDTH +"s\n",this.DessertItems.get(i).getName() , DessertShoppe.cents2dollarsAndCents(this.DessertItems.get(i).getCost()));
        }

        str += String.format("\n%1$"+ (-DessertShoppe.MAX_ITEM_NAME_SIZE ) + "s%2$" + DessertShoppe.COST_WIDTH + "s\n","Tax",DessertShoppe.cents2dollarsAndCents(this.totalTax()));

        str += String.format("%1$"+ (-DessertShoppe.MAX_ITEM_NAME_SIZE ) + "s%2$" + DessertShoppe.COST_WIDTH + "s\n",
                "Total Cost",DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax()));


        return str;
    }
}
   /*   M & M Dessert Shoppe
              --------------------

        Strawberry Ice Cream       1.45
        Caramel Sundae with
        Vanilla Ice Cream          1.55
              1.33 lbs. @ .89 /lb.
        Gummy Worms                1.18
        4 @ 3.99 /dz.
        Chocolate Chip Cookies     1.33
        1.50 lbs. @ 2.09 /lb.
        Salt Water Taffy           3.14
        3.00 lbs. @ 1.09 /lb.
        Candy Corn                 3.27

        Tax                         .77
        Total Cost                12.69

 */