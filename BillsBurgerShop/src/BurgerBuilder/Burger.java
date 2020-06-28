package BurgerBuilder;

import Constants.*;
import ToppingsBuilder.*;

import java.util.List;
import java.util.Scanner;

public class Burger {
    private static Scanner scanner = new Scanner(System.in);
    public String burgerName;
    public Bread bread;
    public double breadPrice;
    public Meat patty;
    public double pattyPrice;
    public double plainBurgerPrice;
    public double totalBurgerPrice;
    public List<String> toppings;
    public double totalToppingPrice;

    public Burger(String burgerName, Bread bread, double breadPrice, Meat patty, double pattyPrice) {
        this.burgerName = burgerName;
        this.bread = bread;
        this.breadPrice = breadPrice;
        this.patty = patty;
        this.pattyPrice = pattyPrice;
    }
    public void buildBurger() {
        toppings = ToppingsBuilder.toppings(2);
        System.out.println(toppings);
        totalToppingPrice = ToppingsBuilder.calculateToppingPrice(toppings);
        plainBurgerPrice();
        totalBurgerPrice();
    }

    public void plainBurgerPrice(){
        plainBurgerPrice = breadPrice + pattyPrice;
        System.out.println("The cost of basic burger without additional toppings is $" + plainBurgerPrice);
    }

    public void totalBurgerPrice(){
        totalBurgerPrice = plainBurgerPrice + totalToppingPrice;
        System.out.println("The cost of total burger price including the toppins is $" + totalBurgerPrice);
    }

}
