
USE `ims` ;
SHOW TABLES;

INSERT INTO `ims`.`customers` (`first_name`, `last_name`, `email`)
VALUES ('Harry', 'Potter', 'email@email.com');
INSERT INTO `ims`.`customers` (`first_name`, `last_name`, `email`)
VALUES ('Hermoine', 'Granger', 'email@email.com');
INSERT INTO `ims`.`customers` (`first_name`, `last_name`, `email`)
VALUES ('Ronald', 'Weasley', 'email@email.com');


INSERT INTO `ims`.`products` (`product_name`,`product_price`)
VaLUES ('PS5', '599.99');
INSERT INTO `ims`.`products` (`product_name`,`product_price`)
VaLUES ('GameCube', '29.00');
INSERT INTO `ims`.`products` (`product_name`,`product_price`)
VaLUES ('Skateboard', '120.00');


INSERT INTO `ims`.`orders` (`order_date`)
VaLUES ('2021-12-25');
INSERT INTO `ims`.`orders` (`order_date`)
VaLUES ('2021-10-31');
INSERT INTO `ims`.`orders` (`order_date`)
VaLUES ('2021-07-04');
INSERT INTO `ims`.`orders` (`order_date`)
VaLUES ('1992-01-11');
INSERT INTO `ims`.`orders` (`order_date`)
VaLUES ('2001-03-17');