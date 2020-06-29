package BurgerBuilder;

import Constants.Bread;
import Constants.Meat;
import ToppingsBuilder.*;

import java.util.List;

import static Constants.Bread.*;

public class MakeBurger implements BurgerBuilder {

    Bread bread;
    double breadPrice;
    Meat patty;
    double pattyPrice;
    double plainBurgerPrice;
    double totalBurgerPrice;
    List<String> toppings;
    double totalToppingPrice;

    public MakeBurger(Bread bread, Meat patty, List<String> toppings) {
        this.bread = bread;
        this.patty = patty;
        this.toppings = toppings;
        System.out.println("Your burger has " + patty + " on " + bread + " with added toppings " + toppings);
        plainBurgerPrice();
        totalBurgerPrice();
    }



    private void pattyPriceFinder() {
        switch(patty) {
            case GroundBeef:
                pattyPrice = Meat.GroundBeef.getPattyPrice();
                break;
            case ChickenBreast:
                pattyPrice = Meat.ChickenBreast.getPattyPrice();
                break;
            case BlackBeanVeggie:
                pattyPrice = Meat.BlackBeanVeggie.getPattyPrice();
                break;
        }
    }

    private void breadPriceFinder() {
        switch(bread){
            case WhiteBread:
                breadPrice = WhiteBread.getBreadPrice();
                break;
            case BakeryBrioche:
                breadPrice = BakeryBrioche.getBreadPrice();
                break;
            case WholeWheat:
                breadPrice = WholeWheat.getBreadPrice();
                break;
        }
    }
    @Override
    public void plainBurgerPrice() {
        breadPriceFinder();
        pattyPriceFinder();
        plainBurgerPrice = breadPrice + pattyPrice;
        System.out.println("The cost of basic burger without additional toppings is $" + plainBurgerPrice);

    }
    @Override
    public double totalBurgerPrice() {
        totalToppingPrice = ToppingsBuilder.calculateToppingPrice(toppings);
        totalBurgerPrice = plainBurgerPrice + totalToppingPrice;
        System.out.println("The cost of total burger price including the toppings is $" + totalBurgerPrice);
        return totalBurgerPrice;

    }
}
