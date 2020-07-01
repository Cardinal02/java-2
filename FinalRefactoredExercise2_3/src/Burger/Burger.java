package Burger;

import Constants.*;
import Builder.*;

import java.util.List;
import java.util.Scanner;

public class Burger {
    BurgerType burgerType;
    Bread bread;
    double breadPrice;
    Meat patty;
    double pattyPrice;
    double plainBurgerPrice;
    public double totalBurgerPrice;
    List<String> toppings;
    double totalToppingPrice;

    public Burger(BurgerType burgerType, Bread bread, Meat patty, List<String> toppings) {
        this.burgerType = burgerType;
        this.bread = bread;
        this.patty = patty;
        this.toppings = toppings;
    }



    public void burgerPriceCalculator() {
        breadPrice =BreadData.breadPriceFinder(bread);
        System.out.println("Bread Price:" + breadPrice);
        pattyPrice = MeatData.pattyPriceFinder(patty);
        System.out.println("Meat Price"+ pattyPrice);
        totalToppingPrice = ToppingsData.calculateToppingPrice(toppings);
        System.out.println("Toppings Price"+ totalToppingPrice);
        plainBurgerPrice= breadPrice+pattyPrice;
        System.out.println("Basic Burger Price :"+ plainBurgerPrice);
        totalBurgerPrice = plainBurgerPrice+ totalToppingPrice;
        System.out.println("Full Burger Price :"+ totalBurgerPrice);

    }

    public double getTotalBurgerPrice() {
        return totalBurgerPrice;
    }

}
