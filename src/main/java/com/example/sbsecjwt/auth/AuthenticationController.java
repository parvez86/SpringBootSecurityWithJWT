package com.example.sbsecjwt.auth;

import com.example.sbsecjwt.util.ApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<Object> register(
            @Valid @RequestBody RegisterRequest request
    ) {
        System.out.println(request);
//        ObjectMapper mapper = new ObjectMapper();
        ApiResponse response = service.register(request);
        return  response.getStatus_code()==200 ? ResponseEntity.ok(response.getBody()):ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response.getMessage());
    }
    @PostMapping("/authenticate")
    public ResponseEntity<Object> authenticate(
            @Valid @RequestBody AuthenticationRequest request
    ) {
        ApiResponse  response = service.authenticate(request);
        return response.getStatus_code()==200 ? ResponseEntity.ok(response.getBody()):ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response.getMessage());
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<Object> refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        ApiResponse apiResponse = service.refreshToken(request, response);
        return apiResponse.getStatus_code()==200 ? ResponseEntity.ok(apiResponse.getMessage()):ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiResponse.getMessage());
    }
}
