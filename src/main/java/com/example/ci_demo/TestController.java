package com.example.ci_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/endpoint")
    public String testEndpoint(){
        return "Test";
    }

    @GetMapping("/staging")
    public String testStaging(){
        return "Staging health check passed!";
    }

    @GetMapping("/productionn")
    public String testProduction(){
        return "Production health check passed!";
    }

}
