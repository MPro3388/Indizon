package com.indizon.indizon.web;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    List<Product> findAllByName(String name);

    List<Product> findAll();

    boolean existsById(Long id);

    void deleteById(Long id);

    scala.Product save(scala.Product product);

    Object save(Product product);
}
