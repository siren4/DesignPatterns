package org.sireniu.pattern.create.factory.simple;

public class MouseFactory {
    public static IMouse createMouse(String brand) {
        switch (brand) {
            case "Dell":
                return new DellMouse();
            case "Hp":
                return new HpMouse();
            default:
                return new AsusMouse();
        }
    }
}
