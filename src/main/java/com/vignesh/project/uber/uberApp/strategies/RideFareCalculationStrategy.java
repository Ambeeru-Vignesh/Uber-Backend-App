package com.vignesh.project.uber.uberApp.strategies;

import com.vignesh.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
