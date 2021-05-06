package com.siren.liu.sample.pattern.create.factory.method;

import com.siren.liu.sample.pattern.create.factory.DellMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class DellMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }
}
