package com.kelsonthony.guicedemo.assisted;

import com.kelsonthony.guicedemo.assisted.exceptions.ClearanceException;

public interface Clearable {

    public Clearance probeClearance() throws ClearanceException;
}
