package net.ed;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String name;
    private String meat;
    private String bread;
    private double price;
    private List<AdditionalItem> item = new ArrayList<AdditionalItem>();

    // The constructor should only include the roll type, meat and price.
    public Hamburger(String meat, String bread, double price) {
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
        this.item.add(item);
//        this.price += price;

    }

    public String getOrder(){
        String order =  this.getMeat() + " " +
                        this.getBread() + " " +
                        this.getPrice();
        return order;
    }
}
