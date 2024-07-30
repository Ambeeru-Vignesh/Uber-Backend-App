package com.vignesh.project.uber.uberApp.services;

import com.vignesh.project.uber.uberApp.dto.DriverDto;
import com.vignesh.project.uber.uberApp.dto.SignupDto;
import com.vignesh.project.uber.uberApp.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);

}
