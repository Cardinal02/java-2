package com.sabitha;
import java.util.Scanner;

public class Bread {

    private static Scanner scanner = new Scanner(System.in);


    public static String printBreadInstructions() {
        int bChoice;
        String bread;

        System.out.println("Choose your bread: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - White Bread");
        System.out.println("\t 2 - Bakery Brioche");
        System.out.println("\t 3 - Whole Wheat");
        bChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered " + bChoice);

        if (bChoice == 1) {
            bread = "White bread";
        } else if (bChoice == 2) {
            bread = "Bakery Brioche";
        } else bread = "Whole Wheat";

        return bread;
    }

    public static double breadPrice(String bread) {
        double bPrice =0;
        //bread=bread;
        if (bread =="White bread") {
            bPrice = 1;
        } else if (bread == "Bakery Brioche") {
            bPrice = 1.50;
        }else if (bread == "Whole Wheat") {
            bPrice = 2.00;
        }
            return bPrice;
    }
}


