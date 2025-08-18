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
-- Table structure for table `programmers`
--

DROP TABLE IF EXISTS `programmers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programmers` (
  `Programmer_Name` varchar(100) NOT NULL,
  `DOB` date DEFAULT NULL,
  `DOJ` date DEFAULT NULL,
  `GENDER` char(1) DEFAULT NULL,
  `Primary_Language` varchar(100) DEFAULT NULL,
  `Secondary_Language` varchar(100) DEFAULT NULL,
  `Salary` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Programmer_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programmers`
--

LOCK TABLES `programmers` WRITE;
/*!40000 ALTER TABLE `programmers` DISABLE KEYS */;
INSERT INTO `programmers` VALUES ('Bruce Banner','1969-12-18','1989-07-20','M','Python','JavaScript',14200.00),('Bruce Wayne','1933-02-19','1950-06-11','M','C#','Java',14000.00),('Clark Kent','1938-06-18','1956-07-01','M','Java','Python',13500.00),('Diana Prince','1919-08-19','1945-07-01','F','Ruby','Python',17500.00),('John Wick','1964-09-18','1987-10-05','M','Java','C ',18000.00),('Natasha Romanoff','1984-11-22','2000-05-30','F','Go','Rust',14500.00),('Peter Parker','2001-08-10','2018-06-15','M','JavaScript','Python',12000.00),('Stephen Strange','1936-11-01','1965-10-15','M','Fortran','Lisp',15200.00),('Steve Rogers','1918-07-04','1943-04-10','M','C ','C',15500.00),('Thomas Shelby','1980-11-20','1999-09-12','M','Python','R',16000.00),('Thor Odinson','1900-07-20','2002-06-01','M','R','Julia',16200.00),('Tony Stark','1970-05-29','1990-05-11','M','Python','JavaScript',15000.00),('Wanda Maximoff','1989-02-13','2005-09-12','F','Swift','Kotlin',14800.00);
/*!40000 ALTER TABLE `programmers` ENABLE KEYS */;
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
