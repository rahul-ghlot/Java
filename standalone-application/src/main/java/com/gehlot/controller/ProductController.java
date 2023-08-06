package com.gehlot.controller;

import com.gehlot.entity.Product;
import com.gehlot.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping("/product")
    public String createProduct(@RequestBody Product product) {
        log.debug("Post request for create product {}", product);
        service.createProduct(product);
        return "product successfully created";
    }
}
