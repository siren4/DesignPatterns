package com.siren.liu.sample.pattern.create.factory.abstracted;

import com.siren.liu.sample.IUnit;

public class UnitTest implements IUnit {
    @Override
    public void test() {
        DellFactory dellFactory = new DellFactory();
        HpFactory hpFactory = new HpFactory();
        dellFactory.createMouse().click();
        dellFactory.createKeyboard().input();
        hpFactory.createMouse().click();
        hpFactory.createKeyboard().input();
    }
}
