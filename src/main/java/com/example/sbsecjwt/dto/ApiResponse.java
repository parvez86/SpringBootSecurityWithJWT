package com.example.sbsecjwt.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
public class ApiResponse {
//    private String description;

    public ResponseEntity getResponse(String message, String description){
        if (description.equals("Success")){
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
    }
}
