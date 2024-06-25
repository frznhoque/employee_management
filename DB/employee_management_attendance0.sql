-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_management
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `attendanceId` int NOT NULL AUTO_INCREMENT,
  `employeeId` int DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `a01` varchar(45) DEFAULT '-',
  `a02` varchar(45) DEFAULT '-',
  `a03` varchar(45) DEFAULT '-',
  `a04` varchar(45) DEFAULT '-',
  `a05` varchar(45) DEFAULT '-',
  `a06` varchar(45) DEFAULT '-',
  `a07` varchar(45) DEFAULT '-',
  `a08` varchar(45) DEFAULT '-',
  `a09` varchar(45) DEFAULT '-',
  `a10` varchar(45) DEFAULT '-',
  `a11` varchar(45) DEFAULT '-',
  `a12` varchar(45) DEFAULT '-',
  `a13` varchar(45) DEFAULT '-',
  `a14` varchar(45) DEFAULT '-',
  `a15` varchar(45) DEFAULT '-',
  `a16` varchar(45) DEFAULT '-',
  `a17` varchar(45) DEFAULT '-',
  `a18` varchar(45) DEFAULT '-',
  `a19` varchar(45) DEFAULT '-',
  `a20` varchar(45) DEFAULT '-',
  `a21` varchar(45) DEFAULT '-',
  `a22` varchar(45) DEFAULT '-',
  `a23` varchar(45) DEFAULT '-',
  `a24` varchar(45) DEFAULT '-',
  `a25` varchar(45) DEFAULT '-',
  `a26` varchar(45) DEFAULT '-',
  `a27` varchar(45) DEFAULT '-',
  `a28` varchar(45) DEFAULT '-',
  `a29` varchar(45) DEFAULT '-',
  `a30` varchar(45) DEFAULT '-',
  `a31` varchar(45) DEFAULT '-',
  PRIMARY KEY (`attendanceId`),
  KEY `attendanceEmp_idx` (`employeeId`),
  CONSTRAINT `attendanceEmp` FOREIGN KEY (`employeeId`) REFERENCES `employees` (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (37,1001001,'jun','2024','L','P','P','P','L','L','-','L','L','L','L','L','P','-','A','P','P','P','A','P','P','P','P','P','P','P','P','P','P','P','-'),(38,1001002,'jun','2024','L','P','P','A','P','P','-','P','P','P','P','P','P','-','P','P','P','P','A','P','P','P','P','P','P','P','P','P','P','P','-'),(39,1001003,'jun','2024','L','P','P','P','A','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','A','P','P','P','P','P','P','P','P','P','-'),(40,1001001,'may','2024','P','P','-','P','A','P','P','P','A','-','P','P','P','P','P','P','-','P','A','P','P','P','P','-','P','P','P','P','P','P','-'),(41,1001002,'may','2024','P','P','-','P','A','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','A','P','P','-'),(42,1001003,'may','2024','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','A','P','P','P','-'),(43,1001004,'may','2024','P','P','-','P','P','A','P','P','-','-','P','P','P','P','P','P','-','P','P','A','P','P','P','-','P','A','P','P','P','P','-'),(44,1001004,'jun','2024','P','P','P','P','P','P','-','P','P','P','A','P','P','-','P','P','P','P','P','P','A','P','P','P','P','P','P','P','P','P','-'),(45,1001001,'jan','2024','P','P','P','P','-','L','P','P','P','L','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(46,1001002,'jan','2024','P','A','P','P','-','P','P','P','P','L','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(47,1001003,'jan','2024','P','P','P','P','-','P','P','L','P','P','L','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(48,1001004,'jan','2024','P','P','P','P','-','L','P','P','P','P','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(49,1001006,'jun','2024','P','P','P','P','-','A','-','P','P','P','P','P','P','-','P','A','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(50,1001007,'jun','2024','P','P','P','A','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(51,1001008,'jun','2024','P','P','P','P','-','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(52,1001006,'may','2024','P','P','-','P','P','A','P','-','P','-','P','P','P','P','P','P','-','P','P','P','A','P','P','-','P','P','P','P','P','P','-'),(53,1001007,'may','2024','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','A','P','P','A','P','-','A','P','P','P','P','P','-'),(54,1001008,'may','2024','P','P','-','P','P','P','P','P','A','-','P','P','P','P','P','P','-','P','P','P','P','P','A','-','P','P','P','P','P','P','-');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25 11:35:59
