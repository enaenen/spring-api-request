package com.example.springapirequest.openfeign;

import com.example.springapirequest.openfeign.dto.IntraTokenResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "intra-client", url = "https://api.intra.42.fr/")
public interface IntraFeignClient {

    @PostMapping("/oauth/token")
    IntraTokenResponseDto getToken(@RequestParam("grant_type") String grantType,
            @RequestParam("client_id") String clientId,
            @RequestParam("client_secret") String clientSecret);

}

