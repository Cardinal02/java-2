package Burger;

import Constants.*;
import Builder.*;

import java.util.List;
import java.util.Scanner;

public class HealthyBurger extends Burger {


    public HealthyBurger( Meat patty, List<String> toppings) {
       super(BurgerType.HealthyBurger, Bread.WholeWheat, patty, toppings);

    }


}
