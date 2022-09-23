package com.hriday.rao.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ForgetPasswordRequest {
    @NotBlank
    String resetKey;
    @NotBlank
    String password;
}
