package com.Kenechi;

/**
 * Created by kennydukor on 13/07/2017.
 */
public class healthyBurger extends Hamburger{

    private int additionName2;
    //private String additionToRemove2;
    private double yeastPrice;
    private double olivePrice;
    private double price2;
    private double hamburgerPrice;
    private double VAT;

    public healthyBurger(String breadRollType, double price) {
        super(breadRollType);
        this.additionName2 = additionName2;
        this.hamburgerPrice = hamburgerPrice;
        this.VAT = VAT;
        this.olivePrice = 700;
        this.yeastPrice = 600;
    }

//    public healthyBurger(String meat,  boolean brownRyeBreadRoll) {
//        super(meat, brownRyeBreadRoll);
//        this.brownRyeBreadRoll = brownRyeBreadRoll;
//        if (brownRyeBreadRoll) {
//            // constant value of prices
//            this.olivePrice = 700;
//            this.yeastPrice = 600;
//            this.price2 = getPrice();
//            System.out.println("We have Healthy Burger with Olive Oil and Yeast additions, at an added cost");
//            System.out.println("ADDITIONS\tCOST");
//            System.out.println("=================");
//            System.out.println("Olive\t\t" + this.olivePrice);
//            System.out.println("Yeast\t\t" + this.yeastPrice);
//        }
//    }

    //this method adds item to the hamburger


    @Override
    public double meatType() {
        return super.meatType();
    }


    public void healthyAdditions () {
        System.out.println("\n**Healthy Additions**");
        System.out.println("=================");
        System.out.println("Press 5 for Olive\t\t" + this.olivePrice);
        System.out.println("Press 6 for Yeast\t\t" + this.yeastPrice);
        System.out.println("=================");
        this.additionName2 = stdin.nextInt();
        if (this.additionName2 == 6) {
            this.price2 += this.yeastPrice;
            System.out.println("Yeast added. New price is N" + this.price2);
        }
        else if (this.additionName2 == 5) {
            this.price2 += this.olivePrice;
            System.out.println("Olive added. New price is N" + this.price2);
        }
        else {
            System.out.println("Sorry, we don't have " + this.additionName2 + " in our store");
        }

    }
    @Override
    public int additions() {
        return super.additions();
    }


    //this method add the VAT price and displays the total price of the chosen items
//    public void totalPrice() {
//        this.VAT = 20;
//        this.hamburgerPrice = this.price2 + this.VAT;
//        System.out.println("A VAT of N" + this.VAT + ". The total Price for the hamburger is N" + this.hamburgerPrice + ". Thank you for your patronage.");
//    }

}
