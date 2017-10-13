package com.Kenechi;

import java.util.*;

/**
 * Created by kennydukor on 09/07/2017.
 */
public class Hamburger {
    Scanner stdin = new Scanner(System.in);
    private String breadRollType;
    private String meat;
    private double price;
    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double pepperPrice;
    private int additionName;
    private String additionToRemove;
    private double hamburgerPrice;
    private double VAT;

    public Hamburger(String breadRollType) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 200;
        this.lettucePrice = 500;
        this.tomatoPrice = 200;
        this.carrotPrice = 50;
        this.pepperPrice = 100;
    }

    public double meatType () {
        System.out.println("\n** What type of meat would you like?\n** We have Chicken, Turkey, Beef etc");
        Scanner stdin = new Scanner(System.in);
        this.meat = stdin.nextLine().toLowerCase();
        if(Objects.equals(this.meat, "chicken")){
            this.price += 3500;
            System.out.println("You chose Chicken as meat. cost: " + this.price);
        } else {
            this.price += 2500;
            System.out.println("You chose " + this.meat + " as meat. cost: " + this.price);
        }
        return this.price;
    }

    //this method adds item to the hamburger
    public int additions(){
        // constant value of prices
        System.out.println("====================");
        System.out.println("Press 1 for Lettuce\t\t" + this.lettucePrice);
        System.out.println("Press 2 for Carrot\t\t" + this.carrotPrice);
        System.out.println("Press 3 for Tomato\t\t" + this.tomatoPrice);
        System.out.println("Press 4 for Pepper\t\t" + this.pepperPrice);
        System.out.println("Press 5 for No more additions?");
        System.out.println("====================");

        Scanner stdin = new Scanner(System.in);
        int addition = stdin.nextInt();
        if (addition == 1) {
            this.price += this.lettucePrice;
            System.out.println("Lettuce added. New price is N" + this.price);
        }
        else if (addition == 2) {
            this.price += this.carrotPrice;
            System.out.println("Carrot added. New price is N" + this.price);
        }
        else if (addition == 3) {
            this.price += this.tomatoPrice;
            System.out.println("Tomato added. New price is N" + this.price);
        }
        else if (addition == 4) {
            this.price += this.pepperPrice;
            System.out.println("Pepper added. New price is N" + this.price);
        }
        else if (addition == 5) {
            System.out.println("No additions");
        }
        else {
            System.out.println("Sorry, we don't have " + addition + " in our store");
        }
        return addition;
    }

    public void caller() {
        int num;
        do {
            num = additions();
        }
        while (num < 5 && num > 0);
    }

    //this method add the VAT price and displays the total price of the chosen items
    public double totalPrice() {
        double totalPrice = this.price;
        System.out.println("the created price is " + totalPrice);
//        this.VAT = 20;
//        this.hamburgerPrice = this.price + 20;
//        System.out.println("\n**A VAT of N" + this.VAT + "is added.\n" +
//                "*The total Price for the hamburger is N" + this.hamburgerPrice);
        return totalPrice;
    }



    public double getPrice() {
        return this.price;
    }
}
