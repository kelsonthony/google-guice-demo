package com.kelsonthony.guicedemo.provider.providesbyannotation;

import com.google.inject.Inject;

public class CheckoutService {

    //private final Provider<Discountable> discountable;
    private final Discountable discountable;

    @Inject
    //public CheckoutService(Provider<Discountable> discountable) {
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        //double discount = discountable.get().getDiscount();
        double discount = discountable.getDiscount();
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discount);

        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
                shoppingCartTotal,
                discount * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }
}
