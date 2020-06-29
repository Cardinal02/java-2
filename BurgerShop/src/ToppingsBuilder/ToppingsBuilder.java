package ToppingsBuilder;

import Constants.Toppings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToppingsBuilder {
//toppings selector for regular and deluxe burger
    public static List<String> toppings(int max){
        Scanner scanner = new Scanner(System.in);
        List<String> toppingsList = new ArrayList<>();
        //double toppingPrice=0;
        int maxToppings=max;
        int toppingsChoice = 0;
        Toppings topping = Toppings.None;

        System.out.println("\nChoose your topping: ");
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
//                default:
//                    System.out.println("Invalid Entry");
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

        System.out.println("\nChoose your topping: ");
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
            switch (toppingsChoice) {
//                case 1:
//                    topping = Toppings.Cheese;
//                    break;
//                case 2:
//                    topping = Toppings.Bacon;
//                    break;
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

