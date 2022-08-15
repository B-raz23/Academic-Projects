-- MariaDB dump 10.19  Distrib 10.4.18-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: Kuwadol_Organic_Farm
-- ------------------------------------------------------
-- Server version	10.4.18-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CustomerID` varchar(50) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Phone` int(11) NOT NULL,
  PRIMARY KEY (`CustomerID`),
  UNIQUE KEY `Phone` (`Phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('CIOS0','Ashish','Nepal',1928375),('CIOS1','Ray Young Bear','London',9876543),('CIOS2','Komal',' ',8765432),('CIOS3','C.Ronaldo','Portugal',7654321),('CIOS4','L.Messi','Argentina',6543210),('CIOS5','Will Smith','London',5432109),('CIOS6','Bikrant','US',4321098),('CIOS7','Alok','Nepal',3210987),('CIOS8','Komal',' ',2109876),('CIOS9','Sahil','Greenland',1098765);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dealer`
--

DROP TABLE IF EXISTS `dealer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dealer` (
  `DealerID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Phone` int(11) NOT NULL,
  `Email` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`DealerID`),
  UNIQUE KEY `Phone` (`Phone`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dealer`
--

LOCK TABLES `dealer` WRITE;
/*!40000 ALTER TABLE `dealer` DISABLE KEYS */;
INSERT INTO `dealer` VALUES (1,'Ram',1234567,'ram@gmail.com'),(2,'Shyam',2345678,'shyam@gmail.com'),(3,'Hari',3456789,'hari@gmail.com'),(4,'Tom',4567890,' '),(5,'Harry',5678901,'harry@gmail.com'),(6,'Donald',6789012,'donald@yahoo.com'),(7,'RamVola',7890123,'ramvola@hotmail.com'),(8,'Rajendra',8901234,'rajendra@yahoo.com'),(9,'Rajesh',9012345,'rajesh@outlook.com'),(10,'Biswash',9876543,'biswash@microsoft.com');
/*!40000 ALTER TABLE `dealer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `OrderID` int(11) NOT NULL AUTO_INCREMENT,
  `Products` varchar(30) NOT NULL,
  `Customer` varchar(50) NOT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `Products` (`Products`),
  KEY `Customer` (`Customer`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Products`) REFERENCES `product` (`ProductID`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`Customer`) REFERENCES `customer` (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'PIOG1','CIOS9'),(2,'PIOG8','CIOS2'),(3,'PIOG2','CIOS9'),(4,'PIOG3','CIOS1'),(5,'PIOG0','CIOS7'),(6,'PIOG5','CIOS5'),(7,'PIOG4','CIOS8'),(8,'PIOG2','CIOS6'),(9,'PIOG7','CIOS2'),(10,'PIOG8','CIOS0');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `ProductID` varchar(30) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Shops` int(11) NOT NULL,
  `PackedDate` date NOT NULL,
  `Price_perKg` int(11) NOT NULL,
  PRIMARY KEY (`ProductID`),
  UNIQUE KEY `Name` (`Name`),
  KEY `Shops` (`Shops`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`Shops`) REFERENCES `shop` (`ShopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('PIOG0','Radish',7,'2004-01-12',100),('PIOG1','Sitake Mushroom',9,'2010-04-23',900),('PIOG2','Ground Apple',5,'2015-04-30',200),('PIOG3','Orange',6,'2015-06-28',150),('PIOG4','Grapes',7,'2011-09-22',200),('PIOG5','Avocardo',6,'2010-02-28',600),('PIOG6','Cardamom',10,'2012-05-11',1500),('PIOG7','Walnut',9,'2012-08-16',1000),('PIOG8','Pear',4,'2008-02-16',120),('PIOG9','Coriander',3,'2004-01-12',50);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop` (
  `ShopID` int(11) NOT NULL AUTO_INCREMENT,
  `Address` varchar(30) NOT NULL,
  `Phone` int(11) NOT NULL,
  `Dealers` int(11) NOT NULL,
  PRIMARY KEY (`ShopID`),
  UNIQUE KEY `Phone` (`Phone`),
  KEY `Dealers` (`Dealers`),
  CONSTRAINT `shop_ibfk_1` FOREIGN KEY (`Dealers`) REFERENCES `dealer` (`DealerID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (1,'Kupondole',1029387,10),(2,'Pulchowk',9865429,3),(3,'Thapathali',6578943,4),(4,'Maitighar',3678201,7),(5,'Kupondole',3675490,5),(6,'Jawalakhel',4726981,1),(7,'Ekantakuna',3547289,3),(8,'Pulchowk',8732190,5),(9,'Satdobato',5674901,10),(10,'Godawari',9128375,2);
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-29 16:48:36
