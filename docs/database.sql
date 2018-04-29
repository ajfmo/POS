CREATE DATABASE  IF NOT EXISTS `posnubeclick` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `posnubeclick`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: posnubeclick
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cashier`
--

DROP TABLE IF EXISTS `cashier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cashier` (
  `cashier_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `cashier_name` varchar(150) NOT NULL,
  `cashier_Fsurname` varchar(100) NOT NULL,
  `cashier_Ssurname` varchar(100) NOT NULL,
  `cashier_address` varchar(150) NOT NULL,
  `cashier_address_external` tinyint(4) NOT NULL,
  `cashier_address_internal` tinyint(4) DEFAULT NULL,
  `cashier_location` varchar(100) NOT NULL,
  `cashier_city` varchar(100) NOT NULL,
  `cashier_Lphone` varchar(45) NOT NULL,
  `cashier_Mphone` varchar(45) DEFAULT NULL,
  `cashier_comission` double DEFAULT NULL,
  PRIMARY KEY (`cashier_id`),
  KEY `fk_Cashier_User1_idx` (`user_id`),
  KEY `fk_Cashier_Employee1_idx` (`employee_id`),
  CONSTRAINT `fk_Cashier_Employee1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cashier_User` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashier`
--

LOCK TABLES `cashier` WRITE;
/*!40000 ALTER TABLE `cashier` DISABLE KEYS */;
/*!40000 ALTER TABLE `cashier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `closingsales`
--

DROP TABLE IF EXISTS `closingsales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `closingsales` (
  `close_id` int(11) NOT NULL,
  `cashier_id` int(11) NOT NULL,
  `close_date` datetime NOT NULL,
  `close_total_sale` double NOT NULL,
  PRIMARY KEY (`close_id`),
  KEY `fk_ClosingSales_Cashier1_idx` (`cashier_id`),
  CONSTRAINT `fk_ClosingSales_Cashier1` FOREIGN KEY (`cashier_id`) REFERENCES `cashier` (`cashier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `closingsales`
--

LOCK TABLES `closingsales` WRITE;
/*!40000 ALTER TABLE `closingsales` DISABLE KEYS */;
/*!40000 ALTER TABLE `closingsales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `customer_Fsurname` varchar(100) DEFAULT NULL,
  `customer_Ssurname` varchar(100) DEFAULT NULL,
  `customer_address` varchar(150) NOT NULL,
  `customer_Lphone` varchar(45) NOT NULL,
  `customer_Mphone` varchar(45) NOT NULL,
  `customer_email` varchar(45) NOT NULL,
  `delivery_address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_email_UNIQUE` (`customer_email`),
  UNIQUE KEY `customer_Mphone_UNIQUE` (`customer_Mphone`),
  UNIQUE KEY `customer_Lphone_UNIQUE` (`customer_Lphone`),
  KEY `fk_Customer_DeliveryAddress1_idx` (`delivery_address_id`),
  CONSTRAINT `fk_Customer_DeliveryAddress1` FOREIGN KEY (`delivery_address_id`) REFERENCES `deliveryaddress` (`delivery_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliveryaddress`
--

DROP TABLE IF EXISTS `deliveryaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliveryaddress` (
  `delivery_id` int(11) NOT NULL AUTO_INCREMENT,
  `delivery_description` varchar(255) NOT NULL,
  `delivery_street` varchar(100) NOT NULL,
  `delivery_external` varchar(45) NOT NULL,
  `delivery_internal` varchar(45) NOT NULL,
  `delivery_location` varchar(45) NOT NULL,
  `delivery_city` varchar(45) NOT NULL,
  PRIMARY KEY (`delivery_id`),
  UNIQUE KEY `delivery_id_UNIQUE` (`delivery_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveryaddress`
--

LOCK TABLES `deliveryaddress` WRITE;
/*!40000 ALTER TABLE `deliveryaddress` DISABLE KEYS */;
/*!40000 ALTER TABLE `deliveryaddress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliveryorder`
--

DROP TABLE IF EXISTS `deliveryorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliveryorder` (
  `delivery_order_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `delivery_address_id` int(11) NOT NULL,
  `sale_detail_id` int(11) NOT NULL,
  `sale_id` int(11) NOT NULL,
  `delivery_date` datetime DEFAULT NULL,
  `delivery_notes` mediumtext,
  PRIMARY KEY (`delivery_order_id`),
  UNIQUE KEY `delivery_order_id_UNIQUE` (`delivery_order_id`),
  KEY `fk_DeliveryOrder_Customer1_idx` (`customer_id`),
  KEY `fk_DeliveryOrder_DeliveryAddress1_idx` (`delivery_address_id`),
  KEY `fk_DeliveryOrder_SaleDetail1_idx` (`sale_detail_id`,`sale_id`),
  CONSTRAINT `fk_DeliveryOrder_Customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_DeliveryOrder_DeliveryAddress` FOREIGN KEY (`delivery_address_id`) REFERENCES `deliveryaddress` (`delivery_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_DeliveryOrder_SaleDetail` FOREIGN KEY (`sale_detail_id`, `sale_id`) REFERENCES `saledetail` (`detail_id`, `sale_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveryorder`
--

LOCK TABLES `deliveryorder` WRITE;
/*!40000 ALTER TABLE `deliveryorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `deliveryorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `employee_name` varchar(150) NOT NULL,
  `employee_FSurname` varchar(100) NOT NULL,
  `employee_Ssurname` varchar(100) NOT NULL,
  `employee_address` varchar(255) NOT NULL,
  `employee_address_external` tinyint(4) NOT NULL,
  `employee_address_internal` tinyint(4) DEFAULT NULL,
  `employee_location` varchar(100) NOT NULL,
  `employee_city` varchar(100) NOT NULL,
  `employee_Lphone` varchar(45) NOT NULL,
  `employee_Mphone` varchar(45) NOT NULL,
  `employee_salary` double DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `fk_Employee_Role_idx` (`role_id`),
  KEY `fk_Employee_User1_idx` (`user_id`),
  CONSTRAINT `fk_Employee_Role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employee_User` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `period`
--

DROP TABLE IF EXISTS `period`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `period` (
  `period_id` int(11) NOT NULL,
  `period_start_date` datetime NOT NULL,
  `period_end_date` datetime NOT NULL,
  `total_sales` double NOT NULL,
  `total_purchases` double NOT NULL,
  `total_expenses` double NOT NULL,
  `total_salaries` double NOT NULL,
  PRIMARY KEY (`period_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `period`
--

LOCK TABLES `period` WRITE;
/*!40000 ALTER TABLE `period` DISABLE KEYS */;
/*!40000 ALTER TABLE `period` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `warehouse_id` int(11) NOT NULL,
  `product_description` varchar(150) NOT NULL,
  `product_cost` double DEFAULT NULL,
  `product_price` double NOT NULL,
  `product_stock` double DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_Product_Warehouse_idx` (`warehouse_id`),
  KEY `Product_Price_idx` (`product_price`),
  CONSTRAINT `fk_Product_Warehouse` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`warehouse_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `purchase_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `warehouse_id` int(11) NOT NULL,
  `purchase_date` datetime NOT NULL,
  `purchase_total` double NOT NULL,
  PRIMARY KEY (`purchase_id`),
  UNIQUE KEY `purchase_id_UNIQUE` (`purchase_id`),
  KEY `fk_Purchase_Supplier_idx` (`supplier_id`),
  KEY `fk_Purchase_Warehouse_idx` (`warehouse_id`),
  KEY `fk_Purchase_Employee_idx` (`employee_id`),
  CONSTRAINT `fk_Purchase_Employee` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Purchase_Supplier` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Purchase_Warehouse` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`warehouse_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchasedetail`
--

DROP TABLE IF EXISTS `purchasedetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchasedetail` (
  `detail_id` varchar(45) NOT NULL,
  `purchase_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `product_qty` double NOT NULL,
  PRIMARY KEY (`detail_id`,`purchase_id`),
  KEY `fk_PurchaseDetail_Product_idx` (`product_id`),
  KEY `fk_PurchaseDetail_Purchase_idx` (`purchase_id`),
  CONSTRAINT `fk_PurchaseDetail_Product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PurchaseDetail_Purchase` FOREIGN KEY (`purchase_id`) REFERENCES `purchase` (`purchase_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchasedetail`
--

LOCK TABLES `purchasedetail` WRITE;
/*!40000 ALTER TABLE `purchasedetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchasedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_description` varchar(150) NOT NULL,
  `role_level` int(11) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `role_description_UNIQUE` (`role_description`),
  UNIQUE KEY `role_level_UNIQUE` (`role_level`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Administrador',1),(2,'qweqwe',22),(3,'Ventas',3);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale` (
  `sale_id` int(11) NOT NULL,
  `cashier_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `sale_date` datetime NOT NULL,
  `sale_total` double NOT NULL,
  PRIMARY KEY (`sale_id`),
  UNIQUE KEY `sale_id_UNIQUE` (`sale_id`),
  KEY `fk_Sale_Customer_idx` (`customer_id`),
  KEY `fk_Sale_Cashier_idx` (`cashier_id`),
  CONSTRAINT `fk_Sale_Cashier` FOREIGN KEY (`cashier_id`) REFERENCES `cashier` (`cashier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sale_Customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saledetail`
--

DROP TABLE IF EXISTS `saledetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saledetail` (
  `detail_id` int(11) NOT NULL,
  `sale_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `product_qty` double NOT NULL,
  PRIMARY KEY (`detail_id`,`sale_id`),
  UNIQUE KEY `detail_id_UNIQUE` (`detail_id`),
  KEY `fk_SaleDetail_Sale_idx` (`sale_id`),
  KEY `fk_SaleDetail_Product_idx` (`product_id`),
  CONSTRAINT `fk_SaleDetail_Product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SaleDetail_Sale` FOREIGN KEY (`sale_id`) REFERENCES `sale` (`sale_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saledetail`
--

LOCK TABLES `saledetail` WRITE;
/*!40000 ALTER TABLE `saledetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `saledetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `supplier_id` int(11) NOT NULL,
  `supplier_name` varchar(150) NOT NULL,
  `supplier_Fsurname` varchar(100) DEFAULT NULL,
  `supplier_Ssurname` varchar(100) DEFAULT NULL,
  `supplier_address` varchar(150) NOT NULL,
  `suplier_location` varchar(100) DEFAULT NULL,
  `supplier_city` varchar(100) DEFAULT NULL,
  `supplier_Lphone` varchar(45) NOT NULL,
  `supplier_Mphone` varchar(45) DEFAULT NULL,
  `supplier_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `user_name` varchar(150) NOT NULL,
  `user_login` varchar(150) NOT NULL,
  `user_pwd` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_User_Role_idx` (`role_id`),
  CONSTRAINT `fk_User_Role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (18383923,1,'Adrian','admin','2374');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse`
--

DROP TABLE IF EXISTS `warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warehouse` (
  `warehouse_id` int(11) NOT NULL,
  `warehouse_description` varchar(150) NOT NULL,
  PRIMARY KEY (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse`
--

LOCK TABLES `warehouse` WRITE;
/*!40000 ALTER TABLE `warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `warehouse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-23 19:50:44
