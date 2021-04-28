package com.embeddedcontainer.undertow.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Spring boot running with an embedded Undertow container.";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
