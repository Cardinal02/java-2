package Builder;
import Constants.*;

import java.util.Scanner;

public class MeatData {

    public static Meat printMeatInstructions() {
        int pattyChoice = 1;
        Meat patty = Meat.GroundBeef;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose your patty: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - Ground Beef");
        System.out.println("\t 2 - Chicken Breast");
        System.out.println("\t 3 - Black Bean Veggie");
        pattyChoice = scanner.nextInt();
        scanner.nextLine();
        switch (pattyChoice) {
            case 1:
                patty = Meat.GroundBeef;
                break;
            case 2:
                patty = Meat.ChickenBreast;
                break;
            case 3:
                patty = Meat.BlackBeanVeggie;
                break;
            default:
                patty = Meat.GroundBeef;
        }
        return patty;
    }
    public static double pattyPriceFinder(Meat patty) {
        double pattyPrice =0;
        switch(patty) {
            case GroundBeef:
                pattyPrice = Meat.GroundBeef.getPattyPrice();
                break;
            case ChickenBreast:
                pattyPrice = Meat.ChickenBreast.getPattyPrice();
                break;
            case BlackBeanVeggie:
                pattyPrice = Meat.BlackBeanVeggie.getPattyPrice();
                break;
        }
        return pattyPrice;
    }
}
