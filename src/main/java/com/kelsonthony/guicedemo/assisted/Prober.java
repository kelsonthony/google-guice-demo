package com.kelsonthony.guicedemo.assisted;

import com.kelsonthony.guicedemo.assisted.exceptions.ProbeException;

public class Prober {

    public ProbeResult probe(Long flightID, String clearance) throws ProbeException {
        if (flightID == 0) {
            throw new ProbeException("Conflict detected");
        }
        return new ProbeResult();
    }
}
