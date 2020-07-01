package com.sabitha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice;
        while (!quit) {
            System.out.println("Enter 1 to order just a burger ");
            System.out.println("Enter 2 to order a combo meal");
            System.out.println("Enter 3 to quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Just Burger");
                    Order order1 = new Order(1);
                    order1.createOrder();
                    order1.burgerPO();
                    break;
                case 2:
                    System.out.println("Combo Meal");
                    Order order2 = new Order("Combo");
                    order2.createOrder();
                    order2.mealPO();
                    break;

                case 3:
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }
}
