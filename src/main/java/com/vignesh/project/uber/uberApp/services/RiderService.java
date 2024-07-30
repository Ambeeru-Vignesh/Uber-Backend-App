package com.vignesh.project.uber.uberApp.services;

import com.vignesh.project.uber.uberApp.dto.DriverDto;
import com.vignesh.project.uber.uberApp.dto.RideDto;
import com.vignesh.project.uber.uberApp.dto.RideRequestDto;
import com.vignesh.project.uber.uberApp.dto.RiderDto;
import com.vignesh.project.uber.uberApp.entities.Rider;
import com.vignesh.project.uber.uberApp.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);
}
