package com.example.modutest.service;

import com.example.modutest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j(topic = "User Service")
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
}
