package com.evgdim.thread;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public Mono<String> index() {
        return Mono.just("index");
    }
}
