package org.siren.pattern.structure.proxy;

public class ProxyUnit {
    public void test1() {
        PlaintiffProxy proxy = new PlaintiffProxy();
        proxy.submit();
    }

    public void test2() {
        ILawsuit lawsuit = (ILawsuit) new DynamicProxy().bind(new Plaintiff());
        lawsuit.submit();
    }
}
