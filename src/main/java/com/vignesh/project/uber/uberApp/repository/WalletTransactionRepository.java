package com.vignesh.project.uber.uberApp.repository;

import com.vignesh.project.uber.uberApp.entities.Wallet;
import com.vignesh.project.uber.uberApp.entities.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {
}
