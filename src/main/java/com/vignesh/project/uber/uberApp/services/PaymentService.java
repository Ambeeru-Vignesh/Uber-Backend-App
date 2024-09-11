package com.vignesh.project.uber.uberApp.services;

import com.vignesh.project.uber.uberApp.entities.Payment;
import com.vignesh.project.uber.uberApp.entities.Ride;
import com.vignesh.project.uber.uberApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
