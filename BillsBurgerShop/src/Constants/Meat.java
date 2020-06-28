package Constants;

import java.util.Scanner;

public enum Meat {
    GroundBeef(3.50),
    ChickenBreast(3.75),
    BlackBeanVeggie(3.25);

    double pattyPrice;
    //constructor

    Meat(double price){
        pattyPrice= price;
    }

    public double getPattyPrice() {
        return pattyPrice;
    }

    public static int printMeatInstructions(){
        Scanner scanner = new Scanner(System.in);

        int pattyChoice;
        System.out.println("Choose your patty: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Ground Beef");
        System.out.println("\t 2 - Chicken Breast");
        System.out.println("\t 3 - Black Bean Veggie");
        pattyChoice = scanner.nextInt();
        scanner.nextLine();
        return pattyChoice;
    }
}
