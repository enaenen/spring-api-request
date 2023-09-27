package com.example.springapirequest.openfeign;

import com.example.springapirequest.openfeign.dto.IntraRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "intra-client", url = "https://api.intra.42.fr/")
public interface IntraFeignClient {
    @PostMapping("/oauth/token")
    String getToken(@RequestBody IntraRequestDto intraRequestDto);
}

