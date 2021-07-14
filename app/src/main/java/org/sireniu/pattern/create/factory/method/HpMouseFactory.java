package org.sireniu.pattern.create.factory.method;

import org.sireniu.pattern.create.factory.simple.HpMouse;
import org.sireniu.pattern.create.factory.simple.IMouse;

public class HpMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }
}
