package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Hamza on 16-6-2016.
 */
@RestController
public class GreetingController {
    public static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(path = {"/greeting/{name}", "/greeting"}, method = RequestMethod.GET)
    public Greeting greeting(@PathVariable Optional<String> name) {
        String greeting = String.format(template, name.isPresent() ? name.get() : "world");
        return new Greeting(counter.incrementAndGet(), greeting);
    }
}
