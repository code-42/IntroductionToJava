package net.ed;

public class DeluxeBurger extends Hamburger {

    private String chipsAndDrinks;

    public DeluxeBurger(String name, String meat, String bread, double price, String chipsAndDrinks) {
        super(name, meat, bread, price);
        this.chipsAndDrinks = chipsAndDrinks;
    }


}
