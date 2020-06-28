package com.sabitha;
import BurgerBuilder.*;
import Constants.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.println("Pick Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice==0){
                printInstructions();
            }else if (choice>0 && choice<4){
                masterBuilder(choice);
            }else if (choice==4){
                quit=true;
            }else {
                System.out.println("Invalid Entry");
                printInstructions();
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To see burger choices");
        System.out.println("\t 1 - To order a regular burger.");
        System.out.println("\t 2 - To order a healthy burger.");
        System.out.println("\t 3 - To order a deluxe burger.");
        System.out.println("\t 4 - To quit the application.");
    }

    public static void masterBuilder(int choice){
        int burgerCode= choice;
        String burgerName;
        Bread bread=Bread.WhiteBread;
        Meat patty = Meat.GroundBeef;
        double breadPrice=1;
        double pattyPrice = 3.50;
        int breadInput;
        int pattyInput;

        switch (burgerCode) {

            case 1:
                burgerName = "Regular Burger";
                System.out.println("You have entered " + burgerName);
                breadInput= Bread.printBreadInstructions();
                switch(breadInput){
                    case 1:
                        bread = Bread.WhiteBread;
                        breadPrice = Bread.WhiteBread.getBreadPrice();
                        break;
                    case 2:
                        bread = Bread.BakeryBrioche;
                        breadPrice = Bread.BakeryBrioche.getBreadPrice();
                        break;
                    case 3:
                        bread = Bread.WholeWheat;
                        breadPrice = Bread.WholeWheat.getBreadPrice();
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        breadInput= Bread.printBreadInstructions();

                }
                pattyInput = Meat.printMeatInstructions();
                switch(pattyInput){
                    case 1:
                        patty = Meat.GroundBeef;
                        pattyPrice = Meat.GroundBeef.getPattyPrice();
                        break;
                    case 2:
                        patty = Meat.ChickenBreast;
                        pattyPrice = Meat.ChickenBreast.getPattyPrice();
                        break;
                    case 3:
                        patty = Meat.BlackBeanVeggie;
                        pattyPrice = Meat.BlackBeanVeggie.getPattyPrice();
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        pattyInput = Meat.printMeatInstructions();

                }
                System.out.println( "You have chosen "+ bread+ "for bread and the price is $" + breadPrice);
                System.out.println("You have chose " + patty + " for protein and the price is $ " + pattyPrice);
                Burger regular = new Burger(burgerName, bread,breadPrice, patty, pattyPrice);
                regular.buildBurger();
                printInstructions();
                break;
            case 2:
                System.out.println("You have entered Healthy Burger on Whole Wheat bread");
                pattyInput = Meat.printMeatInstructions();
                switch(pattyInput){
                    case 1:
                        patty = Meat.GroundBeef;
                        pattyPrice = Meat.GroundBeef.getPattyPrice();
                        break;
                    case 2:
                        patty = Meat.ChickenBreast;
                        pattyPrice = Meat.ChickenBreast.getPattyPrice();
                        break;
                    case 3:
                        patty = Meat.BlackBeanVeggie;
                        pattyPrice = Meat.BlackBeanVeggie.getPattyPrice();
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        pattyInput = Meat.printMeatInstructions();

                }
                System.out.println("You have chose " + patty + " for protein and the price is $ " + pattyPrice);
                HealthyBurger healthy = new HealthyBurger(patty, pattyPrice);
                healthy.buildBurger();
                printInstructions();
                break;
            case 3:
                burgerName = "Deluxe Burger";
                System.out.println("You have entered " + burgerName);
                breadInput= Bread.printBreadInstructions();
                switch(breadInput){
                    case 1:
                        bread = Bread.WhiteBread;
                        breadPrice = Bread.WhiteBread.getBreadPrice();
                        break;
                    case 2:
                        bread = Bread.BakeryBrioche;
                        breadPrice = Bread.BakeryBrioche.getBreadPrice();
                        break;
                    case 3:
                        bread = Bread.WholeWheat;
                        breadPrice = Bread.WholeWheat.getBreadPrice();
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        breadInput= Bread.printBreadInstructions();

                }
                pattyInput = Meat.printMeatInstructions();
                switch(pattyInput){
                    case 1:
                        patty = Meat.GroundBeef;
                        pattyPrice = Meat.GroundBeef.getPattyPrice();
                        break;
                    case 2:
                        patty = Meat.ChickenBreast;
                        pattyPrice = Meat.ChickenBreast.getPattyPrice();
                        break;
                    case 3:
                        patty = Meat.BlackBeanVeggie;
                        pattyPrice = Meat.BlackBeanVeggie.getPattyPrice();
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        pattyInput = Meat.printMeatInstructions();

                }
                System.out.println( "You have chosen "+ bread+ " for bread and the price is $" + breadPrice);
                System.out.println("You have chosen " + patty + " for protein and the price is $ " + pattyPrice);
                DeluxeBurger deluxe = new DeluxeBurger(burgerName,bread,breadPrice,patty,pattyPrice);
                deluxe.buildBurger();
                printInstructions();
                break;

        }

    }


}
