package com.example.springrestsecurity1;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")

public class RestController {

    @GetMapping(value = "/service1")
    @PreAuthorize("hasRole('ROLE1')")
    public String service1() {
        return "service1";
    }

    @GetMapping("/service2")
    @PreAuthorize("hasRole('ROLE2')")
    public String service2() {
        return "service2";
    }

}
