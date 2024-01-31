package com.kelsonthony.guicedemo.provider.implicitprovider;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kelsonthony.guicedemo.singleimpl.DiscountGuiceModule;

public class MainTest {
    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(200.00D);
    }
}