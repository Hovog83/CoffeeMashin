package com.company.coffeeMachine.coffe.commands;

import com.company.coffeeMachine.coffe.Resources;

import java.util.Scanner;

public interface CommandInterface {
    void start(Resources resources, Scanner in);

}