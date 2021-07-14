package org.sireniu.pattern.structure.decorator;

public class MochaDrinkDecorator extends DrinkDecorator {
    public MochaDrinkDecorator(IDrink drink) {
        super(drink);
    }

    @Override
    public int cost() {
        System.out.println("抹茶额外花费5元");
        return super.cost() + 5;
    }
}
