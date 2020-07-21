package com.company.coffeeMachine.coffe.coffeeType;


public class Espresso  implements CoffeeInterface {
    private Integer water = 10000;
    private Integer milk = 100;
    private Integer coffee = 10000;
    private Integer money = 4;

    public Integer getWater() {
        return water;
    }
    public Integer getMilk() {
        return milk;
    }
    public Integer getCoffee() {
        return coffee;
    }
    public Integer getMoney() {
        return money;
    }
}


