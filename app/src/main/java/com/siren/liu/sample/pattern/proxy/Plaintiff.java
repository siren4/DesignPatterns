package com.siren.liu.sample.pattern.proxy;

public class Plaintiff implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("原告提交诉讼申请！");
    }
}
