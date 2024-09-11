package com.vignesh.project.uber.uberApp.services;

import com.vignesh.project.uber.uberApp.entities.Ride;
import com.vignesh.project.uber.uberApp.entities.User;
import com.vignesh.project.uber.uberApp.entities.Wallet;
import com.vignesh.project.uber.uberApp.entities.WalletTransaction;
import com.vignesh.project.uber.uberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);
}
