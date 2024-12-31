package com.aelio.shopease.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class RegistrationResponse {

    private int code;
    private String message;
}
