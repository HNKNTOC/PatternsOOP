package com.company.decorator;

import com.company.decorator.goods.Coffee;
import com.company.decorator.goods.additions.Milk;
import com.company.decorator.goods.additions.Sugar;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public class MainDecorator {
    public static void main(String[] args) {

        System.out.println(0.2+2.7);

        Goods goods = new Coffee();
        goods = new Milk(goods);
        goods = new Milk(goods);
        goods = new Milk(goods);
        goods = new Milk(goods);
        goods = new Milk(goods);

        goods = new Sugar(goods);
        goods = new Sugar(goods);
        goods = new Sugar(goods);
        goods = new Sugar(goods);

        System.out.printf("%s Cost = %.1f$", goods.getName(),goods.cost());
    }
}
