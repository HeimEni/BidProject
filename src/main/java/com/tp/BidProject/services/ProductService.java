package com.tp.BidProject.services;

import com.tp.BidProject.entities.Product;
import com.tp.BidProject.repositories.ProductDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductServiceInterface{
    @Autowired
    ProductDAOInterface productDAO;
    @Override
    public Product getProductByid(Integer id) {
        return productDAO.getProductByid(id);
    }

    @Override
    public boolean insertProduct(Product product) {
        return productDAO.insertProduct(product);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

    @Override
    public boolean updateProduct(Integer id, Product product) {
        return productDAO.updateProduct(id,product);
    }

    @Override
    public Product getLastOffer(Product product) {
//        TODO : Implement method that return the last offer sort by date, on product id
        return null;
    }
}
