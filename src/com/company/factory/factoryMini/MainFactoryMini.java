package com.company.factory.factoryMini;

/**
 * Created by HNKNTOC on 16.12.2015.
 */
public class MainFactoryMini {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.buyPizza("Pizza Deep Dish");
        shop.buyPizza("Pizza Test");
        shop.buyPizza("Pizza Neapolitan");
        shop.buyPizza("Pizza York Style");
        shop.buyPizza("aef");
    }
}
