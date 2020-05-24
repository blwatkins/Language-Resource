package com.example.restwithdata.simple;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/simple")
public class SimpleRestController {

    @GetMapping("/greeting")
    public Greeting helloWorld() {
        return (new Greeting("Hello, World!"));
    }

    @GetMapping("/greeting/{name}")
    public Greeting greetingWithName(@PathVariable String name) {
        String message = "Hello, " + name + "!";
        return (new Greeting(message));
    }

    @GetMapping("/greetingParam")
    public Greeting greetingWithParam(@RequestParam(name="name", defaultValue="World") String name) {
        String message = "Hello, " + name + "!";
        return (new Greeting(message));
    }
}
