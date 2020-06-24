package com.sabitha;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.println("Pick Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice==0){
                printInstructions();
            }else if (choice>0 && choice<4){
                masterBuilder(choice);
            }else if (choice==4){
                quit=true;
            }else {
                System.out.println("Invalid Entry");
                printInstructions();
            }



        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To see burger choices");
        System.out.println("\t 1 - To order a regular burger.");
        System.out.println("\t 2 - To order a healthy burger.");
        System.out.println("\t 3 - To order a deluxe burger.");
        System.out.println("\t 4 - To quit the application.");
    }

    public static void masterBuilder(int choice){
        int burgerCode= choice;
        String burgerName;
        String bread;
        double breadPrice;
        String patty;
        double pattyPrice;
        switch (burgerCode) {

            case 1:
                System.out.println("You have entered Regular Burger");
                burgerName = "Regular Burger";
                bread= Bread.printBreadInstructions();
                System.out.println("You have entered " + bread);
                breadPrice = Bread.breadPrice(bread);
                System.out.println("Bread price is $" + breadPrice);
                patty= Meat.printPattyInstructions();
                System.out.println("You have entered " + patty);
                pattyPrice = Meat.pattyPrice(patty);
                System.out.println("Patty price is $" + pattyPrice);
                Burger regular = new Burger(burgerName, bread,breadPrice, patty, pattyPrice);
                regular.buildBurger();
                printInstructions();
                break;
            case 2:
                System.out.println("You have entered Healthy Burger");
                patty= Meat.printPattyInstructions();
                System.out.println("You have enetered " + patty);
                pattyPrice = Meat.pattyPrice(patty);
                System.out.println("Patty price is $" + pattyPrice);
                Burger healthy = new HealthyBurger(patty, pattyPrice);
                healthy.buildBurger();
                printInstructions();
                break;
            case 3:
                System.out.println("You have entered Deluxe Burger");
                burgerName = "Deluxe Burger";
                bread= Bread.printBreadInstructions();
                System.out.println("You have entered " + bread);
                breadPrice = Bread.breadPrice(bread);
                System.out.println("Bread price is $" + breadPrice);
                patty= Meat.printPattyInstructions();
                System.out.println("You have entered " + patty);
                pattyPrice = Meat.pattyPrice(patty);
                System.out.println("Patty price is $" + pattyPrice);
                Burger deluxe = new DeluxeBurger(burgerName,bread,breadPrice,patty,pattyPrice);
                deluxe.buildBurger();
                printInstructions();
                break;

        }

    }


}
