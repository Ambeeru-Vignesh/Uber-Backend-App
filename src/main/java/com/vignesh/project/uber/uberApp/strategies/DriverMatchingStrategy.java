package com.vignesh.project.uber.uberApp.strategies;

import com.vignesh.project.uber.uberApp.dto.RideRequestDto;
import com.vignesh.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
