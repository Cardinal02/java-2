package com.sabitha;
import java.util.Scanner;

public class HealthyBurger extends Burger {
    private static Scanner scanner = new Scanner(System.in);

    String healthyTopping1;
    double healthyTopping1Price;
    String healthyTopping2;
    double healthyTopping2Price;
    String healthyTopping3;
    double healthyTopping3Price;
    String healthyTopping4;
    double healthyTopping4Price;



    public HealthyBurger(String patty, double pattyPrice) {
        super("Healthy Burger", "Whole wheat", 2.00, patty, pattyPrice);
    }

    public void buildBurger() {
        System.out.println(burgerName + " has " + patty + " 0n " + bread + " bread.");
        plainBurgerPrice();
        this.healthyTopping1 = toppings();
        this.healthyTopping1Price = toppingPrice(healthyTopping1);
        System.out.println("Topping 1 is " + healthyTopping1 + " and price is $" + healthyTopping1Price);
        this.healthyTopping2 = toppings();
        this.healthyTopping2Price = toppingPrice(healthyTopping2);
        System.out.println("Topping 2 is " + healthyTopping2 + " and price is $" + healthyTopping2Price);
        this.healthyTopping3 = toppings();
        this.healthyTopping3Price = toppingPrice(healthyTopping3);
        System.out.println("Topping 3 is " + healthyTopping3 + " and price is $" + healthyTopping3Price);
        this.healthyTopping4 = toppings();
        this.healthyTopping4Price = toppingPrice(healthyTopping4);
        System.out.println("Topping 4 is " + healthyTopping4 + " and price is $" + healthyTopping4Price);
        totalBurgerPrice();
    }
    @Override
    public void totalBurgerPrice(){
        totalBurgerPrice = plainBurgerPrice + healthyTopping1Price + healthyTopping2Price + healthyTopping3Price + healthyTopping4Price;
        System.out.println("The total cost of your " +burgerName + " is $" + totalBurgerPrice);

    }

    @Override
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
                System.out.println("Can't add Cheese and Bacon to healthy burger.");
                toppings();
                break;
            case 2:
                System.out.println("Can't add Cheese and Bacon to healthy burger.");
                toppings();
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
                topping = "";


        }
        return topping;
    }





}