package com.kelsonthony.guicedemo.assisted;

import com.google.inject.Inject;
import com.kelsonthony.guicedemo.assisted.ClearanceProber.ClearanceProberFactory;
import com.kelsonthony.guicedemo.assisted.exceptions.ClearanceException;

public class ClearanceService {

    private final ClearanceProberFactory clearanceProberFactory;

    @Inject
    public ClearanceService(ClearanceProberFactory clearanceProberFactory) {
        this.clearanceProberFactory = clearanceProberFactory;
    }

    public Clearance requestClearance(String proposedClearance,
                                      FlightPlan flightPlan) throws ClearanceException {
        Clearable clearableProber = clearanceProberFactory.create(proposedClearance, flightPlan.getFlightID());
        return  clearableProber.probeClearance();
    }
}
