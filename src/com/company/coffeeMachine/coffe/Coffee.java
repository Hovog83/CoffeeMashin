package com.company.coffeeMachine.coffe;

import com.company.coffeeMachine.coffe.commands.CommandInterface;
import com.company.coffeeMachine.coffe.commands.CommandsFactory;

import java.util.Scanner;

public class Coffee extends Resources {

    Resources resources = null;

    public Coffee() {
        this.resources = new Resources();
        this.in = new Scanner(System.in);
        this.init();
    }
    public void init(){
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        this.command = in.nextLine();
        if(this.command != "exit"){
            this.start();
        }
    }
    public  void start() {
        CommandsFactory commandsFactory = new CommandsFactory();
        CommandInterface command =  commandsFactory.getCommands(this.command);
        command.start(this.resources,this.in);
        this.init();
    }


}
