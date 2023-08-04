package com.gehlot.service;

import com.gehlot.entity.Product;
import com.gehlot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public void createProduct(Product product){
        repository.save(product);
    }
}
