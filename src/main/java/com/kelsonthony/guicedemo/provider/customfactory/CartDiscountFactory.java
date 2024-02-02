package com.kelsonthony.guicedemo.provider.customfactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.Map;
import static com.kelsonthony.guicedemo.provider.customfactory.DiscountGuiceModule.DiscountOption;
import static com.kelsonthony.guicedemo.provider.customfactory.DiscountGuiceModule.DiscountOption.*;

@Singleton
public class CartDiscountFactory implements DiscountFactory{

    final Map<DiscountOption, Discountable> discountableBinder;

    @Inject
    public CartDiscountFactory(Map<DiscountOption, Discountable> discountableBinder) {
        this.discountableBinder = discountableBinder;
    }

    @Override
    public Discountable getDiscount(ShoppingCart cart) {
        int currentHour = cart.getTimeOfCheckout().getHour();

        if (isEarlyMorning(currentHour)) {
            return discountableBinder.get(EarlyBird);
        } else if (isLateAtNight(currentHour)) {
            return discountableBinder.get(NightOwl);
        }

        return discountableBinder.get(NoDiscount);
    }

    private boolean isEarlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }
}
