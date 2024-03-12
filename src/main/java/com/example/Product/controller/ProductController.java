package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.fakeStoreProductDto;
import com.example.Product.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {
    ProductService ps;

    ProductController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/products/")
    public fakeStoreProductDto[] getAllProducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public fakeStoreProductDto getProductbyId(@PathVariable Long id) {

        return ps.getProductbyId(id);
    }

}