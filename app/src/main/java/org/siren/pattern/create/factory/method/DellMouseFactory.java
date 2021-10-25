package org.siren.pattern.create.factory.method;

import org.siren.pattern.create.factory.simple.DellMouse;
import org.siren.pattern.create.factory.simple.IMouse;

public class DellMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }
}
