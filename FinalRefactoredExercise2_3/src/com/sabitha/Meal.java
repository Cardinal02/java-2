package com.sabitha;
import Constants.*;
import Builder.*;

import java.util.SortedMap;

public class Meal {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31;1;52m";
    public static final String ANSI_RESET = "\u001B[0m";
    static BurgerType burgerType;
    static Side side;
    static double sideItemPrice;
    static Drink drink;
    static double drinkItemPrice;

    public Meal(BurgerType burgerType) {
        this.burgerType = burgerType;
    }

    public static double addSide(){
    side = SideData.printSideInstructions();
        //System.out.println("Side :"+ side);
    sideItemPrice = SideData.sidePriceFinder(side);
       // System.out.println( sideItemPrice);
        return sideItemPrice;
    }
    public static double addDrink(){
    drink = DrinkData.printDrinkInstructions();
        //System.out.println("Drink :" + drink);
    drinkItemPrice =DrinkData.drinkPriceFinder(drink);
    return drinkItemPrice;
    }
    public static void mealSummary(){
        System.out.println(ANSI_RED + "You Order :" + burgerType + " with " + side + " and "+ drink + ANSI_RESET+ "\n");
    }
}
