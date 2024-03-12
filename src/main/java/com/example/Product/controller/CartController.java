package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.fakeStoreProductDto;
import com.example.Product.service.ProductService;

@RestController
public class CartController {

    @Autowired
    ProductService ps;

     CartController(ProductService ps) {
     this.ps = ps;
     }

    @GetMapping("/articles/")
    public fakeStoreProductDto[] getAllProducts() {
        return ps.getAllProducts();
    }
}