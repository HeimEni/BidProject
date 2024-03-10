package com.tp.BidProject.services;

import com.tp.BidProject.entities.Product;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface ProductServiceInterface {
    Product getProductByid(Integer id);
    boolean insertProduct(Product product);
    List<Product> getAll();
    boolean updateProduct(Integer id, Product product);
    Product getLastOffer(Product product);
}
