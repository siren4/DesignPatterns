package com.siren.liu.sample.pattern.strategy;

public class CalculatorStrategyContext {
    private CalculatorStrategy strategy;

    public CalculatorStrategyContext(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public int exec(int a, int b) {
        return strategy.exec(a, b);
    }
}
