package net.ed;

public class DeluxeBurger extends Hamburger {

    private String chipsAndDrinks;

    public DeluxeBurger(String meat, String bread, double price, String chipsAndDrinks) {
        super(meat, bread, price);
        this.chipsAndDrinks = chipsAndDrinks;
    }


}
