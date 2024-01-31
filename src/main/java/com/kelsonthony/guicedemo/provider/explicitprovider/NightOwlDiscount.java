package com.kelsonthony.guicedemo.provider.explicitprovider;

public class NightOwlDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0.35D;
    }
}
