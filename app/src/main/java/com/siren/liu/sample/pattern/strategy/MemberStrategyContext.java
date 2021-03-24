package com.siren.liu.sample.pattern.strategy;

public class MemberStrategyContext {
    private MemberStrategy strategy;

    public MemberStrategyContext(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcPrice(double price) {
        return strategy.calcPrice(price);
    }
}
