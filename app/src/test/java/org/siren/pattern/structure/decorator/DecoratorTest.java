package org.siren.pattern.structure.decorator;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class DecoratorTest extends TestCase {

    @Test
    public void test() {
        MochaDrinkDecorator mochaDecorator = new MochaDrinkDecorator(new MilkDrink());
        CheeseDrinkDecorator cheeseDecorator = new CheeseDrinkDecorator(mochaDecorator);
        cheeseDecorator.cost();
    }
}