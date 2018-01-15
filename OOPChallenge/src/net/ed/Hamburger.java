package net.ed;

public class Hamburger {

    private String name;
    private String meat;
    private String bread;
    private double price;

    // The constructor should only include the roll type, meat and price.
    public Hamburger(String meat, String bread, double price) {
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

    public String getOrder(){
        String order =  this.getMeat() + " " +
                        this.getBread() + " " +
                        this.getPrice();
        return order;
    }
}
