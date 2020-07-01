package Burger;

import Constants.*;
import Builder.*;

import java.util.List;

public class DeluxeBurger extends Burger {

        public DeluxeBurger(BurgerType burgerType, Bread bread, Meat patty, List<String> toppings) {
            super(burgerType,bread,patty,toppings);
        }

    }


