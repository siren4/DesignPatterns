package com.siren.liu.sample.pattern.structure.decorator;

public class UnitTest {

    public void test() {
        MochaDrinkDecorator mochaDecorator = new MochaDrinkDecorator(new MilkDrink());
        CheeseDrinkDecorator cheeseDecorator = new CheeseDrinkDecorator(mochaDecorator);
        cheeseDecorator.cost();
    }
}
