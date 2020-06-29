package BurgerBuilder;

import Constants.*;
import ToppingsBuilder.*;

import java.util.List;
import java.util.Scanner;

public class DeluxeBurger extends Burger {

        private static Scanner scanner = new Scanner(System.in);


        public List<String> toppings;
        public double totalToppingPrice;

        public DeluxeBurger(String burgerName, Bread bread, double breadPrice, Meat patty, double pattyPrice) {
            super(burgerName, bread, breadPrice, patty, pattyPrice);
        }
        public void buildBurger() {
            toppings = ToppingsBuilder.toppings(6);
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


