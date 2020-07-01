package Builder;

import Constants.Bread;
import Constants.BurgerType;

import java.util.Scanner;

import static Constants.Bread.*;

public class BreadData {


    public static Bread printBreadInstructions(BurgerType burgerType) {
        Scanner scanner = new Scanner(System.in);

        int breadChoice;
        Bread bread = WholeWheat;

        if (!(burgerType == BurgerType.HealthyBurger)) {
            System.out.println("\nChoose your bread: ");
            System.out.println("\nPress ");
            System.out.println("\t 1 - White Bread");
            System.out.println("\t 2 - Bakery Brioche");
            System.out.println("\t 3 - Whole Wheat");
            breadChoice = scanner.nextInt();
            scanner.nextLine();
            switch (breadChoice) {
                case 1:
                    bread = Bread.WhiteBread;
                    break;
                case 2:
                    bread = Bread.BakeryBrioche;
                    break;
                case 3:
                    bread = Bread.WholeWheat;
                    break;
                default:
                    bread = WholeWheat;
            }
        }
        return bread;

    }



    public static double breadPriceFinder(Bread bread) {
        double breadPrice=0;
        switch (bread) {
            case WhiteBread:
                breadPrice = WhiteBread.getBreadPrice();
                break;
            case BakeryBrioche:
                breadPrice = BakeryBrioche.getBreadPrice();
                break;
            case WholeWheat:
                breadPrice = WholeWheat.getBreadPrice();
                break;
        }
        return breadPrice;

    }


}


