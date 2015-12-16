package com.company.decorator;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public abstract class Goods {
    protected String name = "";
    public abstract double cost();
    protected double cost;

    public String getName() {
        return name;
    }
}
