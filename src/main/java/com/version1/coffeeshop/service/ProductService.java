package com.version1.coffeeshop.service;


import com.version1.coffeeshop.model.Product;
import com.version1.coffeeshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
}
