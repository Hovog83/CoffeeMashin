package com.company.coffeeMachine.coffe.commands;

import com.company.coffeeMachine.coffe.Resources;

import java.util.Scanner;

public class Remaining implements CommandInterface{

    @Override
    public void start(Resources resources, Scanner in) {
        System.out.println("The coffee machine has:\n" +
                            resources.getResourcesWater()+" of water\n" +
                            resources.getResourcesMilk()+" of milk\n" +
                            resources.getResourcesCoffee()+" of coffee beans\n" +
                            resources.getResourcesCups()+" of disposable cups\n" +
                            resources.getResourcesMoney()+" of money\n");
    }

}
