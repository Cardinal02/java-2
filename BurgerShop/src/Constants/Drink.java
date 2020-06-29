package Constants;
import java.util.Scanner;

public enum Drink {
    Coke(1.00),
    Tea(1.00),
    Water(0),
    VanillaShake(2.00),
    ChocolateShake(2.00),
    StrawberryShake(2.00),
    OreoShake(2.50);

    double drinkPrice;

    //constructor

    Drink(double price){
        drinkPrice = price;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public static int printDrinkInstructions(){
        Scanner scanner = new Scanner(System.in);

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
        return drinkChoice;
    }
}
