package com.siren.liu.sample.pattern.create.factory.simple;

import com.siren.liu.sample.pattern.IUnit;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class UnitTest implements IUnit {
    @Override
    public void test() {
        IMouse mouse1 = MouseFactory.createMouse("Dell");
        IMouse mouse2 = MouseFactory.createMouse("Hp");
        mouse1.sayHi();
        mouse2.sayHi();
    }
}
