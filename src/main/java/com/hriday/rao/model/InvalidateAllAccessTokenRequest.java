package com.hriday.rao.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InvalidateAllAccessTokenRequest {
    @NotBlank
    private String password;
}
