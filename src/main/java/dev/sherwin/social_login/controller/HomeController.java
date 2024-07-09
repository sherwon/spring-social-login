package dev.sherwin.social_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greetings() {
        return "this is public";
    }

    @GetMapping("/secured")
    public String home() {
        return "welcome user";
    }
}
