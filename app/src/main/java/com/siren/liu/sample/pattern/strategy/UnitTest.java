package com.siren.liu.sample.pattern.strategy;

public class UnitTest {

    public void test() {
        MemberContext pri = new MemberContext(new PriMemberStrategy());
        pri.calcPrice(100);
        MemberContext pro = new MemberContext(new ProMemberStrategy());
        pro.calcPrice(100);
    }
}
