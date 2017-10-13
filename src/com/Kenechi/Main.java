package com.Kenechi;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by kennydukor on 09/07/2017.
 */
public class Main {
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        //to distinguish selected hamburger package from other initialized hamburger, the bread type bolean value should be chosen as such
        System.out.println("Welcome to Kenny's Kitchen. What type of Roll would you like? ");
        System.out.println("Press 1 for BreadRoll\nPress 2 for BrownRye BreadRoll");
        int breadRollType = stdin.nextInt();

        if (breadRollType == 1) {
            Scanner stdin1 = new Scanner(System.in);
            Hamburger hamburger = new Hamburger("breadroll");  // this initializes the base Hamburger
            System.out.println("Hamburger Price is N" + hamburger.getPrice());
            hamburger.meatType();
            System.out.println("\n** Would you like some additions to your Hamburger? Yes or No");
            String input = stdin1.nextLine().toLowerCase();

            if (Objects.equals(input, "yes")) {
                hamburger.caller();
            }

            System.out.println("Would you like to upgrade your hamburger?");
            System.out.println("Press 1 for Deluxe Hamburger\nPress 2 for Healthy Hamburger\nPress 3 if you do not want upgrade");
            int input2 = stdin1.nextInt();
            if (input2 == 1) {
                deluxeHamburger DeluxeHamburger = new deluxeHamburger("breadRoll");
                DeluxeHamburger.orderDeluxeHamburger();
                System.out.println("***Thank you for you patronage.***");
            } else if (input2 == 2) {
                healthyBurger healthyBurger = new healthyBurger("BrownRyeRoll", 400);
                healthyBurger.healthyAdditions();
            }
            else if (input2 == 3) {
                hamburger.totalPrice();
                System.out.println("***Thank you for you patronage.***");
            }

        } else if (breadRollType == 2) {
            System.out.println("I am pretty sure you will like our Healthy Burger additions");
            healthyBurger healthyBurger = new healthyBurger("BrownRyeRoll", 400);
            healthyBurger.healthyAdditions();
            System.out.println("Would you like to add normal hamburger additions?\nYes or No");
            String input3 = stdin.nextLine().toLowerCase();
            if (Objects.equals(input3, "yes")) {
                healthyBurger.caller();
            }
            else if (Objects.equals(input3, "no")){
                System.out.println("Thank you for you WHAT EVER!!!!!");
            }

        }


        //       healthyBurger healthyHamburger = new healthyBurger("chicken", false);      // this initializes the healthyBurger
        //              //this initializes the deluxeHamburger

        //deluxeHamburger.orderDeluxeHamburger();
//        hamburger.totalPrice();
        // hamburger.additions("lettuce");


    }
}
