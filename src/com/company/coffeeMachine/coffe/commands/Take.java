package com.company.coffeeMachine.coffe.commands;

import com.company.coffeeMachine.coffe.Resources;

import java.util.Scanner;

public class Take implements CommandInterface{
    @Override
    public void start(Resources resources, Scanner in) {
        System.out.println("I gave you "+resources.getResourcesMoney());
        resources.setResourcesMoney(0);
    }
}
