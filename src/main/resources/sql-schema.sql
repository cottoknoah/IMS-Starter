SHOW DATABASES;
# SELECT database();

DROP SCHEMA ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;

SHOW TABLES;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `customer_id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `last_name` VARCHAR(40) DEFAULT NULL,
    `email` VARCHAR(40) DEFAULT NULL,
     PRIMARY KEY (`customer_id`),
     UNIQUE INDEX `email_UNIQUE` (`email`)
);

# DESC customers;

CREATE TABLE IF NOT EXISTS `ims`.`products` (
        `product_id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
        `product_name` VARCHAR(40) DEFAULT NULL,
        `product_price` FLOAT UNSIGNED DEFAULT NULL,
        PRIMARY KEY (`product_id`)
);

# DESC products;

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
        `order_id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
        `customer_id` INT(11) UNSIGNED DEFAULT NULL,
        `order_date` DATE DEFAULT NULL,
        PRIMARY KEY (`order_id`),
        FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
);

# DESC orders;

# Table the connects Many to Many Relationships
CREATE TABLE IF NOT EXISTS `ims`.`orders_products` (
         `orders_order_id` INT(11) UNSIGNED NULL,
         `products_product_id` INT(11) UNSIGNED NOT NULL,
         FOREIGN KEY (orders_order_id) REFERENCES orders (order_id),
         FOREIGN KEY (products_product_id) REFERENCES products (product_id)
);

