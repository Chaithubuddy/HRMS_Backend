package com.SpyDTech.HRMS.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SigninRequest {

    private String email;

    private String password;

}
