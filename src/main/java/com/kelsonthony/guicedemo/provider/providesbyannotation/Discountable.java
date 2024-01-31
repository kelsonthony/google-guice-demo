package com.kelsonthony.guicedemo.provider.providesbyannotation;

import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    double getDiscount();
}
