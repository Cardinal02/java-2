package Builder;
import Constants.Side;

import java.util.Scanner;

public class SideData {
    public static Side printSideInstructions(){
        Side sideItem;
        Scanner scanner = new Scanner(System.in);

        int sideChoice;
        System.out.println("\nChoose your side: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - French Fries");
        System.out.println("\t 2 - Curly Fries");
        System.out.println("\t 3 - Onion Rings");
        System.out.println("\t 4 - Sweet Potato Fries");
        System.out.println("\t 5 - Side Salad");

        sideChoice = scanner.nextInt();
        scanner.nextLine();
        switch (sideChoice){
            case 1:
                sideItem = Side.FrenchFries;
                break;
            case 2:
                sideItem = Side.CurlyFries;
                break;
            case 3:
                sideItem = Side.OnionRings;
                break;
            case 4:
                sideItem = Side.SweetPotatoFries;
                break;
            case 5:
                sideItem = Side.SideSalad;
                break;
            default:
                sideItem = Side.FrenchFries;
                break;

        }
        return sideItem;
    }

    public static double sidePriceFinder(Side side){
        double  sideItemPrice =0;
        switch(side){
            case FrenchFries:
                sideItemPrice = Side.FrenchFries.getSidePrice();
                break;
            case CurlyFries:
                sideItemPrice = Side.CurlyFries.getSidePrice();
                break;
            case OnionRings:
                sideItemPrice = Side.OnionRings.getSidePrice();
                break;
            case SweetPotatoFries:
                sideItemPrice = Side.SweetPotatoFries.getSidePrice();
                break;
            case SideSalad:
                sideItemPrice = Side.SideSalad.getSidePrice();
                break;
        }
        return sideItemPrice;
    }
}
