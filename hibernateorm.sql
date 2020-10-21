-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Okt 2020 pada 05.12
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hibernateorm`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Division` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `student`
--

INSERT INTO `student` (`id`, `Name`, `Department`, `Division`) VALUES
(672018091, ' Alpha Adarrani Putri', 'BPH', 'Bendahara'),
(672018115, 'Farel Giovano Tanujaya', 'BPH', 'Staff Sekretaris'),
(672018136, 'Andres Freixa Sumihe', 'BPH', 'Ketua'),
(672018138, 'Luis Geraldo Mauboy', 'BPH', 'Sekretaris'),
(672018600, 'Asisten Dosen 1', 'Kemahasiswaan', 'Asisten Dosen'),
(672018601, 'Asisten Dosen 2', 'Kemahasiswaan', 'Asisten Dosen'),
(672018701, 'Proker 1', 'Kemahasiswaan', 'Program Kerja');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
