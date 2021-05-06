package com.siren.liu.sample.pattern.structure.proxy;

public class UnitTest {
    public void test() {
        PlaintiffProxy proxy = new PlaintiffProxy();
        proxy.submit();
    }

    public void test2() {
        ILawsuit lawsuit = (ILawsuit) new DynamicProxy().bind(new Plaintiff());
        lawsuit.submit();
    }
}
