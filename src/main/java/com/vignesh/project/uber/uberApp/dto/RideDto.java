package com.vignesh.project.uber.uberApp.dto;

import com.vignesh.project.uber.uberApp.entities.enums.PaymentMethod;
import com.vignesh.project.uber.uberApp.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long id;
    private PointDto pickUpLocation;
    private PointDto dropOffLocation;

    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
