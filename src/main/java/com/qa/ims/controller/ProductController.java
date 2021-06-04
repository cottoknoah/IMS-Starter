package com.qa.ims.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.persistence.dao.ProductDAO;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.Utils;

public class ProductController implements CrudController<Product> {

    public static final Logger LOGGER = LogManager.getLogger();

    private ProductDAO ProductDAO;
    private Utils utils;

    public ProductController(ProductDAO ProductDAO, Utils utils) {
        super();
        this.ProductDAO = ProductDAO;
        this.utils = utils;
    }

    @Override
    public List<Product> readAll() {
        List<Product> Products = ProductDAO.readAll();
        for (Product Product : Products) {
            LOGGER.info(Product);
        }
        return Products;
    }

    @Override
    public Product create() {
        LOGGER.info("Please enter a product name");
        String ProductName = utils.getString();
        LOGGER.info("Please enter a product price");
        double price = utils.getDouble();
        Product Product = ProductDAO.create(new Product(ProductName, ProductPrice));
        LOGGER.info("Product created");
        return Product;
    }

    //UPDATES AN EXISTING Product BY TAKING IN USER INPUT
    @Override
    public Product update() {
        LOGGER.info("Please enter the id of the Product you would like to update");
        Long id = utils.getLong();
        LOGGER.info("Please enter an Product name");
        String ProductName = utils.getString();
        LOGGER.info("Please enter a price");
        double price = utils.getDouble();
        Product Product = ProductDAO.update(new Product(id, ProductName, price));
        LOGGER.info("Product Updated");
        return Product;
    }

    //DELETES AN EXISTING Product BY ID
    @Override
    public int delete() {
        LOGGER.info("Please enter the id of the Product you would like to delete");
        Long id = utils.getLong();
        return ProductDAO.delete(id);
    }

}