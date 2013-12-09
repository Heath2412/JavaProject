CREATE DATABASE  IF NOT EXISTS `clothingdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clothingdb`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: clothingdb
-- ------------------------------------------------------
-- Server version	5.6.14-log

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`Id`, `UserName`, `Password`) VALUES (1,'admin','admin'),(2,'sondang','123456'),(3,'test1','123456'),(4,'test2','123456'),(5,'test3','123456'),(6,'test4','123456'),(7,'test5','123456');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Name_UNIQUE` (`Name`),
  UNIQUE KEY `Id_UNIQUE` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`Id`, `Name`) VALUES (3,'Áo thun nam'),(4,'Áo thun nữ'),(1,'Áo đầm'),(2,'Váy');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clothing`
--

DROP TABLE IF EXISTS `clothing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clothing` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Price` int(11) NOT NULL DEFAULT '0',
  `Quantity` int(11) NOT NULL DEFAULT '0',
  `Image` varchar(2000) DEFAULT NULL,
  `Category_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`),
  KEY `fk_clothing_category_idx` (`Category_Id`),
  CONSTRAINT `fk_clothing_category` FOREIGN KEY (`Category_Id`) REFERENCES `category` (`Id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clothing`
--

LOCK TABLES `clothing` WRITE;
/*!40000 ALTER TABLE `clothing` DISABLE KEYS */;
INSERT INTO `clothing` (`Id`, `Name`, `Price`, `Quantity`, `Image`, `Category_Id`) VALUES (1,'Áo thun nam 1',100000,10,NULL,3),(2,'Áo thun nam 2',150000,12,NULL,3),(3,'Áo thun nam 3',120000,15,NULL,3),(4,'Áo thun nam 4',250000,5,NULL,3),(5,'Áo thun nữ 1',120000,10,NULL,4),(6,'Áo thun nữ 2',150000,12,NULL,4),(7,'Áo thun nữ 3',80000,8,NULL,4),(8,'Áo thun nữ 4',220000,10,NULL,4),(30,'Áo thun nam 6',100000,10,NULL,3),(31,'Áo thun nam 7',100000,10,NULL,3),(32,'Áo thun nam 8',100000,10,NULL,3),(33,'Áo thun nam 9',100000,10,NULL,3),(34,'Áo thun nam 10',100000,10,NULL,3),(35,'Áo thun nam 11',100000,10,NULL,3),(36,'Áo thun nam 12',100000,10,NULL,3),(37,'Áo thun nam 13',100000,10,NULL,3),(38,'Áo thun nam 14',100000,10,NULL,3),(39,'Áo thun nam 15',100000,10,NULL,3),(40,'Áo thun nam 16',100000,10,NULL,3),(41,'Áo thun nam 17',100000,10,NULL,3),(42,'Áo đầm nữ 1',100000,10,NULL,1),(43,'Áo đầm nữ 2',100000,10,NULL,1),(44,'Áo đầm nữ 3',100000,10,NULL,1),(45,'Áo đầm nữ 4',100000,10,NULL,1),(46,'Áo đầm nữ 5',100000,10,NULL,1),(47,'Áo đầm nữ 6',100000,10,NULL,1),(48,'Váy 1',100000,10,NULL,2),(49,'Váy 2',100000,10,NULL,2),(50,'Váy 3',100000,10,NULL,2),(51,'Váy 4',100000,10,NULL,2),(52,'Váy 5',100000,10,NULL,2),(53,'Váy 6',100000,10,NULL,2),(54,'Váy 7',100000,10,NULL,2),(55,'Áo thun nam 18',100000,10,NULL,1),(56,'Áo thun nam 19',100000,10,NULL,1);
/*!40000 ALTER TABLE `clothing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tradinghistory`
--

DROP TABLE IF EXISTS `tradinghistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tradinghistory` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Account_Id` int(11) NOT NULL,
  `Clothing_Id` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL DEFAULT '1',
  `Time` datetime NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`),
  KEY `fk_TradingHistory_Account_idx` (`Account_Id`),
  KEY `fk_TradingHistory_Clothing1_idx` (`Clothing_Id`),
  CONSTRAINT `fk_TradingHistory_Account` FOREIGN KEY (`Account_Id`) REFERENCES `account` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TradingHistory_Clothing1` FOREIGN KEY (`Clothing_Id`) REFERENCES `clothing` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tradinghistory`
--

LOCK TABLES `tradinghistory` WRITE;
/*!40000 ALTER TABLE `tradinghistory` DISABLE KEYS */;
INSERT INTO `tradinghistory` (`Id`, `Account_Id`, `Clothing_Id`, `Quantity`, `Time`) VALUES (10,3,1,4,'2013-10-05 09:44:51'),(11,3,1,6,'2013-10-09 01:57:13');
/*!40000 ALTER TABLE `tradinghistory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-10  3:00:02
