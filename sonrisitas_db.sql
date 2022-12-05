-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: sonrisitas_db
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admin_id` varchar(250) NOT NULL,
  `admin_password` varchar(250) NOT NULL,
  `correo` varchar(255) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('AD0001','1234','gianpi@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apoderado`
--

DROP TABLE IF EXISTS `apoderado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apoderado` (
  `apoderado_id` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `nombre` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `apellido` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `edad` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `direccion` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `pass` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `correo` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`apoderado_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apoderado`
--

LOCK TABLES `apoderado` WRITE;
/*!40000 ALTER TABLE `apoderado` DISABLE KEYS */;
INSERT INTO `apoderado` VALUES ('A00001','Luis','Quispe',35,70796835,'Jiron Las Orquideas N 42','1234','luisquispe@gmail.com'),('A00002','Maria','Ramirez',24,70703586,'Calle El Cerro Manzana 9 Lote 32','1234','mariaramirez@gmail.com'),('A11490','Juan','Perez',26,70692506,'Calle Los Malcriados N 69 Manzana 4','1234','juanperez@gmail.com');
/*!40000 ALTER TABLE `apoderado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asignatura` (
  `asignatura_id` varchar(250) NOT NULL,
  `profesor_id` varchar(250) NOT NULL,
  `nombre_asignatura` varchar(250) NOT NULL,
  `horario` varchar(250) NOT NULL,
  PRIMARY KEY (`asignatura_id`),
  KEY `profesor_id` (`profesor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
INSERT INTO `asignatura` VALUES ('AS0001','P00002','Arte','Lunes 8:00 a 10:00'),('AS0002','P00001','Escritura','Martes 11:00 a 12:30'),('AS0003','P00001','Competencias Comunicativas','Martes 8:00 a 10:00'),('AS0004','P00002','Desarrollo Psicomotor','Miercoles 9:00 a 11:00'),('AS0005','P00001','Numeros Basicos','Lunes 10:00 a 12:30');
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante` (
  `estudiante_id` varchar(250) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `apellido` varchar(250) NOT NULL,
  `edad` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  PRIMARY KEY (`estudiante_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES ('E00001','Matias','Ramirez',5,72733750,'Calle El Cerro Manzana 9 Lote 32'),('E31355','Elena','Ramirez',6,70586947,'Calle El Cerro Manzana 9 Lote 32'),('E65834','Daniela','Quispe',5,70254810,'Jiron Las Orquideas N 42'),('E88463','Joseph','Perez',6,70987073,'Calle Los Malcriados N 69 Manzana 4');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante_apoderado`
--

DROP TABLE IF EXISTS `estudiante_apoderado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante_apoderado` (
  `estudiante_id` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `apoderado_id` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`estudiante_id`,`apoderado_id`),
  KEY `estudiante_id` (`estudiante_id`,`apoderado_id`),
  KEY `apoderado_id` (`apoderado_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante_apoderado`
--

LOCK TABLES `estudiante_apoderado` WRITE;
/*!40000 ALTER TABLE `estudiante_apoderado` DISABLE KEYS */;
INSERT INTO `estudiante_apoderado` VALUES ('E00001','A00002'),('E31355','A00002'),('E65834','A00001'),('E88463','A11490');
/*!40000 ALTER TABLE `estudiante_apoderado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante_seccion`
--

DROP TABLE IF EXISTS `estudiante_seccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante_seccion` (
  `estudiante_id` varchar(250) NOT NULL,
  `seccion_id` varchar(250) NOT NULL,
  PRIMARY KEY (`estudiante_id`,`seccion_id`),
  KEY `estudiante_id` (`estudiante_id`),
  KEY `sección_id` (`seccion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante_seccion`
--

LOCK TABLES `estudiante_seccion` WRITE;
/*!40000 ALTER TABLE `estudiante_seccion` DISABLE KEYS */;
INSERT INTO `estudiante_seccion` VALUES ('E00001','S00002'),('E31355','S00001'),('E65834','S00002'),('E88463','S00001');
/*!40000 ALTER TABLE `estudiante_seccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesor` (
  `profesor_id` varchar(250) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `apellido` varchar(250) NOT NULL,
  `edad` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  PRIMARY KEY (`profesor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES ('P00001','Jose','Mamani',42,70805869,'Av. Lima Lote 69 N 420'),('P00002','Luz Maria','Sanchez',26,75673502,'Calle Los Girasoles Manzana 4 Lote 20');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seccion`
--

DROP TABLE IF EXISTS `seccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seccion` (
  `seccion_id` varchar(250) NOT NULL,
  `profesor_id` varchar(250) NOT NULL,
  `nombre_seccion` varchar(250) NOT NULL,
  PRIMARY KEY (`seccion_id`),
  KEY `profesor_id` (`profesor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seccion`
--

LOCK TABLES `seccion` WRITE;
/*!40000 ALTER TABLE `seccion` DISABLE KEYS */;
INSERT INTO `seccion` VALUES ('S00001','P00001','Leones'),('S00002','P00002','Cobras');
/*!40000 ALTER TABLE `seccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seccion_asignatura`
--

DROP TABLE IF EXISTS `seccion_asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seccion_asignatura` (
  `seccion_id` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  `asignatura_id` varchar(250) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`seccion_id`,`asignatura_id`),
  KEY `seccion_id` (`seccion_id`,`asignatura_id`),
  KEY `asignatura_id` (`asignatura_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seccion_asignatura`
--

LOCK TABLES `seccion_asignatura` WRITE;
/*!40000 ALTER TABLE `seccion_asignatura` DISABLE KEYS */;
INSERT INTO `seccion_asignatura` VALUES ('S00001','AS0001'),('S00001','AS0002'),('S00001','AS0003'),('S00002','AS0001'),('S00002','AS0003'),('S00002','AS0004');
/*!40000 ALTER TABLE `seccion_asignatura` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-20 22:30:37
