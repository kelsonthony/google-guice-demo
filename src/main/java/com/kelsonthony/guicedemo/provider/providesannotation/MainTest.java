package com.kelsonthony.guicedemo.provider.providesannotation;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainTest {
    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100.00D);
    }
}