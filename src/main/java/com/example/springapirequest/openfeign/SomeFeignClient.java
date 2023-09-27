package com.example.springapirequest.openfeign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "some-client", url = "https://some-url.com/")
public interface SomeFeignClient {

}
