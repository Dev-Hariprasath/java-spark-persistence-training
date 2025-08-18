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
-- Table structure for table `studies`
--

DROP TABLE IF EXISTS `studies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studies` (
  `Programmer_Name` varchar(100) DEFAULT NULL,
  `Institute` varchar(100) DEFAULT NULL,
  `Course` varchar(100) DEFAULT NULL,
  `Course_Fee` decimal(10,2) DEFAULT NULL,
  KEY `Programmer_Name` (`Programmer_Name`),
  CONSTRAINT `studies_ibfk_1` FOREIGN KEY (`Programmer_Name`) REFERENCES `programmers` (`Programmer_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studies`
--

LOCK TABLES `studies` WRITE;
/*!40000 ALTER TABLE `studies` DISABLE KEYS */;
INSERT INTO `studies` VALUES ('Tony Stark','MIT','Computer Science',4500.00),('Peter Parker','Stanford','Data Science',7200.00),('Thomas Shelby','Columbia','Artificial Intelligence',22000.00),('John Wick','Oxford','Machine Learning',5000.00),('Bruce Wayne','MIT','Cybersecurity',4500.00),('Clark Kent','Stanford','Robotics',6200.00),('Diana Prince','Oxford','Quantum Computing',5200.00),('Natasha Romanoff','Cambridge','Bioinformatics',14000.00),('Steve Rogers','MIT','Software Engineering',4500.00),('Bruce Banner','Columbia','Cloud Computing',11000.00),('Wanda Maximoff','Cambridge','Data Analytics',6000.00),('Stephen Strange','MIT','Quantum Mechanics',5000.00),('Thor Odinson','Columbia','Data Science',48000.00);
/*!40000 ALTER TABLE `studies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-10 22:15:23
