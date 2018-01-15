package net.ed;

public class HealthyBurger extends Hamburger {

    private String additionalItem;

    public HealthyBurger(String meat, String bread, double price, String additionalItem) {
        super(meat, bread, price);
        this.additionalItem = additionalItem;
    }
}
