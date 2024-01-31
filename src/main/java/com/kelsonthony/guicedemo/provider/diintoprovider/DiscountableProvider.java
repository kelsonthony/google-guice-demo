package com.kelsonthony.guicedemo.provider.diintoprovider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import java.util.Map;
import java.util.Random;

public class DiscountableProvider implements Provider<Discountable> {

    private final Random random;
    private final Map<Integer, Discountable> mapBinder;

    @Inject
    public DiscountableProvider(Random random, Map<Integer, Discountable> mapBinder) {
        this.random = random;
        this.mapBinder = mapBinder;
    }

    @Override
    public Discountable get() {
        return mapBinder.get(random.nextInt(mapBinder.size()));
    }
}
