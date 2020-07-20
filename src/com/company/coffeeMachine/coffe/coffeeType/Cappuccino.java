package com.company.coffeeMachine.coffe.coffeeType;

public class Cappuccino  implements CoffeeInterface {
    private Integer water = 100;
    private Integer milk = 100;
    private Integer coffee = 100;

    public Integer getWater() {
        return water;
    }
    public Integer getMilk() {
        return milk;
    }
    public Integer getCoffee() {
        return coffee;
    }
}
