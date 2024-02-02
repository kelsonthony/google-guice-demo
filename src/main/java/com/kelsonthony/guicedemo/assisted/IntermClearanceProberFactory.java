package com.kelsonthony.guicedemo.assisted;

import com.google.inject.Provider;
import com.kelsonthony.guicedemo.assisted.Clearable;
import com.kelsonthony.guicedemo.assisted.ClearanceProber;
import com.kelsonthony.guicedemo.assisted.Prober;

public class IntermClearanceProberFactory {

    private final Provider<Prober> prober;

    public IntermClearanceProberFactory(Provider<Prober> prober) {
        this.prober = prober;
    }

    public Clearable create(String clearance, Long flightID) {
        return new ClearanceProber(clearance, flightID, prober.get());
    }
}
