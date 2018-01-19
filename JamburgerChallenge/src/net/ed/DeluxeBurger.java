package net.ed;

import java.util.ArrayList;

public class DeluxeBurger extends Hamburger {

    private AdditionalItem item;
    protected ArrayList<AdditionalItem> items = new ArrayList<AdditionalItem>();


    public DeluxeBurger(String name, String meat, String bread, double price, String chipsAndDrinks) {
        super(name, meat, bread, price);
    }


}
