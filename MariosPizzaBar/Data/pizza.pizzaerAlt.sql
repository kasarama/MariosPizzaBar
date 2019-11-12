-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: pizza
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `odrerinfo`
--

DROP TABLE IF EXISTS `odrerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `odrerinfo` (
  `idOdrerInfo` int(11) NOT NULL,
  `idOdrer` int(11) DEFAULT NULL,
  `PizzaNR` int(11) DEFAULT NULL,
  `Antal` int(11) DEFAULT NULL,
  PRIMARY KEY (`idOdrerInfo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `odrerinfo`
--

LOCK TABLES `odrerinfo` WRITE;
/*!40000 ALTER TABLE `odrerinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `odrerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordrer`
--

DROP TABLE IF EXISTS `ordrer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordrer` (
  `idOrdrer` int(11) NOT NULL AUTO_INCREMENT,
  `Tid` varchar(145) DEFAULT NULL,
  `Dato` varchar(145) DEFAULT NULL,
  `Sum` int(11) DEFAULT NULL,
  PRIMARY KEY (`idOrdrer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordrer`
--

LOCK TABLES `ordrer` WRITE;
/*!40000 ALTER TABLE `ordrer` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordrer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizzaer`
--

DROP TABLE IF EXISTS `pizzaer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizzaer` (
  `NR` int(11) NOT NULL,
  `Navn` varchar(45) NOT NULL,
  `Ingredienser` varchar(145) NOT NULL,
  `Pris` int(11) NOT NULL,
  PRIMARY KEY (`NR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzaer`
--

LOCK TABLES `pizzaer` WRITE;
/*!40000 ALTER TABLE `pizzaer` DISABLE KEYS */;
INSERT INTO `pizzaer` VALUES (1,'Pepo','peperoni, ost',65),(2,'Sofie','peperoni, skinke, ost',70),(3,'Ostedroem','gorgonzola, oksekoed og ost',80),(4,'bejamin','tomat, ost, gorgonzola, champignon',75),(5,'Malene','tomat, ost, skinke og champignon',75),(6,'Mathias','tomat, ost, hakket oksekoed, champignon',67),(7,'Thomas','tomat, ost, skinke, salami og champignon',87),(8,'Anders','tomat, ost, skinke, bacon og eag',67),(9,'Rasmus','tomat, ost, kylling, loeg og paprika',76),(10,'Clara','tomat, ost, kebab og loeg',67),(11,'Freja','tomat, ost, skinke og ananas',77),(12,'Egon','tomat, ost, skinke og pepperoni',67),(13,'Hanne','tomat, ost, skinke og bacon',70),(14,'Klaus','tomat, ost, parmaskinke, rucolasalat, pesto',80),(15,'Kevin','tomat, ost, skinke og cocktailpoelser',75),(16,'Matti','tomat, ost, kebab, shawarma, gorgonzola',85),(17,'Ulla','tomat, ost, champignon, loeg, ananas, asparges og paprika',80),(18,'Simon','tomat, ost, skinke, pepperoni, cocktailpoelser og bacon',80),(19,'Peter','tomat, ost, kebab, loeg, fetaost og tomatskiver',75),(20,'Paul','tomat, ost, kylling, friske tomater, paprika, loeg og bacon',80),(21,'Olivia','tomat, ost, kebab, pepperoni, groen peber, chili og hvidloeg',75),(22,'Anna','tomat, ost, hakket oksekoed, groen peber, shawarma, chili og hvidloeg',80),(23,'Martin','tomat, ost, hakket oksekoed, groen peber og gorgonzola',85),(24,'Greta','tomat, ost, skinke, bacon og loeg',85),(25,'Vibeke','tomat, ost, skinke, koedsauce og champignon',90),(26,'Cathrine','tomat, ost, skinke, hakket oksekoed og bearnaisesauce',85),(27,'Magdalene','tomat, ost, skinke, hakket oksekoed og bearnaisesauce',98),(28,'Ingrid','tomat, ost, rucola salat, kylling og pesto',88),(29,'Freja','tomat, ost, kebab, bacon, hvidloeg, pepperoni og loeg',77),(30,'Thor','tomat, ost,  pepperoni, cocktailpoelser og bacon',76);
/*!40000 ALTER TABLE `pizzaer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-11 11:59:12
