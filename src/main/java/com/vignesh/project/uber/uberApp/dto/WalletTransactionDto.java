package com.vignesh.project.uber.uberApp.dto;

import com.vignesh.project.uber.uberApp.entities.enums.TransactionMethod;
import com.vignesh.project.uber.uberApp.entities.enums.TransactionType;

import java.time.LocalDateTime;

public class WalletTransactionDto {

    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    private RideDto ride;

    private String transactionId;

    private WalletDto wallet;

    private LocalDateTime timeStamp;

}
