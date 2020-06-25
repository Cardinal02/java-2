package com.sabitha;

import java.util.Scanner;

public class Burger {
   private static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {}

    public String burgerName;
    public String bread;
    public double breadPrice;
    public String patty;
    public double pattyPrice;
    private String topping1;
    private String topping2;
    private double topping1Price;
    private double topping2Price;
    public double plainBurgerPrice;
    public double totalBurgerPrice;





    public Burger(String burgerName, String bread, double breadPrice, String patty, double pattyPrice) {
        this.burgerName = burgerName;
        this.bread = bread;
        this.breadPrice = breadPrice;
        this.patty = patty;
        this.pattyPrice = pattyPrice;

    }

    public void buildBurger(){
        plainBurgerPrice();
        this.topping1 = toppings();
        this.topping1Price = toppingPrice(topping1);
        System.out.println( "Topping 1 is " + topping1+ " and price is $" + topping1Price);
        this.topping2 = toppings();
        this.topping2Price = toppingPrice(topping2);
        System.out.println( "Topping 2 is " + topping2+ " and price is $" + topping2Price);
        totalBurgerPrice();
    }

    public void plainBurgerPrice(){
        plainBurgerPrice = breadPrice + pattyPrice;
        System.out.println("The cost of basic burger without additional toppings is $" + plainBurgerPrice);
    }

    public void totalBurgerPrice(){
      totalBurgerPrice = plainBurgerPrice + topping1Price + topping2Price;
      System.out.println("The total cost of your " +burgerName + " is $" + totalBurgerPrice);

    }

    public String toppings() {

        int tChoice;
        String topping;
        topping = "test";

        System.out.println("Choose your topping: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Cheese");
        System.out.println("\t 2 - Bacon");
        System.out.println("\t 3 - Onion");
        System.out.println("\t 4 - Tomato");
        System.out.println("\t 5 - Lettuce");
        System.out.println("\t 6 - Ketchup");
        System.out.println("\t 7 - Mayo");
        System.out.println("\t 8 - Grilled Onions");
        System.out.println("\t 9 - Grilled Mushrooms");
        System.out.println("\t 10 - None");

        tChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered " + tChoice);

        switch (tChoice) {
            case 1:
                topping = "Cheese";
                break;
            case 2:
                topping = "Bacon";
                break;
            case 3:
                topping = "Onion";
                break;
            case 4:
                topping = "Tomato";
                break;
            case 5:
                topping = "Lettuce";
                break;
            case 6:
                topping = "Ketchup";
                break;
            case 7:
                topping = "Mayo";
                break;
            case 8:
                topping = "Grilled Onions";
                break;
            case 9:
                topping = "Grilled Mushrooms";
                break;
            case 10:
                topping ="";


        }
        return topping;
    }

    public double toppingPrice(String topping){
        double tPrice=0;
        switch(topping){
            case "Cheese":
                tPrice = 1.00;
                break;
            case "Bacon":
                tPrice = 1.00;
                break;
            case "Grilled Mushrooms":
                tPrice = 0.50;
                break;
            case "Grilled Onions":
                tPrice = 1.00;
                break;
            case "":
                tPrice = 0;
                break;
            default:
                tPrice = 0.25;
                break;
        }
        return tPrice;
    }
}


