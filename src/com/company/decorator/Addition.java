package com.company.decorator;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public abstract class Addition extends Goods {
     public Goods goods;

     public Addition(Goods goods) {
          this.goods = goods;
     }

     public abstract String getName();
}
