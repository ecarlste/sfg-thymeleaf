package com.erikcarlsten.controllers;

import com.erikcarlsten.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String getProduct() {
        return "product";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@RequestParam Integer id, Model model) {

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }

}
