package com.example.modutest.controller;

import com.example.modutest.request.UserLoginRequest;
import com.example.modutest.request.UserRegistrationRequest;
import com.example.modutest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@RestControllerAdvice // 전역 예외 처리
public class UserController {

    private final UserService userService; // UserService는 사용자 관리 서비스로 실제 구현 필요

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        try {
            // registrationRequest에서 필요한 사용자 정보 추출 및 유효성 검사
            // Request패키지를 새로 생성함
            // userService를 사용하여 사용자 등록 처리
            return ResponseEntity.ok("사용자 등록 성공!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest loginRequest) {
        try {
            // loginRequest에서 사용자 로그인 정보 추출
            // userService를 사용하여 사용자 로그인 처리
            // 로그인이 성공하면 적절한 응답을 반환
            // 실패하면 Exception을 던지고 전역 예외 처리 메서드가 처리하도록 함
            return ResponseEntity.ok("사용자 로그인 성공!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // 다른 메서드 추가 가능

}

