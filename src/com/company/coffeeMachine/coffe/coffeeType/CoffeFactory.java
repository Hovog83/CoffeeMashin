package com.company.coffeeMachine.coffe.coffeeType;

public class CoffeFactory {
    //use getShape method to get object of type shape
    public CoffeeInterface getCoffeType(String coffeType){

        if(coffeType == null){
            return null;
        }
        if(coffeType.equalsIgnoreCase("1")){
            return new Espresso();
        } else if(coffeType.equalsIgnoreCase("2")){
            return new Latte();
        } else if(coffeType.equalsIgnoreCase("3")){
            return new Cappuccino();
        }
        return new Espresso();
    }

}
