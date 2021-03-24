package com.siren.liu.sample.pattern.strategy;

public class Test {

    public static void test() {
        MemberStrategyContext pri = new MemberStrategyContext(new PriMemberStrategy());
        pri.calcPrice(100);
        MemberStrategyContext pro = new MemberStrategyContext(new ProMemberStrategy());
        pro.calcPrice(100);
    }
}
