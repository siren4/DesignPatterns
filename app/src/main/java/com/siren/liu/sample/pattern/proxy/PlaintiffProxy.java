package com.siren.liu.sample.pattern.proxy;

public class PlaintiffProxy implements ILawsuit {
    private ILawsuit lawsuit;

    public PlaintiffProxy() {
        lawsuit = new Plaintiff();
    }

    @Override
    public void submit() {
        submitBefore();
        lawsuit.submit();
        submitAfter();
    }

    private void submitBefore() {
    }

    private void submitAfter() {
    }
}
