package net.ed;

import java.util.ArrayList;

public class DeluxeBurger extends Hamburger {

    private AdditionalItem item;
    protected ArrayList<AdditionalItem> items = new ArrayList<AdditionalItem>();

    public DeluxeBurger(String name, String meat, String bread, double price) {
        super(name, meat, bread, price);
    }

    public void addItem(AdditionalItem item){
        this.item = item;
        this.items.add(this.item);
    }

    public DeluxeBurger(){
    }

    public DeluxeBurger(String meat, double price) {
        super("Healthy Burger", meat, "Wheat", price);
    }


}
