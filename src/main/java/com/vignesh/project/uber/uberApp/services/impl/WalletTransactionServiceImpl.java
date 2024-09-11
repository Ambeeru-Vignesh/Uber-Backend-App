package com.vignesh.project.uber.uberApp.services.impl;

import com.vignesh.project.uber.uberApp.entities.WalletTransaction;
import com.vignesh.project.uber.uberApp.repository.WalletTransactionRepository;
import com.vignesh.project.uber.uberApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }
}
