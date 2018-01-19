package net.ed;

import java.util.ArrayList;

public class HealthyBurger extends Hamburger {

    private AdditionalItem item;
    protected ArrayList<AdditionalItem> items = new ArrayList<AdditionalItem>();

    public HealthyBurger(){
    }

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, "Wheat", price);
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
