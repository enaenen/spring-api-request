package com.example.springapirequest.config;

import com.slack.api.bolt.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlackApp {
    @Bean
    public App app() {
        App app = new App();
        app.command("/hello", (req, ctx) -> {
            return ctx.ack(":wave: Hello!");
        });
        return app;
    }

}
