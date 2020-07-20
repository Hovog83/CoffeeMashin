package com.company.coffeeMachine.coffe;

import com.company.coffeeMachine.coffe.coffeeType.CoffeFactory;
import com.company.coffeeMachine.coffe.coffeeType.CoffeeInterface;

import java.util.Arrays;

public class Coffee {

    private String makeCoffeType = "1"; // wrote string for test
    private Integer water        = 1;
    private Integer milk         = 1;
    private Integer coffee       = 1;
    private Integer willNeed     = 1;

    public void setCoffeType(String type) {
        this.makeCoffeType = type;
    }
    public void setWater(Integer water) {
        this.water = water;
    }
    public void setMilk(Integer milk) {
        this.milk = milk;
    }
    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }
    public void setWillNeed(Integer willNeed) {
        this.willNeed = willNeed;
    }

    public String validation(){
        CoffeFactory coffeFactory = new CoffeFactory();
        CoffeeInterface typeOfCo = coffeFactory.getCoffeType(this.makeCoffeType);
        Integer count = this.canMake(typeOfCo);

        System.out.println("c");
        System.out.println(count);

        System.out.println("c2");
        System.out.println(this.willNeed);

        if(count > this.willNeed){
            return "Yes, I can make that amount of coffee (and even "+( count - this.willNeed )+" more than that)";
        }else if(count == this.willNeed){
            return "Yes, I can make that amount of coffee";
        }
        return "No, I can make only "+(this.canMake(typeOfCo))+" cup(s) of coffee";
    }

    private Integer canMake(CoffeeInterface typeOfC){
        Integer water =  this.water/typeOfC.getWater();
        Integer milk =   this.milk/typeOfC.getMilk() ;
        Integer coffee = this.coffee/typeOfC.getCoffee() ;
        return getMinVal(water,milk,coffee);
    }
    private Integer getMinVal(Integer water,Integer milk, Integer coffee){
        Integer[] caps = {
                water,
                milk,
                coffee,
        };
        Arrays.sort(caps);
        return caps[0];
    }

}
