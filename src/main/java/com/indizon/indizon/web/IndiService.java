package com.indizon.indizon.web;

import org.springframework.stereotype.Service;
import scala.Product;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndiService {
    private final ProductRepository productRepository;

    public IndiService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){

        List<Product> product =productRepository.findAll();
        return product.stream()
                .collect(Collectors.toList());
    }

    public Product create(PersonManipulationRequest request) {
        var product = new Product(request.getId(), request.getName(), request.getPrice());
        product = productRepository.save(product);
        return (Product) ProductTransformer.transformEntity(product);
    }

    public Product saveProduct(Product product){
        productRepository.save(product);
        return product;
    }

    public boolean deleteById(Long id) {
        if (!productRepository.existsById(id)) {
            return false;
        }

        productRepository.deleteById(id);
        return true;
    }

    private class PersonManipulationRequest {
        public Object getId() {
            return null;
        }
        public Object getName() {
            return null;
        }
        public Object getPrice() {
            return null;
        }
    }
}
