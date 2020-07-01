package com.sabitha;

import Builder.*;
import Burger.*;
import Constants.*;
import Constants.BurgerType;
import Builder.*;

import java.util.List;
import java.util.SortedMap;

public class Order {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31;1;52m";
    public static final String ANSI_RESET = "\u001B[0m";
    int onlyBurger =0;
    String comboMeal= "";
    BurgerType burgerType;
    Bread bread;
    double breadPrice;
    Meat patty;
    double pattyPrice;
    double plainBurgerPrice;
    List<String> toppings;
    double totalToppingPrice;
    double totalBurgerPrice;
    double sidePrice;
    double drinkPrice;
    double totalOrderPrice;


    public Order(String comboMeal) {
        this.comboMeal = comboMeal;
    }

    public Order(int onlyBurger) {
        this.onlyBurger = onlyBurger;
    }

    void createOrder() {
        if (onlyBurger == 1) {
            System.out.println("You entered only burger");
            burgerType = BurgerTypeData.burgerTypeSelector();
            System.out.println(burgerType);
            bread = BreadData.printBreadInstructions(burgerType);
            System.out.println(bread);
            patty = MeatData.printMeatInstructions();
            System.out.println(patty);
            if(burgerType==BurgerType.RegularBurger){
                toppings = ToppingsData.toppings(2);
                Burger burger = new Burger(burgerType,bread,patty,toppings);
            }else if (burgerType==BurgerType.DeluxeBurger){
                toppings=ToppingsData.toppings(6);
                Burger burger = new DeluxeBurger(burgerType,bread,patty,toppings);
            }else if (burgerType==BurgerType.HealthyBurger){
                toppings=ToppingsData.healthyToppings(4);
                Burger burger = new HealthyBurger(patty,toppings);
            }
            System.out.println(toppings);



        }else if (comboMeal=="Combo"){
            System.out.println("You entered Combo");
            burgerType = BurgerTypeData.burgerTypeSelector();
            Meal meal = new Meal(burgerType);
            //System.out.println(burgerType);
            bread = BreadData.printBreadInstructions(burgerType);
            System.out.println(bread);
            patty = MeatData.printMeatInstructions();
            System.out.println(patty);
            if(burgerType==BurgerType.RegularBurger){
                toppings = ToppingsData.toppings(2);
                Burger burger = new Burger(burgerType,bread,patty,toppings);
            }else if (burgerType==BurgerType.DeluxeBurger){
                toppings=ToppingsData.toppings(6);
                Burger burger = new DeluxeBurger(burgerType,bread,patty,toppings);
            }else if (burgerType==BurgerType.HealthyBurger){
                toppings=ToppingsData.healthyToppings(4);
                Burger burger = new HealthyBurger(patty,toppings);
            }
            System.out.println(toppings);
            sidePrice = Meal.addSide();
            drinkPrice = Meal.addDrink();
        }
    }

   void burgerPO(){
        burgerPriceCalculator();
        totalOrderPrice = totalBurgerPrice;
       System.out.println(ANSI_RED + " Your Order : "+ burgerType + "\n"+ ANSI_RESET);
       System.out.println(ANSI_RED + "Order Total :$" + totalOrderPrice + ANSI_RESET);
   }
   void mealPO(){
       burgerPriceCalculator();
       totalOrderPrice = totalBurgerPrice + sidePrice+drinkPrice;
       System.out.println(ANSI_BLUE +"Side Price :$ "+ sidePrice+ ANSI_RESET);
       System.out.println(ANSI_BLUE + "Drink Price :$" + drinkPrice + ANSI_RESET);
       Meal.mealSummary();
       System.out.println(ANSI_RED + " Order Total :$" + totalOrderPrice + ANSI_RESET);
       System.out.println("\n=======================================================================================\n\n");
   }
    public void burgerPriceCalculator() {
        breadPrice =BreadData.breadPriceFinder(bread);
       // System.out.println("Bread Price:" + breadPrice);
        pattyPrice = MeatData.pattyPriceFinder(patty);
        //System.out.println("Meat Price"+ pattyPrice);
        totalToppingPrice = ToppingsData.calculateToppingPrice(toppings);
        //System.out.println("Toppings Price"+ totalToppingPrice);
        plainBurgerPrice= breadPrice+pattyPrice;
       System.out.println("Basic Burger Price :$"+ plainBurgerPrice);
        totalBurgerPrice = plainBurgerPrice+ totalToppingPrice;
        System.out.println(ANSI_BLUE + "Your Burger : " + patty+ " on "+ bread + " with "+ toppings + ANSI_RESET );
        System.out.println(ANSI_BLUE+ burgerType+" price with toppings :$"+ totalBurgerPrice + ANSI_RESET);
    }
}
