package com.siren.liu.sample.pattern.create.factory.method;

import com.siren.liu.sample.pattern.create.factory.AsusMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class AsusMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new AsusMouse();
    }
}
