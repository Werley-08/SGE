-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 02, 2025 at 05:59 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bancoescola`
--
CREATE DATABASE IF NOT EXISTS `bancoescola` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `bancoescola`;

-- --------------------------------------------------------

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE IF NOT EXISTS `aluno` (
  `id_aluno` int NOT NULL AUTO_INCREMENT,
  `nome_aluno` text NOT NULL,
  `idade_aluno` int NOT NULL,
  `genero_aluno` text NOT NULL,
  `contato_aluno` varchar(45) NOT NULL,
  `cpf_aluno` varchar(45) NOT NULL,
  `matricula_aluno` int NOT NULL,
  `serie_aluno` varchar(45) NOT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `aluno`
--

INSERT INTO `aluno` (`id_aluno`, `nome_aluno`, `idade_aluno`, `genero_aluno`, `contato_aluno`, `cpf_aluno`, `matricula_aluno`, `serie_aluno`) VALUES
(13, 'Werley', 19, 'Masculino', '(12) 32132-1321', '089.283.928-13', 312312, '2º'),
(18, 'Débora', 34, 'Não Binário', '(32) 32323-2323', '343.434.343-43', 454545, '2º'),
(14, 'Elvis', 45, 'Não Binário', '(24) 32423-4234', '342.342.343-24', 243242, '3º'),
(17, 'David', 2, 'Masculino', '(88) 99203-3918', '345.435.345-34', 353453, '1º');

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id_func` int NOT NULL AUTO_INCREMENT,
  `nome_func` text NOT NULL,
  `idade_func` int NOT NULL,
  `genero_func` text NOT NULL,
  `contato_func` varchar(45) NOT NULL,
  `cpf_func` varchar(45) NOT NULL,
  `cargo_func` text NOT NULL,
  `salario_func` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `identificacao_func` int NOT NULL,
  PRIMARY KEY (`id_func`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `funcionario`
--

INSERT INTO `funcionario` (`id_func`, `nome_func`, `idade_func`, `genero_func`, `contato_func`, `cpf_func`, `cargo_func`, `salario_func`, `identificacao_func`) VALUES
(5, 'João', 40, 'Masculino', '(88) 94345-3453', '234.324.324-32', 'Coordenador(a)', 'R$ 4243,24', 234324),
(2, 'anaildo', 34, 'Masculino', '(12) 32132-1312', '343.434.124-11', 'Professor(a)', 'R$ 1232,13', 132332),
(4, 'Davi', 45, 'Masculino', '(34) 35354-3534', '687.686.876-86', 'Coordenador(a)', 'R$ 6787,68', 686786),
(6, 'Camille', 9, 'Feminino', '(88) 99203-7248', '339.840.923-84', 'Diretor(a)', 'R$ 1000,00', 384824);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `Id_usuario` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(45) NOT NULL,
  `senha_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`Id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`Id_usuario`, `nome_usuario`, `senha_usuario`) VALUES
(1, 'admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
