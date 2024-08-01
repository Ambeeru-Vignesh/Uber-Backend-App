package com.vignesh.project.uber.uberApp.services;

import com.vignesh.project.uber.uberApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);

}
