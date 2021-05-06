package com.siren.liu.sample.pattern.behavior.strategy;

public class PriMemberStrategy implements IMember {
    @Override
    public double calcPrice(double price) {
        System.out.println("pri会员，打8折");
        return 0.8 * price;
    }
}
