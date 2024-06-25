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
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `employeeId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phoneNo` varchar(45) DEFAULT NULL,
  `departmentId` int DEFAULT NULL,
  `roleId` int DEFAULT NULL,
  `dateOfJoining` date DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `attendancestatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `department_id_idx` (`departmentId`),
  KEY `role_id_idx` (`roleId`),
  CONSTRAINT `department_id` FOREIGN KEY (`departmentId`) REFERENCES `departments` (`departmentId`),
  CONSTRAINT `role_id` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=1001009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1001001,'Abu Hossain','abu@email.com','01516718442',1002,101,'2024-01-01',35000,'Panthapath, Dhaka','A'),(1001002,'Farzana Hoque','farzan@email.com','01796485178',1002,101,'2024-03-01',27000,'Shymoli, Dhaka','P'),(1001003,'Jahir Uddin','jahir@email.com','01365897885',1002,101,'2024-05-01',25000,'Mirpur, Dhaka','L'),(1001004,'Shormili','shormili@email.com','0130254674',1002,101,'2024-05-10',35000,'Savar, Dhaka','P'),(1001006,'Afsana Meem','Meem@gmail.com','01684985546',1001,102,'2024-01-01',35000,'Mohakhali',NULL),(1001007,'Md Rahat','rahat@gmail.com','01684985549',1005,101,'2024-06-01',25000,'Hatirjheel',NULL),(1001008,'Md Sajib Uddin','sajib@gmail.com','01684985520',1005,103,'2024-06-01',22000,'Kazipara',NULL);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25 11:36:00
