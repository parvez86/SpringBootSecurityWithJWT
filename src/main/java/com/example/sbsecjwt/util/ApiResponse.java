package com.example.sbsecjwt.util;

import com.example.sbsecjwt.auth.AuthenticationResponse;
import lombok.*;
import org.springframework.stereotype.Component;

//@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private int status_code = 200;
    private String message = null;
    private AuthenticationResponse body=null;
}
