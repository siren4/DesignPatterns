package org.siren.pattern.create.factory.method;

import org.siren.pattern.create.factory.simple.AsusMouse;
import org.siren.pattern.create.factory.simple.IMouse;

public class AsusMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new AsusMouse();
    }
}
