package com.company.factory.factoryMini.pizzaTypes;

/**
 * Created by HNKNTOC on 16.12.2015.
 */
public abstract class Pizza {

    protected Pizza(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    protected String name = "Pizza name";
    protected int cost = 0;

    public boolean buy(){
        System.out.println(name+" was bought for "+cost+"$");
        return true;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
