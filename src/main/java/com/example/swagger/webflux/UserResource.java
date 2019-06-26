package com.example.swagger.webflux;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class UserResource {

    @RequestMapping(value = "/api/v1/user", method = RequestMethod.GET)
    public Mono<User> userMono() {
        return Mono.just(new User("Juan Ibarra"));
    }

    @RequestMapping(value = "/api/v1/other-user", method = RequestMethod.GET)
    public Mono<User> otherUserMono() {
        return Mono.just(new User("Jose Parra"));
    }

}
