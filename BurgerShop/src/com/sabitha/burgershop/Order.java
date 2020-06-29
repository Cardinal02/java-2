package com.sabitha.burgershop;

import Constants.*;

import java.util.List;

public class Order {
    Burger burgerType;
    Bread bread;
    Meat patty;
    Drink drink;
    Side side;
    List<String> toppings;

    public Order(Burger burgerType, Bread bread, Meat patty) {
        this.burgerType = burgerType;
        this.bread = bread;
        this.patty = patty;
    }

    public void addToppings(List<String> toppings){
        this.toppings = toppings;
        //System.out.println("You have ordered a " + burgerType + " on a "+ bread + " with " + patty + ".");
        //System.out.println("Your toppings are " + toppings);
    };
    public void addDrinks(Drink drink){
        this.drink = drink;
        //System.out.println("Test:Your drink is " + this.drink);
    };
    public void addSides(Side side){
        this.side = side;
        //System.out.println("Your side is "+ this.side);
    };


    public void purchaseOrder() {
        Meal meal1 = new Meal(burgerType,drink, side);
        meal1.buildBurger(bread,patty,toppings);
        meal1.calculatePrice();
    }
}
