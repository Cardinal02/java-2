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

    Drink(double price) {
        drinkPrice = price;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

}

