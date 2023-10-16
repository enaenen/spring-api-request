package com.example.springapirequest.openfeign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "slack-client", url = "https://slack.com/api/")
public interface SlackFeignClient {

}
