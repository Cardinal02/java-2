package com.sabitha;
import java.util.Scanner;

public class DeluxeBurger extends Burger {
    private static Scanner scanner = new Scanner(System.in);
    private String topping1;
    private double topping1Price;
    private String topping2;
    private double topping2Price;
    private String topping3;
    private double topping3Price;
    private String topping4;
    private double topping4Price;
    private String topping5;
    private double topping5Price;
    private String topping6;
    private double topping6Price;

    public DeluxeBurger(String burgerName, String bread, double breadPrice, String patty, double pattyPrice) {
        super(burgerName, bread, breadPrice, patty, pattyPrice);
    }
    @Override
    public void buildBurger() {
        System.out.println(burgerName + " has " + patty + " 0n " + bread + " bread.");
        plainBurgerPrice();
        this.topping1 = toppings();
        this.topping1Price = toppingPrice(topping1);
        System.out.println( "Topping 1 is " + topping1+ " and price is $" + topping1Price);
        this.topping2 = toppings();
        this.topping2Price = toppingPrice(topping2);
        System.out.println( "Topping 2 is " + topping2+ " and price is $" + topping2Price);
        totalBurgerPrice();
        this.topping3 = toppings();
        this.topping3Price = toppingPrice(topping3);
        System.out.println( "Topping 3 is " + topping3+ " and price is $" + topping3Price);
        this.topping4 = toppings();
        this.topping4Price = toppingPrice(topping4);
        System.out.println( "Topping 4 is " + topping4+ " and price is $" + topping4Price);
        this.topping5 = toppings();
        this.topping5Price = toppingPrice(topping5);
        System.out.println( "Topping 5 is " + topping5+ " and price is $" + topping5Price);
        this.topping6 = toppings();
        this.topping6Price = toppingPrice(topping6);
        System.out.println( "Topping 6 is " + topping6+ " and price is $" + topping6Price);
        totalBurgerPrice();
    }


    public void totalBurgerPrice(){
        totalBurgerPrice = plainBurgerPrice + topping1Price + topping2Price +topping3Price+topping4Price+topping5Price+topping6Price;
        System.out.println("The total cost of your " +burgerName + " is $" + totalBurgerPrice);

    }
}
