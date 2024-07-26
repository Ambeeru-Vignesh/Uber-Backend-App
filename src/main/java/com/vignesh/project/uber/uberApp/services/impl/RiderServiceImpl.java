package com.vignesh.project.uber.uberApp.services.impl;

import com.vignesh.project.uber.uberApp.dto.DriverDto;
import com.vignesh.project.uber.uberApp.dto.RideDto;
import com.vignesh.project.uber.uberApp.dto.RideRequestDto;
import com.vignesh.project.uber.uberApp.dto.RiderDto;
import com.vignesh.project.uber.uberApp.services.RiderService;

import java.util.List;

public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
