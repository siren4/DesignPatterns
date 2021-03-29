package com.siren.liu.sample.pattern.decorator;

public class CheeseDrinkDecorator extends DrinkDecorator {

    public CheeseDrinkDecorator(IDrink drink) {
        super(drink);
    }

    @Override
    public int cost() {
        System.out.println("芝士额外花费10元");
        return super.cost()+10;
    }
}
