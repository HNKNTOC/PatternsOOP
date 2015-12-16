package com.company.decorator.goods.additions;

import com.company.decorator.Addition;
import com.company.decorator.Goods;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public class Milk extends Addition {

    public Milk(Goods goods) {
        super(goods);
        cost=0.5 + goods.cost();
    }

    @Override
    public double cost() {
        return .5 + goods.cost();
    }

    @Override
    public String getName() {
        return goods.getName() + ", Milk";
    }
}
