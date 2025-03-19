package com.curso.cqrs.api.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Value("${api.version}")
    private String apiVersion;

    @GetMapping("/version")
    public String getApiVersion() {
        return apiVersion;
    }
}
