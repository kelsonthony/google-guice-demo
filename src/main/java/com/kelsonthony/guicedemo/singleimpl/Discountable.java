package com.kelsonthony.guicedemo.singleimpl;


import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    double getDiscount();
}
