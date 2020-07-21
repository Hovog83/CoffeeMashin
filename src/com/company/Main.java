package com.company;

import com.company.coffeeMachine.coffe.Coffee;

public class Main {

    public static void main(String[] args) {
        Make app =  new Make();
        app.command();
        new Coffee();
    }
}
