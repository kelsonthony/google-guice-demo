package com.kelsonthony.guicedemo.provider.explicitprovider;

import com.google.inject.Provider;

import java.time.LocalTime;

public class DiscountProvider implements Provider<Discountable> {

    //    @Override
//    public Discountable get() {
//        //return new EarlyBirdDiscount();
//        return new NightOwlDiscount();
//    }
    private boolean isEarlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }

    @Override
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
}
