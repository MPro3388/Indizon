package com.indizon.indizon.web;

public class Product {
    import javax.persistence.*;
import java.util.Optional;

    @Entity
    @Table(name = "product")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Long id;

        private String name;


        private int price;

        public Product (){}

        public Product(Long id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName(){return name;}

        public int getPrice(){return price;}
        public void setPrice(int price) {
            this.price = price;
        }

        public void setOwner(String email) {
        }
}
