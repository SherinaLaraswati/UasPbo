-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Jun 2023 pada 04.36
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbdatasekolah`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `namaAkun` varchar(25) NOT NULL,
  `Psw` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`namaAkun`, `Psw`) VALUES
('admin', 'admin123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datasekolah`
--

CREATE TABLE `datasekolah` (
  `nama` varchar(25) NOT NULL,
  `kelas` varchar(25) NOT NULL,
  `nomer_kartu` int(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `gender` varchar(25) NOT NULL,
  `ttl` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datasekolah`
--

INSERT INTO `datasekolah` (`nama`, `kelas`, `nomer_kartu`, `alamat`, `gender`, `ttl`) VALUES
('Abidzar Abi', 'MIPA 1', 3065, 'Jl. Sukamaju', 'Laki-Laki', 'Bandung, 08-10-2006'),
('Reyna ', 'Sosial 1', 3077, 'Jl. Bumi', 'Perempuan', 'Balikpapan, 25-02-2008');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`namaAkun`);

--
-- Indeks untuk tabel `datasekolah`
--
ALTER TABLE `datasekolah`
  ADD PRIMARY KEY (`nomer_kartu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
