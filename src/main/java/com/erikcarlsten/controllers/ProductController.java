package com.erikcarlsten.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/")
    public String getProduct() {
        return "product";
    }

}
