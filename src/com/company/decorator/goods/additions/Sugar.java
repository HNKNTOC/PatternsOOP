package com.company.decorator.goods.additions;

import com.company.decorator.Addition;
import com.company.decorator.Goods;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public class Sugar extends Addition {

    public Sugar(Goods goods) {
        super(goods);
        cost=.2 + goods.cost();
    }

    @Override
    public String getName() {
        return goods.getName() + ", Sugar";
    }

    @Override
    public double cost() {
        return cost;
    }
}
