package com.kelsonthony.guicedemo.provider.diintoprovider;

public class SmallDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0.05D;
    }
}
