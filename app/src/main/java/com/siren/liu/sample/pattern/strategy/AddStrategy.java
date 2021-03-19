package com.siren.liu.sample.pattern.strategy;

public class AddStrategy implements CalculatorStrategy {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
