package Constants;

public enum Toppings {
    Cheese(1),
    Bacon(1),
    GrilledOnions(0.50),
    GrilledMushrooms(0.50),
    Onion(0.25),
    Tomato(0.25),
    Lettuce(0.25),
    Ketchup(0.25),
    Mayo(0.25),
    Ranch(0.25),
    None(0);

    double toppingPrice;
    //Constructor
    Toppings(double price){
        toppingPrice = price;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }
}
