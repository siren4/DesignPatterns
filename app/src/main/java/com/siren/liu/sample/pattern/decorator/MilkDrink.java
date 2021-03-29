package com.siren.liu.sample.pattern.decorator;

public class MilkDrink implements IDrink {
    @Override
    public int cost() {
        System.out.println("牛奶花费20元");
        return 20;
    }
}
