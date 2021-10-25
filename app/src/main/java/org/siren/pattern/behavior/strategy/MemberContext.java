package org.siren.pattern.behavior.strategy;

public class MemberContext {
    private IMember strategy;

    public MemberContext(IMember strategy) {
        this.strategy = strategy;
    }

    public double calcPrice(double price) {
        return strategy.calcPrice(price);
    }
}
