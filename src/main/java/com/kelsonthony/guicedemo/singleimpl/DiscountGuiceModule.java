package com.kelsonthony.guicedemo.singleimpl;

import com.google.inject.AbstractModule;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(NightOwlDiscount.class);
        //bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
