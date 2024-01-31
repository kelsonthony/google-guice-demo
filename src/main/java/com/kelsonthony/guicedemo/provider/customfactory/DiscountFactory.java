package com.kelsonthony.guicedemo.provider.customfactory;

import com.google.inject.ImplementedBy;

@ImplementedBy(CartDiscountFactory.class)
public interface DiscountFactory {
    public Discountable getDiscount(ShoppingCart cart);
}
