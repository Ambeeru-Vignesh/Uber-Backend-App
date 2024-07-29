package com.vignesh.project.uber.uberApp.strategies.impl;

import com.vignesh.project.uber.uberApp.entities.Driver;
import com.vignesh.project.uber.uberApp.entities.RideRequest;
import com.vignesh.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequestDto) {
        return List.of();
    }
}
