package org.sireniu.pattern.create.factory.method;

import org.sireniu.pattern.create.factory.simple.AsusMouse;
import org.sireniu.pattern.create.factory.simple.IMouse;

public class AsusMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new AsusMouse();
    }
}
