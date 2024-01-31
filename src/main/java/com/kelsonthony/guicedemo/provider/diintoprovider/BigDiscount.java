package com.kelsonthony.guicedemo.provider.diintoprovider;

public class BigDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0.35D;
    }
}
