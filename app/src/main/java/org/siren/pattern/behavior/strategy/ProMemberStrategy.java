package org.siren.pattern.behavior.strategy;

public class ProMemberStrategy implements IMember {
    @Override
    public double calcPrice(double price) {
        System.out.println("pro会员，打5折");
        return 0.5 * price;
    }
}
