package com.vignesh.project.uber.uberApp.services.impl;

import com.vignesh.project.uber.uberApp.dto.DriverDto;
import com.vignesh.project.uber.uberApp.dto.SignupDto;
import com.vignesh.project.uber.uberApp.dto.UserDto;
import com.vignesh.project.uber.uberApp.entities.User;
import com.vignesh.project.uber.uberApp.entities.enums.Role;
import com.vignesh.project.uber.uberApp.exceptions.RuntimeConflictException;
import com.vignesh.project.uber.uberApp.repository.UserRepository;
import com.vignesh.project.uber.uberApp.services.AuthService;
import com.vignesh.project.uber.uberApp.services.RiderService;
import com.vignesh.project.uber.uberApp.services.WalletService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;
    private final WalletService walletService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if (user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email"+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto,User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);
        riderService.createNewRider(savedUser);
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDto.class);

    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
