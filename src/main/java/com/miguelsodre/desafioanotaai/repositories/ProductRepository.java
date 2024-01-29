package com.miguelsodre.desafioanotaai.repositories;

import com.miguelsodre.desafioanotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
