package com.vignesh.project.uber.uberApp.strategies.impl;

import com.vignesh.project.uber.uberApp.dto.RideRequestDto;
import com.vignesh.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
