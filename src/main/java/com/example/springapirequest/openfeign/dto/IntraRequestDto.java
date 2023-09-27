package com.example.springapirequest.openfeign.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntraRequestDto {
    @JsonAlias("grant_type")
    private String grantType;
    @JsonAlias("client_id")
    private String clientId;
    @JsonAlias("client_secret")
    private String clientSecret;


}
