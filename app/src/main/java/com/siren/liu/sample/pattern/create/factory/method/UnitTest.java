package com.siren.liu.sample.pattern.create.factory.method;

import com.siren.liu.sample.pattern.IUnit;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class UnitTest implements IUnit {

    @Override
    public void test() {
        IMouse dellMouse = new DellMouseFactory().createMouse();
        IMouse hpMouse = new HpMouseFactory().createMouse();
        IMouse asusMouse = new AsusMouseFactory().createMouse();
        dellMouse.sayHi();
        hpMouse.sayHi();
        asusMouse.sayHi();
    }
}
