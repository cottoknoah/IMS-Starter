package com.qa.ims.controller;

<<<<<<< HEAD
<<<<<<< HEAD
package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

/**
 * Takes in Order details for CRUD functionality
 *
 */
public class OrderController implements CrudController<Order> {

    public static final Logger LOGGER = LogManager.getLogger();

    private OrderDAO OrderDAO;
    private Utils utils;

    public OrderController(OrderDAO OrderDAO, Utils utils) {
        super();
        this.OrderDAO = OrderDAO;
        this.utils = utils;
    }

    /**
     * Reads all Orders to the logger
     */
    @Override
    public List<Order> readAll() {
        List<Order> Orders = OrderDAO.readAll();
        for (Order Order : Orders) {
            LOGGER.info(Order);
        }
        return Orders;
    }

    /**
     * Creates a Order by taking in user input
     */
    @Override
    public Order create() {
        LOGGER.info("Please enter a first name");
        String firstName = utils.getString();
        LOGGER.info("Please enter a surname");
        String surname = utils.getString();
        Order Order = OrderDAO.create(new Order(firstName, surname));
        LOGGER.info("Order created");
        return Order;
    }

    /**
     * Updates an existing Order by taking in user input
     */
    @Override
    public Order update() {
        LOGGER.info("Please enter the id of the Order you would like to update");
        Long id = utils.getLong();
        LOGGER.info("Please enter a first name");
        String firstName = utils.getString();
        LOGGER.info("Please enter a surname");
        String surname = utils.getString();
        Order Order = OrderDAO.update(new Order(id, firstName, surname));
        LOGGER.info("Order Updated");
        return Order;
    }

    /**
     * Deletes an existing Order by the id of the Order
     *
     * @return
     */
    @Override
    public int delete() {
        LOGGER.info("Please enter the id of the Order you would like to delete");
        Long id = utils.getLong();
        return OrderDAO.delete(id);
    }

=======
public class OrderController {
>>>>>>> feature
=======
public class OrderController {
>>>>>>> feature
}
