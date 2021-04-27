package com.embeddedcontainer.jetty.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Spring boot running with an embedded Jetty container.";

    @GetMapping("/")
    public String home() {
        return message;
    }
    
}
