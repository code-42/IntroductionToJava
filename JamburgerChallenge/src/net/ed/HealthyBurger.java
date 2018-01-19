package net.ed;

public class HealthyBurger extends Hamburger {

    private String additionalItem;

    public HealthyBurger(String name,String meat, String bread, double price, String additionalItem) {
        super(name, meat, bread, price);
        this.additionalItem = additionalItem;
    }
}
