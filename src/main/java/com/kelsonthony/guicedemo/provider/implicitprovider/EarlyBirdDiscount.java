package com.kelsonthony.guicedemo.provider.implicitprovider;

public class EarlyBirdDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.25;
    }
}
