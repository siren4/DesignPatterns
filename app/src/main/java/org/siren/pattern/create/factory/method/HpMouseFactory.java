package org.siren.pattern.create.factory.method;

import org.siren.pattern.create.factory.simple.HpMouse;
import org.siren.pattern.create.factory.simple.IMouse;

public class HpMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }
}
