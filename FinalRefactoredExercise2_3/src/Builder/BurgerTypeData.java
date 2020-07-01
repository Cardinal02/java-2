package Builder;
import Constants.*;

import java.util.Scanner;

public class BurgerTypeData {

    public static BurgerType burgerTypeSelector() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        BurgerType burgerType = BurgerType.RegularBurger;
        System.out.println("\nPress ");
        System.out.println("\t 1 - To order a regular burger.");
        System.out.println("\t 2 - To order a healthy burger.");
        System.out.println("\t 3 - To order a deluxe burger.");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {

            case 1:
                burgerType = BurgerType.RegularBurger;
                break;
            case 2:
                burgerType = BurgerType.HealthyBurger;
                break;
            case 3:
                burgerType = BurgerType.DeluxeBurger;
                break;

            default:
                burgerType = BurgerType.RegularBurger;
                break;
        }
        return burgerType;

    }
}
