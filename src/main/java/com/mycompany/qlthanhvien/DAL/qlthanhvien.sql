-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2024 at 06:18 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlthanhvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `thanhvien`
--

CREATE TABLE `thanhvien` (
  `MaTV` int(10) NOT NULL,
  `HoTen` varchar(100) NOT NULL,
  `Khoa` varchar(100) DEFAULT NULL,
  `Nganh` varchar(100) DEFAULT NULL,
  `SDT` int(10) DEFAULT NULL,
  `Email` varchar(255) NOT NULL,
  `PassWord` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `thanhvien`
--

INSERT INTO `thanhvien` (`MaTV`, `HoTen`, `Khoa`, `Nganh`, `SDT`, `Email`, `PassWord`) VALUES
(1120010007, 'Nguyễn Gia Mai', 'Toán UD', 'Toán', 911200100, '1120010007@gmail.com', 1120010007),
(1120020019, 'Chu Phúc Ngọc', 'SP KHTN', 'Lí', 911200200, '11200200019@gmail.com', 2147483647),
(1120090014, 'Nguyễn Thị Mỹ Ngân', 'SP KHXH', 'Văn', 911200900, '11200900014@gmail.com', 2147483647),
(1120090018, 'Trần Thị Anh Ngọc', 'SP KHXH', 'Văn', 911200900, '11200900018@gmail.com', 2147483647),
(1120150184, 'Trần Thị Nữ', 'GDTH', 'GDTH', 1111111111, '', 0),
(1120410311, 'Lê Việt Nga', 'CNTT', 'CNTT', 911204103, '11204110311@gmail.com', 2147483647),
(1120480015, 'Trần Phạm Ngọc Ly', 'Toán UD', 'Toán', 911204800, '1120480015@gmail.com', 1120480015),
(1120480216, 'Nguyễn Trần Thái Ngọc', 'Toán UD', 'Toán', 911204802, '11204800216@gmail.com', 2147483647),
(1120480217, 'Trần Minh Phúc Ngọc', 'Toán UD', 'Toán', 911204802, '11204800217@gmail.com', 2147483647),
(1121020009, 'Bùi Đình Thái My', 'SP KHTN', 'Lí', 911210200, '1121020009@gmail.com', 1121020009),
(1121100003, 'Nguyễn Đắc Phương Linh', 'SP KHXH', 'Sử', 911211000, '1121100003@gmail.com', 1121100003),
(1121100012, 'Trương Hoài Nga', 'SP KHXH', 'Sử', 911211000, '11211000012@gmail.com', 2147483647),
(1121110001, 'Phạm Thị Lan Khôi', 'SP KHXH', 'Địa', 911211100, '1121110001@gmail.com', 1121110001),
(1121130012, 'Lê Ngọc lan', 'Ngoại Ngữ', 'Anh', 911211300, '1121130012@gmail.com', 1121130012),
(1121530087, 'Trần Thiếu Nam', 'TLH', 'QLGD', 1111111112, '', 0),
(1122090010, 'Lê Xuân Nam', 'SP KHXH', 'Văn', 911220900, '11220900010@gmail.com', 2147483647),
(1122090013, 'Nguyễn Mỹ Ngân', 'SP KHXH', 'Văn', 911220900, '11220900013@gmail.com', 2147483647),
(1122090015, 'Nguyễn Thủy Triều Ngọc', 'SP KHXH', 'Văn', 911220900, '11220900015@gmail.com', 2147483647),
(1122550008, 'Nguyễn Gia My', 'QTKD', 'QTKD', 911225500, '1122550008@gmail.com', 1122550008),
(1123330257, 'Ngô Tuyết Nhi', 'QTKD', 'QTKD', 1111111113, 'aaaaaaaaaaaaaaaaaaaaaaaaa', 0),
(2147483647, 'Nguyễn Văn Nam', 'CNTT', 'HTTT', 123456789, 'qqqqqqqqqqqqqqqqqqqqqqqqqqqqqq', 0);

-- --------------------------------------------------------

--
-- Table structure for table `thietbi`
--

CREATE TABLE `thietbi` (
  `MaTB` int(10) NOT NULL,
  `TenTB` varchar(100) NOT NULL,
  `MoTaTB` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `thietbi`
--

INSERT INTO `thietbi` (`MaTB`, `TenTB`, `MoTaTB`) VALUES
(5, '56', '56'),
(120191, 'Micro không dây 01', 'JBL VM 2001'),
(120192, 'Micro có dây 01', 'MCCD 1001'),
(120203, 'Micro không dây 02', 'BCE 9001'),
(120214, 'Micro không dây 03', 'M3001'),
(120235, 'Micro không dây 03', 'BCE UGX12'),
(420201, 'Cassette Sony', 'CN 20201'),
(420212, 'Cassette Sony', 'CN 20211'),
(420213, 'Cassette TQ', 'CSTQ 20211'),
(420224, 'Cassette Sony', 'CS 20221'),
(420236, 'Cassette Sony', 'CS 2023'),
(520221, 'Tivi LG', 'TVLG021'),
(520222, 'Tivi Samsung', 'TVSS20221'),
(620231, 'Quạt đứng', 'QD 20231'),
(620232, 'Quạt đứng', 'QD 20232'),
(620233, 'Quạt đứng', 'QD 20233'),
(620234, 'Quạt đứng', 'QD 20234'),
(1000001, 'Microâs', 'Micro không dây MS2023'),
(1000002, 'Micro', 'Micro không dây MS2024');

-- --------------------------------------------------------

--
-- Table structure for table `thongtinsd`
--

CREATE TABLE `thongtinsd` (
  `MaTT` int(10) NOT NULL,
  `MaTV` int(10) NOT NULL,
  `MaTB` int(10) DEFAULT NULL,
  `TGVao` datetime DEFAULT NULL,
  `TGMuon` datetime DEFAULT NULL,
  `TGTra` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `thongtinsd`
--

INSERT INTO `thongtinsd` (`MaTT`, `MaTV`, `MaTB`, `TGVao`, `TGMuon`, `TGTra`) VALUES
(1, 1120150184, NULL, '2024-01-05 09:00:00', NULL, NULL),
(2, 1123330257, 1000001, NULL, '2024-02-12 10:00:32', NULL),
(4, 1120150184, 1000002, NULL, '2024-04-05 14:34:47', NULL),
(11, 2147483647, 420224, '2024-04-16 18:24:42', NULL, NULL),
(12, 1121100012, 120203, NULL, '2024-04-16 17:41:29', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `xuly`
--

CREATE TABLE `xuly` (
  `MaXL` int(10) NOT NULL,
  `MaTV` int(10) NOT NULL,
  `HinhThucXL` varchar(250) DEFAULT NULL,
  `SoTien` int(100) DEFAULT NULL,
  `NgayXL` datetime DEFAULT NULL,
  `TrangThaiXL` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `xuly`
--

INSERT INTO `xuly` (`MaXL`, `MaTV`, `HinhThucXL`, `SoTien`, `NgayXL`, `TrangThaiXL`) VALUES
(1, 1121530087, 'Khóa thẻ 1 tháng', NULL, '2023-09-12 08:00:00', 0),
(2, 2147483647, 'Khóa thẻ 2 tháng', NULL, '2023-09-12 08:00:00', 0),
(3, 1123330257, 'Bồi thường mất tài sản', 300000, '2023-09-12 08:00:00', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `thanhvien`
--
ALTER TABLE `thanhvien`
  ADD PRIMARY KEY (`MaTV`);

--
-- Indexes for table `thietbi`
--
ALTER TABLE `thietbi`
  ADD PRIMARY KEY (`MaTB`);

--
-- Indexes for table `thongtinsd`
--
ALTER TABLE `thongtinsd`
  ADD PRIMARY KEY (`MaTT`),
  ADD KEY `MaTV` (`MaTV`,`MaTB`),
  ADD KEY `MaTB` (`MaTB`);

--
-- Indexes for table `xuly`
--
ALTER TABLE `xuly`
  ADD PRIMARY KEY (`MaXL`),
  ADD KEY `MaTV` (`MaTV`),
  ADD KEY `MaTV_2` (`MaTV`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `thongtinsd`
--
ALTER TABLE `thongtinsd`
  MODIFY `MaTT` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `thongtinsd`
--
ALTER TABLE `thongtinsd`
  ADD CONSTRAINT `thongtinsd_ibfk_1` FOREIGN KEY (`MaTV`) REFERENCES `thanhvien` (`MaTV`),
  ADD CONSTRAINT `thongtinsd_ibfk_2` FOREIGN KEY (`MaTB`) REFERENCES `thietbi` (`MaTB`);

--
-- Constraints for table `xuly`
--
ALTER TABLE `xuly`
  ADD CONSTRAINT `xuly_ibfk_1` FOREIGN KEY (`MaTV`) REFERENCES `thanhvien` (`MaTV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
