package com.kelsonthony.guicedemo.provider.customfactory;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

import static com.kelsonthony.guicedemo.provider.customfactory.DiscountGuiceModule.DiscountOption.*;

public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {

        MapBinder<DiscountOption, Discountable> mapBinder
                = MapBinder.newMapBinder(
                        binder(),
                    DiscountOption.class, Discountable.class);

        mapBinder.addBinding(EarlyBird).to(EarlyBirdDiscount.class);
        mapBinder.addBinding(NightOwl).to(NightOwlDiscount.class);
        mapBinder.addBinding(NoDiscount).to(NoDiscount.class);

    }

    public enum DiscountOption {
        EarlyBird, NightOwl, NoDiscount;
    }
}
