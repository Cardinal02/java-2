package Constants;
import java.util.Scanner;

public enum Bread {

    WhiteBread(1),
    BakeryBrioche(1.50),
    WholeWheat(2);

    private double breadPrice; //Price of bread

    //Constructor
    Bread(double price) {
        breadPrice = price;
    }

    public double getBreadPrice() {
        return breadPrice;
    }
}


    /*

    }*/


