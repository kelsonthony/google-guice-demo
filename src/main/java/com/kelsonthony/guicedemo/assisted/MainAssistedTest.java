package com.kelsonthony.guicedemo.assisted;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.kelsonthony.guicedemo.assisted.exceptions.ClearanceException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainAssistedTest {

    private final ClearanceService clearanceService;

    @Inject
    public MainAssistedTest(ClearanceService clearanceService) {
        this.clearanceService = clearanceService;
    }

    public void start() {
        Clearance clearance = null;

        FlightPlan randomFlightPlan = getRandomFlightPlan();

        try {
            clearance = clearanceService.requestClearance(
                    getRandomRequestClearance(),
                    randomFlightPlan);
        } catch (ClearanceException ex) {
            System.out.println("No Clearance for you!");
        }

        System.out.format("You are cleared to send clearance %s for ACID %s",
                clearance.getClearance(),
                randomFlightPlan.getAcid());
    }

    public static void main(String[] args) {

        Injector guice = Guice.createInjector(new ClearanceModule());
        MainAssistedTest application = guice.getInstance(MainAssistedTest.class);
        application.start();
    }

    private FlightPlan getRandomFlightPlan() {
        List<FlightPlan> flightplans = Arrays.asList(
                new FlightPlan(1L).setAcid("AVA010"),
                new FlightPlan(2L).setAcid("SAT453"),
                new FlightPlan(3L).setAcid("AFR538"),
                new FlightPlan(4L).setAcid("TAP871"),
                new FlightPlan(5L).setAcid("AVA766")
        );

        Random random = new Random();
        return flightplans.get(random.nextInt(flightplans.size()));

    }

    private String getRandomRequestClearance() {
        List<String> speedClearances = Arrays.asList(
                "M080", "M081", "F370", "M083", "F330"
        );

        Random random = new Random();
        return speedClearances.get(random.nextInt(speedClearances.size()));

    }
}
