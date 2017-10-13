package com.Kenechi;

/**
 * Created by kennydukor on 15/07/2017.
 */
public class deluxeHamburger extends Hamburger {
    private double chipsPrice;
    private double drinksPrice;
    private double deluxeHamburgerPrice;

    public deluxeHamburger(String breadRollType) {
        super(breadRollType);
        this.deluxeHamburgerPrice = deluxeHamburgerPrice;
        this.chipsPrice = 500;
        this.drinksPrice = 500;

    }
//
//    @Override
//    public void totalPrice() {
//        super.totalPrice();
//    }

    public double orderDeluxeHamburger() {
        double jennifer = totalPrice();
        System.out.println("You made it a Deluxe Hamburger\n");
        System.out.println("ITEM\tPRICE");
        System.out.println("=============");
        System.out.println("Chip\t" + this.chipsPrice);
        System.out.println("Drinks\t" + this.drinksPrice);
        this.deluxeHamburgerPrice = jennifer + this.chipsPrice + this.drinksPrice;
        System.out.println("The price for the Deluxe Hamburger is " + this.deluxeHamburgerPrice);

        return this.deluxeHamburgerPrice;
    }

}
