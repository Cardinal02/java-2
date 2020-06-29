package Constants;
import java.util.Scanner;

public enum Side {
    FrenchFries(2.50),
    CurlyFries(2.75),
    OnionRings(3.00),
    SweetPotatoFries(3.00),
    SideSalad(2);
    private double sidePrice;
    //constructor
    Side(double price){
        sidePrice=price;
    }

    public double getSidePrice() {
        return sidePrice;
    }
    public static int printSideInstructions(){
        Scanner scanner = new Scanner(System.in);

        int sideChoice;
        System.out.println("Choose your side: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - French Fries");
        System.out.println("\t 2 - Curly Fries");
        System.out.println("\t 3 - Onion Rings");
        System.out.println("\t 4 - Sweet Potato Fries");
        System.out.println("\t 5 - Side Salad");

        sideChoice = scanner.nextInt();
        scanner.nextLine();
        return sideChoice;
    }
}
