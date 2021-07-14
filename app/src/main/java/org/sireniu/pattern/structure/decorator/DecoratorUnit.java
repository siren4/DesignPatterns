package org.sireniu.pattern.structure.decorator;

public class DecoratorUnit {

    public void test() {
        MochaDrinkDecorator mochaDecorator = new MochaDrinkDecorator(new MilkDrink());
        CheeseDrinkDecorator cheeseDecorator = new CheeseDrinkDecorator(mochaDecorator);
        cheeseDecorator.cost();
    }
}
