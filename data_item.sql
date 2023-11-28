-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2023 at 06:42 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_obat`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_item`
--

CREATE TABLE `data_item` (
  `id_item` varchar(7) NOT NULL CHECK (`id_item` regexp 'ITM[0-9][0-9][0-9]'),
  `nama_item` varchar(50) NOT NULL,
  `kategori_item` varchar(50) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga_item` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_item`
--

INSERT INTO `data_item` (`id_item`, `nama_item`, `kategori_item`, `stok`, `harga_item`) VALUES
('ITM001', 'Paracetamol Cair', 'Obat cair', 100, 20000),
('ITM002', 'Aspirin Tablet 500 mg', 'Tablet', 200, 15000),
('ITM003', 'Amoxicillin Kapsul 250 mg', 'Kapsul', 150, 25000),
('ITM004', 'Salep Antiinflamasi', 'Obat oles', 50, 30000),
('ITM005', 'Supositoria Paracetamol', 'Supositoria', 80, 40000),
('ITM006', 'Tetes Mata Antialergi', 'Obat tetes', 120, 15000),
('ITM007', 'Salbutamol Inhaler', 'Inhaler', 60, 50000),
('ITM008', 'Ceftriaxone Suntik 1g', 'Obat suntik', 30, 70000),
('ITM009', 'Implan Kontrasepsi', 'Implan', 10, 500000),
('ITM010', 'Nitroglycerin Tablet Bukal', 'Implan', 40, 35000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_item`
--
ALTER TABLE `data_item`
  ADD PRIMARY KEY (`id_item`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
