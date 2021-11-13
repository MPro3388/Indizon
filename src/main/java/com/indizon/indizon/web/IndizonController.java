package com.indizon.indizon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import scala.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class IndizonController {

    @Autowired
    IndiService service;

    private static final Logger logger = null;

    @GetMapping(path="/")
    public ModelAndView showHWPage(){

        return new ModelAndView("Indizon");
    }




    @GetMapping("/products")
    public List<Product> getProducts(Product product) {

        List<Product> productList =  service.findAll(product.getName());
        return productList;

    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product)

    {
        return service.saveProduct(product);
    }


    @ResponseBody
    @RequestMapping(path = "/createproduct", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public long addNewProduct (@PathVariable("id") long id, @PathVariable("name") String name,
                               @PathVariable("price") int price) {
        Product savedproduct = service.saveProduct(new Product(id,name,price));

        logger.info(savedproduct.toString() + " successfully saved into DB");

        return savedproduct.getId();
    }

    @DeleteMapping("/products/{product}")
    public void delete(@PathVariable Product product) {
        service.deleteProduct(product);
    }
}