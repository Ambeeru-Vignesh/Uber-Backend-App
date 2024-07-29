package com.vignesh.project.uber.uberApp.strategies;

import com.vignesh.project.uber.uberApp.dto.RideRequestDto;
import com.vignesh.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequest rideRequestDto);
}
