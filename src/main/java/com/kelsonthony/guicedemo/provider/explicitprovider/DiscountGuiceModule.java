package com.kelsonthony.guicedemo.provider.explicitprovider;

import com.google.inject.AbstractModule;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }
}
