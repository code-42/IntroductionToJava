package net.ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hamburger {

    private String name;
    private String meat;
    private String bread;
    private double price;
    private AdditionalItem item;
    protected ArrayList<AdditionalItem> items = new ArrayList<AdditionalItem>();

    // The constructor should only include the roll type, meat and price.
    public Hamburger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    // Default constructor
    public Hamburger() {
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }

    public void addItem(AdditionalItem item){
        this.item = item;
        this.items.add(this.item);
    }

    public String getOrder(){
        String order =  this.getName() + " " +
                        this.getMeat() + " " +
                        this.getBread() + " " +
                        this.getPrice();

        for (int i = 0; i < items.size(); i++) {
            order += this.items.get(i).toString();
        }

        return order;
    }

    public double getTotal(){
        double orderTotal = this.getPrice();

        for (int i = 0; i < items.size(); i++) {
            orderTotal += this.items.get(i).getPrice();
        }

        return orderTotal;
    }
}
