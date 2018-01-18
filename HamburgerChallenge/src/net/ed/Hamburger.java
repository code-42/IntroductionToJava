package net.ed;

public class Hamburger {

    private String name;
    private String meat;
    private String bread;
    private double price;

    // add additional items not in constructor
    private String additionalItem1Name;
    private double additionalItem1Price;

    private String additionalItem2Name;
    private double additionalItem2Price;

    private String additionalItem3Name;
    private double additionalItem3Price;

    private String additionalItem4Name;
    private double additionalItem4Price;

    public Hamburger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
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

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", bread='" + bread + '\'' +
                ", price=" + price +
                '}';
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionalItem1Name = name;
        this.additionalItem1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionalItem2Name = name;
        this.additionalItem2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.additionalItem3Name = name;
        this.additionalItem3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.additionalItem4Name = name;
        this.additionalItem4Price = price;
    }

}
