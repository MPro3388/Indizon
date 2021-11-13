package com.indizon.indizon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import scala.Product;

import java.util.List;

@Controller
public class IndiService {
    @Autowired
    ProductRepository productRepository;

    public MyService(){}

    public List<Product> findAll(String email){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        productRepository.save(product);
        return product;
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
}
