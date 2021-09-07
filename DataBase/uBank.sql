-- MySQL dump 10.13  Distrib 8.0.26, for macos11.3 (x86_64)
--
-- Host: localhost    Database: uBank
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Admin_Data`
--

DROP TABLE IF EXISTS `Admin_Data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Admin_Data` (
  `id` int NOT NULL,
  `Name` linestring DEFAULT NULL,
  `Email` linestring NOT NULL,
  `Password` linestring NOT NULL,
  `Phone` linestring DEFAULT NULL,
  `Addresss` linestring DEFAULT NULL,
  `NRC` linestring DEFAULT NULL,
  `Create_Date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin_Data`
--

LOCK TABLES `Admin_Data` WRITE;
/*!40000 ALTER TABLE `Admin_Data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Admin_Data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUSTOMER_DATA`
--

DROP TABLE IF EXISTS `CUSTOMER_DATA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CUSTOMER_DATA` (
  `ID` linestring DEFAULT NULL,
  `Name` linestring DEFAULT NULL,
  `Email` linestring DEFAULT NULL,
  `Password` linestring DEFAULT NULL,
  `Phone` linestring DEFAULT NULL,
  `Address` linestring DEFAULT NULL,
  `Gender` linestring DEFAULT NULL,
  `NRC` linestring DEFAULT NULL,
  `BD` linestring DEFAULT NULL,
  `Create_Date` linestring DEFAULT NULL,
  `CT` linestring DEFAULT NULL,
  `REC` linestring DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUSTOMER_DATA`
--

LOCK TABLES `CUSTOMER_DATA` WRITE;
/*!40000 ALTER TABLE `CUSTOMER_DATA` DISABLE KEYS */;
/*!40000 ALTER TABLE `CUSTOMER_DATA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Generator`
--

DROP TABLE IF EXISTS `Generator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Generator` (
  `Count` int DEFAULT NULL,
  `Admin` varchar(10) DEFAULT NULL,
  `Customer` varchar(10) DEFAULT NULL,
  `Current_Account` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Generator`
--

LOCK TABLES `Generator` WRITE;
/*!40000 ALTER TABLE `Generator` DISABLE KEYS */;
INSERT INTO `Generator` VALUES (1,'1','2','0002');
/*!40000 ALTER TABLE `Generator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Interest_Data`
--

DROP TABLE IF EXISTS `Interest_Data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Interest_Data` (
  `ID` linestring DEFAULT NULL,
  `Name` linestring DEFAULT NULL,
  `Password` linestring DEFAULT NULL,
  `Count` linestring DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Interest_Data`
--

LOCK TABLES `Interest_Data` WRITE;
/*!40000 ALTER TABLE `Interest_Data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Interest_Data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Transfer_Data`
--

DROP TABLE IF EXISTS `Transfer_Data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Transfer_Data` (
  `ID` linestring DEFAULT NULL,
  `Name` linestring DEFAULT NULL,
  `Password` linestring DEFAULT NULL,
  `Count` linestring DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Transfer_Data`
--

LOCK TABLES `Transfer_Data` WRITE;
/*!40000 ALTER TABLE `Transfer_Data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Transfer_Data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-07 17:01:44
