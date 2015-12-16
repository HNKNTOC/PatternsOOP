package com.company.decorator.goods;

import com.company.decorator.Goods;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public class Coffee extends Goods {

    public Coffee() {
        name = "Coffee";
        cost=1.3;
    }

    @Override
    public double cost() {
        return cost;
    }
}
