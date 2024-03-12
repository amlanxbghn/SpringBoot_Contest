package com.example.Product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dto.fakeStoreProductDto;

@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";

    public fakeStoreProductDto[] getAllProducts() {
        fakeStoreProductDto response[] = restTemplate.getForObject(url + "/products/", fakeStoreProductDto[].class);
        return response;
    }

    public fakeStoreProductDto getProductbyId(Long id) {
        fakeStoreProductDto response = restTemplate.getForObject(url + "/products/" + id, fakeStoreProductDto.class);
        return response;
        // return "Product from Service with id: " + id;
    }
}