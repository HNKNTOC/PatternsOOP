package com.company.factory.factoryMini;

import com.company.factory.factoryMini.pizzaTypes.Pizza;
import com.company.factory.factoryMini.pizzaTypes.PizzaDeepDish;
import com.company.factory.factoryMini.pizzaTypes.PizzaNeapolitan;
import com.company.factory.factoryMini.pizzaTypes.PizzaYorkStyle;

/**
 * Created by HNKNTOC on 16.12.2015.
 */
public class PizzaFactory {
    public Pizza createPizza(String name){
        Pizza pizza = null;

        switch (name){
            case "Pizza Deep Dish":
                pizza = new PizzaDeepDish(); break;
            case "Pizza Neapolitan":
                pizza = new PizzaNeapolitan(); break;
            case "Pizza York Style":
                pizza = new PizzaYorkStyle(); break;
        }
        return pizza;
    }
}
