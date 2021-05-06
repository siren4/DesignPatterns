package com.siren.liu.sample.pattern.create.factory.method;

import com.siren.liu.sample.pattern.create.factory.HpMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class HpMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }
}
