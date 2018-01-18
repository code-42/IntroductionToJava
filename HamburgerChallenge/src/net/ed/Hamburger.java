package net.ed;

public class Hamburger {

    private String name;
    private String meat;
    private String bread;
    private double price;

    // additional items not in constructor
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


    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " on a " +
                this.bread + ", price is "  +
                this.price);

        if(this.additionalItem1Name != null) {
            hamburgerPrice += this.additionalItem1Price;
            System.out.println("Added " + this.additionalItem1Name +
                    " for an extra " + this.additionalItem1Price);
        }

        if(this.additionalItem2Name != null) {
            hamburgerPrice += this.additionalItem2Price;
            System.out.println("Added " + this.additionalItem2Name +
                    " for an extra " + this.additionalItem2Price);
        }

        if(this.additionalItem3Name != null) {
            hamburgerPrice += this.additionalItem3Price;
            System.out.println("Added " + this.additionalItem3Name +
                    " for an extra " + this.additionalItem3Price);
        }

        if(this.additionalItem4Name != null) {
            hamburgerPrice += this.additionalItem4Price;
            System.out.println("Added " + this.additionalItem4Name +
                    " for an extra " + this.additionalItem4Price);
        }

        return hamburgerPrice;
    }

    public String getAdditionalItem1Name() {
        return additionalItem1Name;
    }

    public double getAdditionalItem1Price() {
        return additionalItem1Price;
    }

    public String getAdditionalItem2Name() {
        return additionalItem2Name;
    }

    public double getAdditionalItem2Price() {
        return additionalItem2Price;
    }

    public String getAdditionalItem3Name() {
        return additionalItem3Name;
    }

    public double getAdditionalItem3Price() {
        return additionalItem3Price;
    }

    public String getAdditionalItem4Name() {
        return additionalItem4Name;
    }

    public double getAdditionalItem4Price() {
        return additionalItem4Price;
    }
}
