-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: hostelmanagement
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `activerequests`
--

DROP TABLE IF EXISTS `activerequests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activerequests` (
  `requestid` int NOT NULL AUTO_INCREMENT,
  `studentID` int DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `date` varchar(10) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`requestid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activerequests`
--

LOCK TABLES `activerequests` WRITE;
/*!40000 ALTER TABLE `activerequests` DISABLE KEYS */;
/*!40000 ALTER TABLE `activerequests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `confirmedrequests`
--

DROP TABLE IF EXISTS `confirmedrequests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `confirmedrequests` (
  `requestid` int NOT NULL AUTO_INCREMENT,
  `studentID` int DEFAULT NULL,
  `departureTime` time DEFAULT NULL,
  `departureDate` date DEFAULT NULL,
  `Type` varchar(10) NOT NULL,
  `reason` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`requestid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `confirmedrequests`
--

LOCK TABLES `confirmedrequests` WRITE;
/*!40000 ALTER TABLE `confirmedrequests` DISABLE KEYS */;
/*!40000 ALTER TABLE `confirmedrequests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hostelleaverecords`
--

DROP TABLE IF EXISTS `hostelleaverecords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hostelleaverecords` (
  `requestid` int NOT NULL AUTO_INCREMENT,
  `studentid` int DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `leftDateTime` varchar(30) DEFAULT NULL,
  `arriveddatetime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`requestid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hostelleaverecords`
--

LOCK TABLES `hostelleaverecords` WRITE;
/*!40000 ALTER TABLE `hostelleaverecords` DISABLE KEYS */;
INSERT INTO `hostelleaverecords` VALUES (14,21000001,'test','Normal','2020-11-27 16:04:56','2020-11-27 16:05:08');
/*!40000 ALTER TABLE `hostelleaverecords` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outonrequest`
--

DROP TABLE IF EXISTS `outonrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `outonrequest` (
  `requestid` int NOT NULL AUTO_INCREMENT,
  `studentID` int DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `leftdatetime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`requestid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outonrequest`
--

LOCK TABLES `outonrequest` WRITE;
/*!40000 ALTER TABLE `outonrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `outonrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securitydetails`
--

DROP TABLE IF EXISTS `securitydetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securitydetails` (
  `securityID` varchar(20) NOT NULL,
  `securityPassword` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`securityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securitydetails`
--

LOCK TABLES `securitydetails` WRITE;
/*!40000 ALTER TABLE `securitydetails` DISABLE KEYS */;
INSERT INTO `securitydetails` VALUES ('2001','sec001'),('2002','sec002');
/*!40000 ALTER TABLE `securitydetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentdetails`
--

DROP TABLE IF EXISTS `studentdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentdetails` (
  `studentID` int NOT NULL,
  `studentName` char(30) DEFAULT NULL,
  `studentPassword` varchar(20) DEFAULT NULL,
  `studentRoom` int DEFAULT NULL,
  PRIMARY KEY (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentdetails`
--

LOCK TABLES `studentdetails` WRITE;
/*!40000 ALTER TABLE `studentdetails` DISABLE KEYS */;
INSERT INTO `studentdetails` VALUES (21000001,'L M N PERERA','s001',1234),(21000002,'V P N FERNANDO','s002',2345),(21000003,'T G P WIJESINGE','s003',4567),(21000004,'S D G GAMAGE','s004',3217),(21000005,'D T B JAYASURIYA','s005',5264),(21000006,'S R T ABEYSENA','s006',3562);
/*!40000 ALTER TABLE `studentdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wardendetails`
--

DROP TABLE IF EXISTS `wardendetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wardendetails` (
  `wardenID` int NOT NULL,
  `wardenName` char(30) DEFAULT NULL,
  `wardenPassword` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`wardenID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wardendetails`
--

LOCK TABLES `wardendetails` WRITE;
/*!40000 ALTER TABLE `wardendetails` DISABLE KEYS */;
INSERT INTO `wardendetails` VALUES (1001,'Ms. Sandamali Wedage','w001'),(1002,'Ms. Prashansika Navodini','w002');
/*!40000 ALTER TABLE `wardendetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-28 15:21:38
