CREATE DATABASE  IF NOT EXISTS `employee_management` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employee_management`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_management
-- ------------------------------------------------------
-- Server version	8.0.17

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
  `attendanceId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeId` int(11) DEFAULT NULL,
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
INSERT INTO `attendance` VALUES (37,1001001,'jun','2024','L','P','P','P','L','L','-','L','L','L','L','L','P','-','A','P','P','P','A','P','P','P','P','P','P','P','P','P','P','P','-'),(38,1001002,'jun','2024','L','L','L','L','L','L','-','P','L','L','L','L','L','-','L','L','L','L','L','L','P','P','P','P','P','P','P','P','P','P','-'),(39,1001003,'jun','2024','L','P','P','P','A','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','A','P','P','P','P','P','P','P','P','P','-'),(40,1001001,'may','2024','P','P','-','P','A','P','P','P','A','-','P','P','P','P','P','P','-','P','A','P','P','P','P','-','P','P','P','P','P','P','-'),(41,1001002,'may','2024','P','P','-','P','A','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','A','P','P','-'),(42,1001003,'may','2024','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','P','A','P','P','P','-'),(43,1001004,'may','2024','P','P','-','P','P','A','P','P','-','-','P','P','P','P','P','P','-','P','P','A','P','P','P','-','P','A','P','P','P','P','-'),(44,1001004,'jun','2024','P','P','P','P','P','P','-','P','P','P','A','P','P','-','P','P','P','P','P','P','A','P','P','P','P','P','P','P','P','P','-'),(45,1001001,'jan','2024','P','P','P','P','-','L','P','P','P','L','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(46,1001002,'jan','2024','P','A','P','P','-','P','P','P','P','L','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(47,1001003,'jan','2024','P','P','P','P','-','P','P','L','P','P','L','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(48,1001004,'jan','2024','P','P','P','P','-','L','P','P','P','P','P','-','P','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'),(49,1001006,'jun','2024','P','P','P','P','-','A','-','P','P','P','P','P','P','-','P','A','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(50,1001007,'jun','2024','P','P','P','A','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(51,1001008,'jun','2024','P','P','P','P','-','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','-'),(52,1001006,'may','2024','P','P','-','P','P','A','P','-','P','-','P','P','P','P','P','P','-','P','P','P','A','P','P','-','P','P','P','P','P','P','-'),(53,1001007,'may','2024','P','P','-','P','P','P','P','P','P','-','P','P','P','P','P','P','-','P','A','P','P','A','P','-','A','P','P','P','P','P','-'),(54,1001008,'may','2024','P','P','-','P','P','P','P','P','A','-','P','P','P','P','P','P','-','P','P','P','P','P','A','-','P','P','P','P','P','P','-');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
  `departmentId` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(45) NOT NULL,
  PRIMARY KEY (`departmentId`),
  UNIQUE KEY `departmentName_UNIQUE` (`departmentName`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (1007,'Employee Engagement'),(1008,'Employee Relations'),(1001,'hr'),(1002,'IT'),(1003,'MIS'),(1005,'People Operations'),(1006,'Staffing and Development'),(1004,'Talent Management');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phoneNo` varchar(45) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
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

--
-- Table structure for table `leave_request`
--

DROP TABLE IF EXISTS `leave_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_request` (
  `requestId` int(11) NOT NULL AUTO_INCREMENT,
  `fromDate` date DEFAULT NULL,
  `toDate` date DEFAULT NULL,
  `requestDate` date DEFAULT NULL,
  `description` text,
  `status` varchar(45) DEFAULT 'requested',
  `employeeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`requestId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_request`
--

LOCK TABLES `leave_request` WRITE;
/*!40000 ALTER TABLE `leave_request` DISABLE KEYS */;
INSERT INTO `leave_request` VALUES (7,'2024-06-05','2024-06-12',NULL,'test','accepted',1001001),(8,'2024-06-15','2024-06-20',NULL,'Sick Leave','accepted',1001002),(9,'2024-06-15','2024-06-20',NULL,'Sick leave','accepted',1001002),(10,'2024-06-02','2024-06-06',NULL,'sick leave','accepted',1001002),(11,'2024-06-09','2024-06-13',NULL,'sick leave','accepted',1001002);
/*!40000 ALTER TABLE `leave_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice` (
  `noticeId` int(11) NOT NULL AUTO_INCREMENT,
  `noticeHeading` varchar(45) DEFAULT NULL,
  `noticeDescription` varchar(45) DEFAULT NULL,
  `noticeDate` date DEFAULT NULL,
  PRIMARY KEY (`noticeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (101,'admin'),(102,'hr'),(103,'manager');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `salaryId` int(11) NOT NULL AUTO_INCREMENT,
  `basic` double DEFAULT NULL,
  `house` int(11) DEFAULT '12',
  `communication` int(11) DEFAULT '5',
  `transport` int(11) DEFAULT '5',
  `medical` int(11) DEFAULT '3',
  `employeeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`salaryId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,35000,12,5,5,3,1001001),(2,27000,12,5,5,3,1001002),(3,25000,12,5,5,3,1001003),(4,35000,12,5,5,3,1001004);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_empose`
--

DROP TABLE IF EXISTS `salary_empose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary_empose` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employeeId` int(11) DEFAULT NULL,
  `basic` double DEFAULT NULL,
  `house` double DEFAULT NULL,
  `communication` double DEFAULT NULL,
  `transport` double DEFAULT NULL,
  `medical` double DEFAULT NULL,
  `present` int(11) DEFAULT NULL,
  `absent` int(11) DEFAULT NULL,
  `leave` int(11) DEFAULT NULL,
  `totalAbsent` int(11) DEFAULT NULL,
  `leaveNotPay` double DEFAULT NULL,
  `bonous` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `emposeDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10168 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_empose`
--

LOCK TABLES `salary_empose` WRITE;
/*!40000 ALTER TABLE `salary_empose` DISABLE KEYS */;
INSERT INTO `salary_empose` VALUES (1,1001001,35000,4200,1750,1750,1050,NULL,NULL,1,NULL,1166.6666666666667,0,43750,'Mar',2025,'2024-05-15'),(2,1001002,27000,3240,1350,1350,810,NULL,NULL,1,NULL,900,0,33750,'Mar',2025,'2024-05-15'),(3,1001003,25000,3000,1250,1250,750,NULL,NULL,1,NULL,833.3333333333334,0,31250,'Mar',2025,'2024-05-15'),(4,1001004,35000,4200,1750,1750,1050,NULL,NULL,1,NULL,1166.6666666666667,0,43750,'Mar',2025,'2024-05-15'),(10111,1001001,35000,4200,1750,1750,1050,NULL,NULL,1,NULL,1166.6666666666667,0,43750,'Mar',2025,'2024-05-15'),(10112,1001001,35000,4200,1750,1750,1050,NULL,NULL,1,NULL,1166.6666666666667,0,43750,'Jul',2025,'2024-05-15'),(10113,1001002,27000,3240,1350,1350,810,NULL,NULL,1,NULL,900,0,33750,'Jul',2025,'2024-05-15'),(10114,1001003,25000,3000,1250,1250,750,NULL,NULL,1,NULL,833.3333333333334,0,31250,'Jul',2025,'2024-05-15'),(10115,1001004,35000,4200,1750,1750,1050,NULL,NULL,1,NULL,1166.6666666666667,0,43750,'Jul',2025,'2024-05-15'),(10148,1001001,35000,4200,1750,1750,1050,NULL,NULL,3,NULL,3500,0,40250,'May',2024,'2024-06-01'),(10149,1001002,27000,3240,1350,1350,810,NULL,NULL,2,NULL,1800,0,31950,'May',2024,'2024-06-01'),(10150,1001003,25000,3000,1250,1250,750,NULL,NULL,1,NULL,833.3333333333334,0,30416.666666666668,'May',2024,'2024-06-01'),(10151,1001004,35000,4200,1750,1750,1050,NULL,NULL,3,NULL,3500,0,40250,'May',2024,'2024-06-01'),(10152,1001001,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Jan',2024,'2024-06-01'),(10153,1001002,27000,3240,1350,1350,810,NULL,NULL,1,NULL,900,0,32850,'Jan',2024,'2024-06-01'),(10154,1001003,25000,3000,1250,1250,750,NULL,NULL,0,NULL,0,0,31250,'Jan',2024,'2024-06-01'),(10155,1001004,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Jan',2024,'2024-06-01'),(10156,1001001,35000,4200,1750,1750,1050,18,2,8,7,8166.666666666667,0,35583.333333333336,'Jun',2024,'2024-06-09'),(10157,1001002,27000,3240,1350,1350,810,11,0,17,14,12600,0,21150,'Jun',2024,'2024-06-09'),(10158,1001003,25000,3000,1250,1250,750,25,2,1,2,1666.6666666666667,0,29583.333333333332,'Jun',2024,'2024-06-09'),(10159,1001004,35000,4200,1750,1750,1050,26,2,0,2,2333.3333333333335,0,41416.666666666664,'Jun',2024,'2024-06-09'),(10160,1001001,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Mar',2024,'2024-06-01'),(10161,1001002,27000,3240,1350,1350,810,NULL,NULL,0,NULL,0,0,33750,'Mar',2024,'2024-06-01'),(10162,1001003,25000,3000,1250,1250,750,NULL,NULL,0,NULL,0,0,31250,'Mar',2024,'2024-06-01'),(10163,1001004,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Mar',2024,'2024-06-01'),(10164,1001001,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Apr',2024,'2024-06-01'),(10165,1001002,27000,3240,1350,1350,810,NULL,NULL,0,NULL,0,0,33750,'Apr',2024,'2024-06-01'),(10166,1001003,25000,3000,1250,1250,750,NULL,NULL,0,NULL,0,0,31250,'Apr',2024,'2024-06-01'),(10167,1001004,35000,4200,1750,1750,1050,NULL,NULL,0,NULL,0,0,43750,'Apr',2024,'2024-06-01');
/*!40000 ALTER TABLE `salary_empose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `employeeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `emp_user_idx` (`employeeId`),
  CONSTRAINT `emp_user` FOREIGN KEY (`employeeId`) REFERENCES `employees` (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (100,'admin','admin',1001001),(101,'user','user',1001002);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voucher`
--

DROP TABLE IF EXISTS `voucher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voucher` (
  `voucherNumber` int(11) NOT NULL AUTO_INCREMENT,
  `heading` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `ammount` double DEFAULT NULL,
  `status` varchar(45) DEFAULT 'requested',
  `requesterId` int(11) DEFAULT NULL,
  PRIMARY KEY (`voucherNumber`),
  UNIQUE KEY `voucherNumber_UNIQUE` (`voucherNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voucher`
--

LOCK TABLES `voucher` WRITE;
/*!40000 ALTER TABLE `voucher` DISABLE KEYS */;
INSERT INTO `voucher` VALUES (1,'test','test',200,'requested',NULL),(2,'purchace table','uhhff',1000,'requested',NULL);
/*!40000 ALTER TABLE `voucher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-08  9:34:28
