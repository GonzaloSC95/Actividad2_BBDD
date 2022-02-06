-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2022 a las 18:13:50
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `actividad2_bbdd`
--
CREATE SCHEMA ACTIVIDAD2_BBDD; USE ACTIVIDAD2_BBDD;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

CREATE TABLE `coches` (
  `ID` int(11) NOT NULL,
  `MATRICULA` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `MARCA` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `MODELO` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `COLOR` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `NUM_PASAJEROS` int(11) DEFAULT 0 CHECK (`NUM_PASAJEROS` <= 5 and `NUM_PASAJEROS` >= 0)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`ID`, `MATRICULA`, `MARCA`, `MODELO`, `COLOR`, `NUM_PASAJEROS`) VALUES
(1, 'X12-548', 'Mercedes', 'Clase A', 'Negro', 4),
(2, 'X02-125', 'Alfa Romeo', '500C', 'Rojo', 1),
(3, 'X82-055', 'Abarth', '4C', 'Verde', 1),
(4, 'M82-111', 'Ferrari', 'A9', 'Negro', 0),
(5, 'K82-589', 'BMW', 'A10', 'Gris', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajeros`
--

CREATE TABLE `pasajeros` (
  `ID` int(11) NOT NULL,
  `COCHEID` int(11) DEFAULT NULL,
  `NOMBRE` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `PESO` decimal(11,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pasajeros`
--

INSERT INTO `pasajeros` (`ID`, `COCHEID`, `NOMBRE`, `EDAD`, `PESO`) VALUES
(1, 1, 'Gonzalo', 26, '83.500'),
(2, 1, 'Roberto', 20, '70.500'),
(3, 2, 'Marcos', 26, '71.500'),
(4, 1, 'Luis', 30, '90.500'),
(5, 3, 'Juan', 31, '84.560'),
(6, 1, 'Pedro', 18, '70.980');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `coches`
--
ALTER TABLE `coches`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indices de la tabla `pasajeros`
--
ALTER TABLE `pasajeros`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD KEY `COCHEID` (`COCHEID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `coches`
--
ALTER TABLE `coches`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `pasajeros`
--
ALTER TABLE `pasajeros`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pasajeros`
--
ALTER TABLE `pasajeros`
  ADD CONSTRAINT `pasajeros_ibfk_1` FOREIGN KEY (`COCHEID`) REFERENCES `coches` (`ID`) ON DELETE SET NULL ON UPDATE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=1) WHERE ID=1;
UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=2) WHERE ID=2;
UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=3) WHERE ID=3;
UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=4) WHERE ID=4;
UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=5) WHERE ID=5;
UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=6) WHERE ID=6;
