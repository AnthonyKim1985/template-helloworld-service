package com.example.templatehelloworldservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldRestController {
    @GetMapping("/hello")
    public Mono<String> hello(@RequestParam("name") String name) {
        return Mono.just("Hello, " + name);
    }
}
