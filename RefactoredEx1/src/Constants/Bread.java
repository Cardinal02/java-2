package Constants;
import java.util.Scanner;

public enum Bread{

    WhiteBread(1),
    BakeryBrioche(1.50),
    WholeWheat(2);

    private double breadPrice; //Price of bread

    //Constructor
    Bread(double price){
        breadPrice=price;
    }
    public double getBreadPrice(){
        return breadPrice;
    }
    public static int printBreadInstructions() {
        Scanner scanner = new Scanner(System.in);

        int breadChoice;
        String bread;

        System.out.println("Choose your bread: ");
        System.out.println("\nPress ");
        System.out.println("\t 1 - White Bread");
        System.out.println("\t 2 - Bakery Brioche");
        System.out.println("\t 3 - Whole Wheat");
        breadChoice = scanner.nextInt();
        scanner.nextLine();
        return breadChoice;
    }

}
