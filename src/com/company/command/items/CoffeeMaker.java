package com.company.command.items;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class CoffeeMaker implements Item {

    private String thisCook;

    public void cookCoffee(){
        thisCook = "Coffee";
    }

    public void offCook(){
        thisCook = null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "thisCook='" + thisCook + '\'' +
                '}';
    }
}
