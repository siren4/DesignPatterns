package com.siren.liu.sample.pattern.create.factory.kit;

import com.siren.liu.sample.pattern.IUnit;
import com.siren.liu.sample.pattern.create.factory.IMouse;
import com.siren.liu.sample.pattern.create.factory.method.HpMouseFactory;

public class UnitTest implements IUnit {
    @Override
    public void test() {
        IMouse dellMouse = new DellFactory().createMouse();
        IKeyboard dellKeyboard = new DellFactory().createKeyboard();
        IMouse hpMouse = new HpMouseFactory().createMouse();
        IKeyboard hpKeyboard = new HpFactory().createKeyboard();
        dellMouse.click();
        dellKeyboard.input();
        hpMouse.click();
        hpKeyboard.input();
    }
}
