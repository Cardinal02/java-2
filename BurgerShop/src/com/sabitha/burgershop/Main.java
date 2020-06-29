package com.sabitha.burgershop;

import Constants.*;
import ToppingsBuilder.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Burger burgerType = Burger.RegularBurger;
    static Bread bread = Bread.WholeWheat;
    static List<String> toppings;
    static Drink drinkItem;
    static Meat patty = Meat.GroundBeef;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printInstructions();
        boolean quit = false;
        int choice;
        int sideInput;
        int drinkInput;
        int pattyInput;
        //Burger burgerType = Burger.RegularBurger;
        Side sideItem;

        Meat patty = Meat.GroundBeef;

        while (!quit) {

            //Burger Choice
            System.out.println("Pick Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    burgerType = Burger.RegularBurger;
                    break;
                case 2:
                    burgerType = Burger.HealthyBurger;
                    break;
                case 3:
                    burgerType = Burger.DeluxeBurger;
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Entry");
                    printInstructions();
                    break;
            }

            breadInput();

            //Meat or Patty Choice
            pattyInput = Meat.printMeatInstructions();
            switch(pattyInput){
                case 1:
                    patty = Meat.GroundBeef;
                    break;
                case 2:
                    patty = Meat.ChickenBreast;
                    break;
                case 3:
                    patty = Meat.BlackBeanVeggie;
                    break;
                default:
                    System.out.println("Invalid Entry");
                    pattyInput = Meat.printMeatInstructions();

            }
            //Toppings choice
            toppingsInput();

            sideInput = Side.printSideInstructions();
            switch (sideInput){
                case 1:
                    sideItem = Side.FrenchFries;
                    break;
                case 2:
                    sideItem = Side.CurlyFries;
                    break;
                case 3:
                    sideItem = Side.OnionRings;
                    break;
                case 4:
                    sideItem = Side.SweetPotatoFries;
                    break;
                case 5:
                    sideItem = Side.SideSalad;
                    break;
                default:
                    sideItem = Side.FrenchFries;
                    break;

            }
            drinkInput = Drink.printDrinkInstructions();
            switch (drinkInput){
                case 1:
                    drinkItem = Drink.Coke;
                    break;
                case 2:
                    drinkItem = Drink.Tea;
                    break;
                case 3:
                    drinkItem = Drink.Water;
                    break;
                case 4:
                    drinkItem = Drink.VanillaShake;
                    break;
                case 5:
                    drinkItem = Drink.ChocolateShake;
                    break;
                case 6:
                    drinkItem = Drink.StrawberryShake;
                    break;
                case 7:
                    drinkItem = Drink.OreoShake;
                    break;
                default:
                    drinkItem= Drink.Water;
            }
            //System.out.println("Test: You have ordered a "+burgerType+" on a " + bread+ " with a side of " +sideItem + " and " + drinkItem+ " for drink." );

            //Ordering Meal
            Order order1 = new Order(burgerType,bread,patty);
            order1.addToppings(toppings);
            order1.addDrinks(drinkItem);
            order1.addSides(sideItem);
            order1.purchaseOrder();
            //order1.buildMeal();
        }





    }

    private static void toppingsInput() {
        if (burgerType == Burger.RegularBurger) {
            System.out.println("You can add upto a maximum of 2 toppings from the choices");
            toppings = ToppingsBuilder.toppings(2);
        } else if (burgerType == Burger.HealthyBurger){
            System.out.println("You can add upto a maximum of 4 toppings from the choices");
            toppings = ToppingsBuilder.healthyToppings(4);
        } else if(burgerType == Burger.DeluxeBurger){
            System.out.println("You can add upto a maximum of 6 toppings from the choices");
            toppings = ToppingsBuilder.toppings(6);
        }
    }

    private static void breadInput() {
        int breadInput = 0;

        System.out.println(burgerType);
        if (!(burgerType ==Burger.HealthyBurger)) {
            breadInput = Bread.printBreadInstructions();
            switch (breadInput) {
                case 1:
                    bread = Bread.WhiteBread;
                    break;
                case 2:
                    bread = Bread.BakeryBrioche;
                    break;
                case 3:
                    bread = Bread.WholeWheat;
                    break;
                default:
                    System.out.println("Invalid Entry");
                    breadInput = Bread.printBreadInstructions();
            }
        }

    }

    public static void printInstructions () {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To see burger choices");
        System.out.println("\t 1 - To order a regular burger.");
        System.out.println("\t 2 - To order a healthy burger.");
        System.out.println("\t 3 - To order a deluxe burger.");
        System.out.println("\t 4 - To quit the application.");
    }
}