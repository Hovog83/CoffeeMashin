package com.company.coffeeMachine.coffe;

import java.util.Scanner;

public class Resources {

    protected Scanner in = null;
    protected String command = "Remaining";

    private Integer resourcesWater  = 400;
    private Integer resourcesMilk   = 540;
    private Integer resourcesCoffee = 120;
    private Integer resourcesMoney  = 550;
    private Integer resourcesCups   = 9;

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public Integer getResourcesWater() {
        return resourcesWater;
    }

    public void setResourcesWater(Integer resourcesWater) {
        this.resourcesWater = resourcesWater;
    }

    public Integer getResourcesMilk() {
        return resourcesMilk;
    }

    public void setResourcesMilk(Integer resourcesMilk) {
        this.resourcesMilk = resourcesMilk;
    }

    public Integer getResourcesCoffee() {
        return resourcesCoffee;
    }

    public void setResourcesCoffee(Integer resourcesCoffee) {
        this.resourcesCoffee = resourcesCoffee;
    }

    public Integer getResourcesMoney() {
        return resourcesMoney;
    }

    public void setResourcesMoney(Integer resourcesMoney) {
        this.resourcesMoney = resourcesMoney;
    }

    public Integer getResourcesCups() {
        return resourcesCups;
    }

    public void setResourcesCups(Integer resourcesCups) {
        this.resourcesCups = resourcesCups;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
