package com.vignesh.project.uber.uberApp.services.impl;

import com.vignesh.project.uber.uberApp.dto.DriverDto;
import com.vignesh.project.uber.uberApp.dto.RideDto;
import com.vignesh.project.uber.uberApp.dto.RiderDto;
import com.vignesh.project.uber.uberApp.services.DriverService;

import java.util.List;

public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}