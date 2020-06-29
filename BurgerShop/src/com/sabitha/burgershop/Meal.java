package com.sabitha.burgershop;

import BurgerBuilder.MakeBurger;
import Constants.*;

import java.util.List;

public class Meal {
    Burger burgerType;
    Drink drink;
    Side side;
    Bread bread;
    Meat patty;
    List<String> toppings;
    double sideItemPrice;
    double drinkItemPrice;
    double wholeBurgerPrice;
    double totalOrderPrice;

    public Meal(Burger burgerType, Drink drink, Side side) {
        this.burgerType = burgerType;
        this.drink = drink;
        this.side = side;
        System.out.println("Test1: You have ordered a " + this.burgerType + " with a drink of " + this.drink + " and a side of " + this.side);


    }
    void buildBurger(Bread bread, Meat patty, List<String> toppings){
        this.bread = bread;
        this.patty = patty;
        this.toppings = toppings;
        MakeBurger burger1 = new MakeBurger(bread, patty, toppings);
        wholeBurgerPrice= burger1.totalBurgerPrice();
        drinkPriceFinder();
        sidePriceFinder();
        System.out.println("Drink Price is " + drinkItemPrice);
        System.out.println("Side Price is "+ sideItemPrice);

        //System.out.println("Your burger has " + patty + " on " + bread + " with added toppings " + toppings);
    }


    public void setWholeBurgerPrice(double wholeBurgerPrice) {
        this.wholeBurgerPrice = wholeBurgerPrice;
    }

    public void drinkPriceFinder(){
        switch(drink){
            case Coke:
                drinkItemPrice= Drink.Coke.getDrinkPrice();
                break;
            case Tea:
                drinkItemPrice= Drink.Tea.getDrinkPrice();
                break;
            case Water:
                drinkItemPrice= Drink.Water.getDrinkPrice();
                break;
            case VanillaShake:
                drinkItemPrice= Drink.VanillaShake.getDrinkPrice();
                break;
            case ChocolateShake:
                drinkItemPrice= Drink.ChocolateShake.getDrinkPrice();
                break;
            case StrawberryShake:
                drinkItemPrice= Drink.StrawberryShake.getDrinkPrice();
                break;
            case OreoShake:
                drinkItemPrice= Drink.OreoShake.getDrinkPrice();
                break;
        }

    }
    public void sidePriceFinder(){
        switch(side){
            case FrenchFries:
                sideItemPrice = Side.FrenchFries.getSidePrice();
                break;
            case CurlyFries:
                sideItemPrice = Side.CurlyFries.getSidePrice();
                break;
            case OnionRings:
                sideItemPrice = Side.OnionRings.getSidePrice();
                break;
            case SweetPotatoFries:
                sideItemPrice = Side.SweetPotatoFries.getSidePrice();
                break;
            case SideSalad:
                sideItemPrice = Side.SideSalad.getSidePrice();
                break;
        }
    }

    public void calculatePrice() {
        totalOrderPrice= wholeBurgerPrice + sideItemPrice + drinkItemPrice;
        System.out.println("total price is "+ totalOrderPrice);
    }


}
