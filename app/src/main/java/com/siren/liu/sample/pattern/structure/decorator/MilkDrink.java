package com.siren.liu.sample.pattern.structure.decorator;

public class MilkDrink implements IDrink {
    @Override
    public int cost() {
        System.out.println("牛奶花费20元");
        return 20;
    }
}
