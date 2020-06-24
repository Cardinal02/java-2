package com.sabitha;
import java.util.Scanner;

public class Meat {
    private static Scanner scanner = new Scanner(System.in);

    public static String printPattyInstructions() {
        int pChoice;
        String patty;
        patty = "test";

        System.out.println("Choose your patty: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Fresh Chuck USDA Ground Beef");
        System.out.println("\t 2 - Marinated Chicken Breast");
        System.out.println("\t 3 - Chipotle Black Bean Veggie");
        pChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered " + pChoice);

        if (pChoice == 1) {
            patty = "Fresh Chuck USDA Ground Beef";
        }else if (pChoice==2){
            patty= "Marinated Chicken Breast";
        }else if (pChoice==3){
            patty ="Chipotle Black Bean Veggie";
        }

    return patty;
    }

    public static double pattyPrice(String patty) {
        double pPrice =0;
        if (patty =="Fresh Chuck USDA Ground Beef") {
            pPrice = 3.50;
        } else if (patty == "Marinated Chicken Breast") {
            pPrice = 3.75;
        }else if (patty == "Chipotle Black Bean Veggie") {
            pPrice = 3.25;
        }
        return pPrice;
    }

}
