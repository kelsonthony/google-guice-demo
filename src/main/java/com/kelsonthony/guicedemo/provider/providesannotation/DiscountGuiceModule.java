package com.kelsonthony.guicedemo.provider.providesannotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.time.LocalTime;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(Discountable.class).toProvider(DiscountProvider.class);
    }

    @Provides
    public Discountable get() {
        int hour = LocalTime.now().getHour();

        if (isEarlyMorning(hour)) {
            return new EarlyBirdDiscount();
        }
        else if (isLateAtNight(hour)) {
            return new NightOwlDiscount();
        }

        return  new NoDiscount();
    }

    private boolean isEarlyMorning(int currentHour) {

        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {

        return (currentHour >= 0 && currentHour <= 4);
    }
}
