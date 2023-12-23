package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

   private int id;
   private String name;
   private String description;
   private double price;
   private int quantity;
   private int category_id;

    public Product(String name, String description, double price, int quantity, int category_id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category_id = category_id;
    }
}
