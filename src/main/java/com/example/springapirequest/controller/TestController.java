package com.example.springapirequest.controller;

import com.example.springapirequest.openfeign.IntraFeignClient;
import com.example.springapirequest.openfeign.dto.IntraRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final IntraFeignClient intraFeignClient;

    @Value("${intra.client-id}")
    private final String clientId;

    @GetMapping("/token")
    public String getToken() {
        intraFeignClient.getToken(
                IntraRequestDto.builder()
                        .clientId("u-s4t2ud-fe7fae06169cf2621b8e427a415c5ae6e8f6516840ed7373486e7a7c4598bf0b")
                        .clientSecret("")
                        .build()
                );
        return "test/token";
    }
}
