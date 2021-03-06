package net.ed;

/**
 * Section 8 Lecture 50 OOP Challenge
 *
 * The purpose of the application is to help a ficticious company called Bills Burgers to manage
 * their process of selling hamburgers.
 * Our application will help Bill to select types of burgers, some of the additional items (additions) to
 * be added to the burgers and pricing.
 * We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
 * Bills store.
 *
 * The basic hamburger should have the following items.
 * bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
 * the customer can select to be added to the burger. Each one of these items gets charged an additional
 * price so you need some way to track how many items got added and to calculate the price (for the base
 * burger and all the additions).
 * This burger has a base price and the additions are all seperately priced.
 *
 * Create a Hamburger class to deal with all the above.
 * The constructor should only include the roll type, meat and price.
 * Also create two extra varieties of Hamburgers (classes) to cater for
 *
 * a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
 * The healthy burger can have a total of 6 items (Additions) in total.
 * hint:  you probably want to process the 2 additional items in this new class, not the base class,
 * since the 2 additions are only appropriate for this new class.
 *
 * b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
 * hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
 * object is created, and then prevent other additions being made.
 *
 *  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
 * plus all additionals, each showing the addition name, and addition price, and a grand total for the burger.
 *
 * For the two additional classes this may require you to be looking at the base class for pricing and then
 * adding totals onto that.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        double cheezePrice = .25;

        Hamburger basicBurger = new Hamburger("Bill's Basic", "ham", "wheat", 5.00);

        basicBurger.addItem(new AdditionalItem("cheeze", cheezePrice));
        basicBurger.addItem(new AdditionalItem("bacon", 1.00));
        basicBurger.addItem(new AdditionalItem("mushrooms", .25));

        System.out.println(basicBurger.getOrder() + "\nTotal price is $" +
        basicBurger.getTotal());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", 5.00);
        healthyBurger.addItem(new AdditionalItem("cheeze", .25));
        healthyBurger.addItem(new AdditionalItem("bacon", 1.00));
        healthyBurger.addItem(new AdditionalItem("mushrooms", .25));
        healthyBurger.addItem(new AdditionalItem("Mustard", .25));
        healthyBurger.addItem(new AdditionalItem("Mushrooms", 1.00));
        System.out.println("Total Healthy Burger price is  " + healthyBurger.getTotal());

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "ham", "wheat", 5.00);
        deluxeBurger.addItem(new AdditionalItem("cheeze", .25));
        deluxeBurger.addItem(new AdditionalItem("bacon", 1.00));
        deluxeBurger.addItem(new AdditionalItem("mushrooms", .25));
        deluxeBurger.addItem(new AdditionalItem("Mustard", .25));
        deluxeBurger.addItem(new AdditionalItem("Mushrooms", 1.00));
        System.out.println("Total Deluxe Burger price is  " + healthyBurger.getTotal());

    }
}
