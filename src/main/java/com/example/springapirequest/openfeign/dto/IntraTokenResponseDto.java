package com.example.springapirequest.openfeign.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class IntraTokenResponseDto {

    @JsonAlias("access_token")
    private String accessToken;
    @JsonAlias("token_type")
    private String tokenType;
    @JsonAlias("expires_in")
    private String expiresIn;
    @JsonAlias("created_at")
    private String createdAt;
    private String scope;

}
