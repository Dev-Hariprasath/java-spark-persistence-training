-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: test_db
-- ------------------------------------------------------
-- Server version	8.0.43

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
-- Table structure for table `software`
--

DROP TABLE IF EXISTS `software`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `software` (
  `Programmer_Name` varchar(100) DEFAULT NULL,
  `Software_Name` varchar(100) DEFAULT NULL,
  `Developed_In` varchar(100) DEFAULT NULL,
  `Software_Cost` decimal(10,2) DEFAULT NULL,
  `Development_Cost` decimal(10,2) DEFAULT NULL,
  `Sold` int DEFAULT NULL,
  KEY `Programmer_Name` (`Programmer_Name`),
  CONSTRAINT `software_ibfk_1` FOREIGN KEY (`Programmer_Name`) REFERENCES `programmers` (`Programmer_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `software`
--

LOCK TABLES `software` WRITE;
/*!40000 ALTER TABLE `software` DISABLE KEYS */;
INSERT INTO `software` VALUES ('Tony Stark','Jarvis','Python',15000.00,30000.00,150),('Peter Parker','Spider Tracker','JavaScript',8000.00,20000.00,85),('Thomas Shelby','AI Advisor','Python',20000.00,50000.00,70),('John Wick','Assassin App','Java',18000.00,35000.00,60),('Bruce Wayne','Bat Computer','C#',25000.00,60000.00,90),('Clark Kent','Super Scanner','Java',12000.00,30000.00,55),('Diana Prince','Lasso of Truth','Ruby',10000.00,25000.00,45),('Natasha Romanoff','Black Widow Network','Go',14000.00,35000.00,75),('Steve Rogers','Shield Defense','C ',16000.00,40000.00,80),('Bruce Banner','Hulk Smash App','Python',14000.00,30000.00,65),('Wanda Maximoff','Hex Control','Swift',12000.00,28000.00,50),('Stephen Strange','Time Manipulator','Fortran',16000.00,45000.00,70),('Thor Odinson','Mjolnir Control','R',18000.00,50000.00,100);
/*!40000 ALTER TABLE `software` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-10 22:15:22
