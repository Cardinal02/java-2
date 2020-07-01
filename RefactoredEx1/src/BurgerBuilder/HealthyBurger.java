package BurgerBuilder;

import Constants.*;
import ToppingsBuilder.*;

import java.util.List;
import java.util.Scanner;

public class HealthyBurger extends Burger {
    private static Scanner scanner = new Scanner(System.in);

    public List<String> toppings;
    public double totalToppingPrice;

    public HealthyBurger(Meat patty, double pattyPrice) {
       super("Healthy Burger", Bread.WholeWheat, Bread.WholeWheat.getBreadPrice(),patty, pattyPrice);

    }
    public void buildBurger() {
        toppings = ToppingsBuilder.healthyToppings(4);
        System.out.println(toppings);
        totalToppingPrice = ToppingsBuilder.calculateToppingPrice(toppings);
        System.out.println("Total Toppings Price is $ " + totalToppingPrice);
        plainBurgerPrice();
        totalBurgerPrice();
    }


    public void plainBurgerPrice(){
        plainBurgerPrice = breadPrice + pattyPrice;
        System.out.println("The cost of basic burger without additional toppings is $" + plainBurgerPrice);
    }

    public void totalBurgerPrice(){
        totalBurgerPrice = plainBurgerPrice + totalToppingPrice;
        System.out.println("The cost of total burger price including the toppings is $" + totalBurgerPrice);
    }

}
