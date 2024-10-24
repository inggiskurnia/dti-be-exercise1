package com.dti.exercise1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @GetMapping("/products")
    public String getAllProducts() {
        return "this is products";
    }

    @GetMapping("/cart")
    public String getCart() {
        return "this is cart";
    }

    @GetMapping("/ping")
    public String getPing() {
        return "pong";
    }
}
