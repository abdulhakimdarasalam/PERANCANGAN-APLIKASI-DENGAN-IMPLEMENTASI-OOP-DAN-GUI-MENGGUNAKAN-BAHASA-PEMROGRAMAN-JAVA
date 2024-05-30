-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2023 at 03:23 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tokosepatu`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `email` varchar(70) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(16) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jKel` char(1) NOT NULL,
  `tglLahir` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sepatu`
--

CREATE TABLE `sepatu` (
  `kd_sepatu` varchar(5) NOT NULL,
  `brand` varchar(25) NOT NULL,
  `nm_sepatu` varchar(50) NOT NULL,
  `harga` int(8) NOT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sepatu`
--

INSERT INTO `sepatu` (`kd_sepatu`, `brand`, `nm_sepatu`, `harga`, `deskripsi`) VALUES
('SP1', 'NEW BALANCE', '1080v13', 2560000, '1080 memberikan performa terbaik untuk semua jenis pelari, baik saat Anda berlatih untuk kompetisi kelas dunia, atau saat Anda sedang mengejar kereta di jam-jam sibuk. Fresh Foam X 1080v13 mewakili perkembangan yang konsisten dari kualitas khas model ini. Transisi yang mulus dari pengalaman bantalan di bawah kaki yang terbaik telah disesuaikan dengan pemetaan midsole yang telah diperbarui, yang mengaplikasikan lebih banyak busa pada area yang lebih luas pada midsole dan meningkatkan fleksibilitas pada titik-titik yang lebih sempit.'),
('SP2', 'NEW BALANCE', '990v6', 3100000, 'Perancang asli 990 ditugaskan untuk menciptakan sepatu lari tunggal terbaik di pasar.Produk jadi lebih dari sekadar memenuhi tagihannya. Ketika diluncurkan untuk pertama kalinya pada tahun 1982, 990 menggunakan warna abu-abu yang elegan, dan label harga tiga digit yang tidak pernah terdengar sebelumnya.'),
('SP3', 'NEW BALANCE', 'WOMEN\'S 550', 1710000, '550 yang asli memulai debutnya pada tahun 1989 dan membuat jejaknya di lapangan basket dari pantai ke pantai. Setelah pertama kali dijalankan, 550 disimpan di arsip, sebelum diperkenalkan kembali dalam rilis edisi terbatas pada akhir tahun 2020, dan kembali ke jajaran model penuh waktu pada tahun 2021, dengan cepat menjadi favorit mode global. Siluet ramping dan bagian atas rendah dari 550 memberikan kesan bersih pada desain tugas berat di akhir tahun 80-an, sedangkan konstruksi atas berbahan suede dan mesh yang dapat diandalkan merupakan tampilan klasik di era mana pun.\r\n'),
('SP4', 'NEW BALANCE', '1540v3', 2560000, '1540v3 kami dilengkapi dengan teknologi yang membantu menghadirkan stabilitas jarak jauh dan memerangi overpronasi. Itu dibuat dengan dua lapisan busa kinerja yang menawarkan dukungan unggul dan pantulan lembut. Didesain dengan teknologi midsole ENCAP dan Rollbar, pelari ini menawarkan kontrol pergerakan kaki belakang untuk lari dari jarak 5K dan seterusnya.\r\n'),
('SP5', 'NEW BALANCE', '9060', 2320000, '9060 adalah ekspresi baru dari gaya halus dan desain berbasis inovasi dari seri 99X klasik. 9060 menafsirkan ulang elemen-elemen 99X yang familiar dengan sensibilitas melengkung yang terinspirasi oleh estetika teknologi yang futuristik dan terlihat jelas di era Y2K.\r\n'),
('SP6', 'NEW BALANCE', '928v3', 2340000, 'Stabil dan mantap memenangkan perlombaan. Sepatu jalan wanita New Balance 928 dilengkapi kontrol gerak dan teknologi stabilitas ROLLBAR serta bantalan ABZORB untuk kenyamanan dari pagi hingga tengah malam.\r\n');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `sepatu`
--
ALTER TABLE `sepatu`
  ADD PRIMARY KEY (`kd_sepatu`),
  ADD UNIQUE KEY `nm_sepatu` (`nm_sepatu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
