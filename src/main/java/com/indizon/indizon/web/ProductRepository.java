package com.indizon.indizon.web;

import org.springframework.stereotype.Repository;
import scala.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

    List<Product> findAll();

    Product findById(long id);

    void save(Product product);

    void delete(Product product);
}
