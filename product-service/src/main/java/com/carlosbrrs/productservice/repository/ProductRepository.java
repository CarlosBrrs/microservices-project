package com.carlosbrrs.productservice.repository;

import com.carlosbrrs.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
