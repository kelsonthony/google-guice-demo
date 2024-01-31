package com.kelsonthony.guicedemo.provider.providesannotation;

public class NightOwlDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0.35D;
    }
}
