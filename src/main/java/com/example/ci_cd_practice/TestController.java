package com.example.ci_cd_practice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test() {
        return "CI/CD Practice Successful!";
    }
}
