package org.sireniu.pattern.create.factory.method;

import org.sireniu.pattern.create.factory.simple.DellMouse;
import org.sireniu.pattern.create.factory.simple.IMouse;

public class DellMouseFactory implements IMouseFactory {
    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }
}
