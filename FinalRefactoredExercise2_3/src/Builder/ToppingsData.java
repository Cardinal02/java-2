package Builder;

import Constants.Toppings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToppingsData {
//toppings selector for regular and deluxe burger
    public static List<String> toppings(int max){
        Scanner scanner = new Scanner(System.in);
        List<String> toppingsList = new ArrayList<>();
        //double toppingPrice=0;
        int maxToppings=max;
        int toppingsChoice = 0;
        Toppings topping = Toppings.None;
        int cheeseCounter=0;
        int baconCounter=0;
        int gOnionCounter=0;
        int gMushroomCounter=0;
        int tomatoCounter =0;
        int onionCounter=0;
        int lettuceCounter=0;
        int ketchupCounter=0;
        int mayoCounter=0;
        int ranchCounter=0;

        System.out.println("\nChoose your topping: ");
        System.out.println("You can add upto "+ maxToppings + " toppings");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Cheese");
        System.out.println("\t 2 - Bacon");
        System.out.println("\t 3 - Grilled Onions");
        System.out.println("\t 4 - Grilled Mushrooms");
        System.out.println("\t 5 - Onion");
        System.out.println("\t 6 - Tomato");
        System.out.println("\t 7 - Lettuce");
        System.out.println("\t 8 - Ketchup");
        System.out.println("\t 9 - Mayo");
        System.out.println("\t 10 - Ranch");
        System.out.println("\t 0 - None");


        for (int i =1; i<=maxToppings;i++){
            System.out.println("Enter topping number " + i );
            toppingsChoice = scanner.nextInt();
            scanner.nextLine();
            switch(toppingsChoice) {
                case 1:
                    cheeseCounter++;
                    if (cheeseCounter == 2) {
                        System.out.println("You cant add anymore of cheese");
                    }
                    break;
                case 2:
                    baconCounter ++;
                    if (baconCounter == 2) {
                        System.out.println("You cant add anymore of bacon");
                    }
                    break;
                case 3:
                    gOnionCounter ++;
                    if (gOnionCounter == 2) {
                        System.out.println("You cant add anymore of Grilled Onions");
                    }
                    break;
                case 4:
                    gMushroomCounter ++;
                    if (gMushroomCounter == 2) {
                        System.out.println("You cant add anymore of grilled mushrooms");
                    }
                    break;
                case 5:
                    onionCounter ++;
                    if (onionCounter == 2) {
                        System.out.println("You cant add anymore of onion");
                    }
                    break; case 6:
                    tomatoCounter ++;
                    if (tomatoCounter == 2) {
                        System.out.println("You cant add anymore of tomato");
                    }
                    break; case 7:
                    lettuceCounter ++;
                    if (lettuceCounter == 2) {
                        System.out.println("You cant add anymore of lettuce");
                    }
                    break;
                case 8:
                    ketchupCounter ++;
                    if (ketchupCounter == 2) {
                        System.out.println("You cant add anymore of ketchup");
                    }
                    break;
                case 9:
                    mayoCounter ++;
                    if (mayoCounter == 2) {
                        System.out.println("You cant add anymore of mayo");
                    }
                    break;
                case 10:
                    ranchCounter ++;
                    if (ranchCounter == 2) {
                        System.out.println("You cant add anymore of ranch");
                    }
                    break;

            }
            switch (toppingsChoice) {
                case 1:
                    topping = Toppings.Cheese;
                    break;
                case 2:
                    topping = Toppings.Bacon;
                    break;
                case 3:
                    topping = Toppings.GrilledOnions;
                    break;
                case 4:
                    topping = Toppings.GrilledMushrooms;
                    break;
                case 5:
                    topping = Toppings.Onion;
                    break;
                case 6:
                    topping = Toppings.Tomato;
                    break;
                case 7:
                    topping = Toppings.Lettuce;
                    break;
                case 8:
                    topping = Toppings.Ketchup;
                    break;
                case 9:
                    topping = Toppings.Mayo;
                   break;
                case 10:
                    topping = Toppings.Ranch;
                    break;
                case 0:
                    topping =Toppings.None;
                    break;
                default:
                   topping =Toppings.None;

            }
        toppingsList.add(String.valueOf(topping));
        }
        return toppingsList;
    }
//calculate total topping price for all toppings
    public static double calculateToppingPrice(List<String> toppings){
        double toppingPrice =0;
        double totalToppingsPrice = 0;
        for(int i=0; i<toppings.size();i++){
           String temp = toppings.get(i);
            switch (temp){
                case "Cheese":
                    toppingPrice = Toppings.Cheese.getToppingPrice();
                    break;
                case "Bacon":
                    toppingPrice = Toppings.Bacon.getToppingPrice();
                    break;
                case "GrilledOnions":
                    toppingPrice = Toppings.GrilledOnions.getToppingPrice();
                    break;
                case "GrilledMushrooms":
                    toppingPrice = Toppings.GrilledMushrooms.getToppingPrice();
                    break;
                case "Onion":
                    toppingPrice = Toppings.Onion.getToppingPrice();
                    break;
                case "Tomato":
                    toppingPrice = Toppings.Tomato.getToppingPrice();
                    break;
                case "Lettuce":
                    toppingPrice = Toppings.Lettuce.getToppingPrice();
                    break;
                case "Ketchup":
                    toppingPrice = Toppings.Ketchup.getToppingPrice();
                    break;
                case "Mayo":
                    toppingPrice = Toppings.Mayo.getToppingPrice();
                    break;
                case "Ranch":
                    toppingPrice = Toppings.Ranch.getToppingPrice();
                    break;
                case "None":
                    toppingPrice = Toppings.None.getToppingPrice();
            }
            totalToppingsPrice += toppingPrice;
            System.out.println(temp + " Price is $"+ toppingPrice);
            }

        return totalToppingsPrice;
    }
//toppings selectorfor healthy burger
    public static List<String> healthyToppings(int max){
        Scanner scanner = new Scanner(System.in);
        List<String> toppingsList = new ArrayList<>();
        //double toppingPrice=0;
        int maxToppings=max;
        int toppingsChoice = 0;
        Toppings topping = Toppings.None;
        int cheeseCounter=0;
        int baconCounter=0;
        int gOnionCounter=0;
        int gMushroomCounter=0;
        int tomatoCounter =0;
        int onionCounter=0;
        int lettuceCounter=0;
        int ketchupCounter=0;
        int mayoCounter=0;
        int ranchCounter=0;

        System.out.println("\nChoose your topping: ");
        System.out.println("You can add upto "+ maxToppings + " toppings");
        System.out.println("\nPress ");
        //System.out.println("\t 1 - Cheese");
        //System.out.println("\t 2 - Bacon");
        System.out.println("\t 3 - Grilled Onions");
        System.out.println("\t 4 - Grilled Mushrooms");
        System.out.println("\t 5 - Onion");
        System.out.println("\t 6 - Tomato");
        System.out.println("\t 7 - Lettuce");
        System.out.println("\t 8 - Ketchup");
        System.out.println("\t 9 - Mayo");
        System.out.println("\t 10 - Ranch");
        System.out.println("\t 0 - None");


        for (int i =1; i<=maxToppings;i++){
            System.out.println("Enter topping number " + i );
            toppingsChoice = scanner.nextInt();
            scanner.nextLine();
            switch(toppingsChoice) {
                case 1:
                    cheeseCounter++;
                    if (cheeseCounter == 2) {
                        System.out.println("You cant add anymore of cheese");
                    }
                    break;
                case 2:
                    baconCounter ++;
                    if (baconCounter == 2) {
                        System.out.println("You cant add anymore of bacon");
                    }
                    break;
                case 3:
                    gOnionCounter ++;
                    if (gOnionCounter == 2) {
                        System.out.println("You cant add anymore of Grilled Onions");
                    }
                    break;
                case 4:
                    gMushroomCounter ++;
                    if (gMushroomCounter == 2) {
                        System.out.println("You cant add anymore of grilled mushrooms");
                    }
                    break;
                case 5:
                    onionCounter ++;
                    if (onionCounter == 2) {
                        System.out.println("You cant add anymore of onion");
                    }
                    break; case 6:
                    tomatoCounter ++;
                    if (tomatoCounter == 2) {
                        System.out.println("You cant add anymore of tomato");
                    }
                    break; case 7:
                    lettuceCounter ++;
                    if (lettuceCounter == 2) {
                        System.out.println("You cant add anymore of lettuce");
                    }
                    break;
                case 8:
                    ketchupCounter ++;
                    if (ketchupCounter == 2) {
                        System.out.println("You cant add anymore of ketchup");
                    }
                    break;
                case 9:
                    mayoCounter ++;
                    if (mayoCounter == 2) {
                        System.out.println("You cant add anymore of mayo");
                    }
                    break;
                case 10:
                    ranchCounter ++;
                    if (ranchCounter == 2) {
                        System.out.println("You cant add anymore of ranch");
                    }
                    break;

            }
            switch (toppingsChoice) {

                case 3:
                    topping = Toppings.GrilledOnions;
                    break;
                case 4:
                    topping = Toppings.GrilledMushrooms;
                    break;
                case 5:
                    topping = Toppings.Onion;
                    break;
                case 6:
                    topping = Toppings.Tomato;
                    break;
                case 7:
                    topping = Toppings.Lettuce;
                    break;
                case 8:
                    topping = Toppings.Ketchup;
                    break;
                case 9:
                    topping = Toppings.Mayo;
                    break;
                case 10:
                    topping = Toppings.Ranch;
                    break;
                case 0:
                    topping =Toppings.None;
              default:
                  topping =Toppings.None;
            }
            toppingsList.add(String.valueOf(topping));
        }
        return toppingsList;
    }

}

