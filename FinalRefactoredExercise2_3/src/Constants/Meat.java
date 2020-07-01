package Constants;

import java.util.Scanner;

public enum Meat {
    GroundBeef(3.50),
    ChickenBreast(3.75),
    BlackBeanVeggie(3.25);

    double pattyPrice;
    //constructor

    Meat(double price) {
        pattyPrice = price;
    }

    public double getPattyPrice() {
        return pattyPrice;
    }

}
/*

*/
