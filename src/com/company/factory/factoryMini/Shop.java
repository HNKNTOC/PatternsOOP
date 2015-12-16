package com.company.factory.factoryMini;

import com.company.factory.factoryMini.pizzaTypes.Pizza;

/**
 * Created by HNKNTOC on 16.12.2015.
 */
public class Shop {

    PizzaFactory pizzaFactory = new PizzaFactory();

    public boolean buyPizza(String name){
        Pizza pizza = pizzaFactory.createPizza(name);

        if(pizza==null){
            System.out.println(name+" not found");
            return false;
        }

        pizza.buy();

        return true;
    }
}
