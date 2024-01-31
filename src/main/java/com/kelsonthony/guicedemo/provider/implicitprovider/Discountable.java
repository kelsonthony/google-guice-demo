package com.kelsonthony.guicedemo.provider.implicitprovider;


import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    double getDiscount();
}
