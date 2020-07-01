package Builder;

import java.util.Scanner;
import Constants.Drink;

public class DrinkData {
    public static Drink printDrinkInstructions() {
        Scanner scanner = new Scanner(System.in);
        Drink drinkItem;
        int drinkChoice;

        System.out.println("\nChoose your Drink: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Coke");
        System.out.println("\t 2 - Tea");
        System.out.println("\t 3 - Water");
        System.out.println("\t 4 - Vanilla Shake");
        System.out.println("\t 5 - Chocolate Shake");
        System.out.println("\t 6 - Strawberry Shake");
        System.out.println("\t 7 - Oreo Shake");

        drinkChoice = scanner.nextInt();
        scanner.nextLine();
        switch (drinkChoice) {
            case 1:
                drinkItem = Drink.Coke;
                break;
            case 2:
                drinkItem = Drink.Tea;
                break;
            case 3:
                drinkItem = Drink.Water;
                break;
            case 4:
                drinkItem = Drink.VanillaShake;
                break;
            case 5:
                drinkItem = Drink.ChocolateShake;
                break;
            case 6:
                drinkItem = Drink.StrawberryShake;
                break;
            case 7:
                drinkItem = Drink.OreoShake;
                break;
            default:
                drinkItem = Drink.Water;
        }
        return drinkItem;
    }

    public static double drinkPriceFinder(Drink drink){
        double drinkItemPrice =0;

        switch(drink){
            case Coke:
                drinkItemPrice= Drink.Coke.getDrinkPrice();
                break;
            case Tea:
                drinkItemPrice= Drink.Tea.getDrinkPrice();
                break;
            case Water:
                drinkItemPrice= Drink.Water.getDrinkPrice();
                break;
            case VanillaShake:
                drinkItemPrice= Drink.VanillaShake.getDrinkPrice();
                break;
            case ChocolateShake:
                drinkItemPrice= Drink.ChocolateShake.getDrinkPrice();
                break;
            case StrawberryShake:
                drinkItemPrice= Drink.StrawberryShake.getDrinkPrice();
                break;
            case OreoShake:
                drinkItemPrice= Drink.OreoShake.getDrinkPrice();
                break;
        }
        return drinkItemPrice;
    }
}
