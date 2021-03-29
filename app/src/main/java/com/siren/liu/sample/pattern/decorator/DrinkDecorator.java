package com.siren.liu.sample.pattern.decorator;

public class DrinkDecorator implements IDrink {
    private IDrink drink;

    public DrinkDecorator(IDrink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        return drink.cost();
    }
}
