package com.company;

import com.company.coffeeMachine.coffe.Coffee;

import java.util.Scanner;

public class Make  {

    public Make(){
        validation();
    }
    public void validation() {
        Coffee coffeeMashin = new Coffee();
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        coffeeMashin.setCoffeType(in.nextLine()); // wrote string for test
        System.out.println("Write how many ml of water the coffee machine has");
        coffeeMashin.setWater(in.nextInt());
        System.out.println("Write how many ml of milk the coffee machine has");
        coffeeMashin.setMilk(in.nextInt());
        System.out.println("Write how many grams of coffee beans the coffee machine has");
        coffeeMashin.setCoffee(in.nextInt());
        System.out.println("Write how many cups of coffee you will need");
        coffeeMashin.setWillNeed(in.nextInt());
        System.out.println(coffeeMashin.validation());
    }

}
