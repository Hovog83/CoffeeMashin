package com.company.coffeeMachine.coffe.commands;

import com.company.coffeeMachine.coffe.Resources;

import java.util.Scanner;

public class Fill implements CommandInterface{

    @Override
    public void start(Resources resources, Scanner in) {
        System.out.println("Write how many ml of water do you want to add");
        resources.setResourcesWater(resources.getResourcesWater() + in.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        resources.setResourcesMilk(resources.getResourcesMilk() + in.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        resources.setResourcesCoffee(resources.getResourcesCoffee() + in.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add:");

        // harc
        resources.setResourcesCups(Integer.valueOf(resources.getResourcesCups() + in.nextLine()));
    }
}
