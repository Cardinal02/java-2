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
    Side(double price) {
        sidePrice = price;
    }

    public double getSidePrice() {
        return sidePrice;
    }

}



