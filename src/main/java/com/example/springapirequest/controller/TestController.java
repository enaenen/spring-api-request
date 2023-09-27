package com.example.springapirequest.controller;

import com.example.springapirequest.openfeign.IntraFeignClient;
import com.example.springapirequest.openfeign.dto.IntraRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Log4j2
public class TestController {
    private final IntraFeignClient intraFeignClient;

    @Value("${intra.client-id}")
    private String clientId;
    @Value("${intra.client-secret}")
    private String clientSecret;
    @Value("${intra.grant-type}")
    private String grantType;

    @GetMapping("/token")
    public String getToken() {
        log.info("clientId: {}", clientId);
        String token = intraFeignClient.getToken(
                IntraRequestDto.builder()
                        .clientId(clientId)
                        .clientSecret(clientSecret)
                        .grantType(grantType)
                        .build()
        );
        return token;
    }
}
