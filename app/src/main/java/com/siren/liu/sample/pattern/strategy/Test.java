package com.siren.liu.sample.pattern.strategy;

import android.text.TextUtils;

public class Test {

    public static void test(int a, int b, String symbol) {
        CalculatorStrategyContext strategy;
        if (TextUtils.equals(symbol, "-")) {
            strategy = new CalculatorStrategyContext(new SubStrategy());
        } else {
            strategy = new CalculatorStrategyContext(new AddStrategy());
        }
        strategy.exec(a, b);
    }
}
