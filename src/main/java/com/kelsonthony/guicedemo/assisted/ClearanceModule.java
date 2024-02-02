package com.kelsonthony.guicedemo.assisted;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class ClearanceModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new FactoryModuleBuilder()
                .implement(Clearable.class,ClearanceProber.class)
                .build(ClearanceProber.ClearanceProberFactory.class));
    }
}
