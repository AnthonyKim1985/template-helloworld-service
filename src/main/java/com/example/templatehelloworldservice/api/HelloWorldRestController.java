package com.example.templatehelloworldservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldRestController {
    @GetMapping("/api/v1/admins/hello")
    public Mono<String> helloAdmin(@RequestParam("name") String name) {
        return Mono.just("Hello, " + name);
    }

    @GetMapping("/api/v1/managers/hello")
    public Mono<String> helloManager(@RequestParam("name") String name) {
        return Mono.just("Hello, " + name);
    }

    @GetMapping("/api/v1/staff/hello")
    public Mono<String> helloStaff(@RequestParam("name") String name) {
        return Mono.just("Hello, " + name);
    }
}
