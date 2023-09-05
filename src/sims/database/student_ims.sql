-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2023 at 03:10 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_ims`
--

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `id` int(11) NOT NULL,
  `studentId` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `isPending` tinyint(1) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `dueDate` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `firstName` varchar(75) NOT NULL,
  `lastName` varchar(75) NOT NULL,
  `middleName` varchar(75) DEFAULT NULL,
  `department` varchar(75) NOT NULL,
  `studentNumber` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `alternativeEmail` varchar(255) DEFAULT NULL,
  `password` text NOT NULL,
  `sex` enum('Male','Female') DEFAULT NULL,
  `yearLevel` varchar(55) DEFAULT NULL,
  `section` varchar(10) DEFAULT NULL,
  `currentSem` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `id` int(11) NOT NULL,
  `studentId` int(11) NOT NULL,
  `address` text DEFAULT NULL,
  `guardianName` varchar(75) DEFAULT NULL,
  `birthday` varchar(75) DEFAULT NULL,
  `contactNumber` varchar(75) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `id` int(11) NOT NULL,
  `studentId` int(11) DEFAULT NULL,
  `subjectCode` varchar(75) DEFAULT NULL,
  `faculty` varchar(75) DEFAULT NULL,
  `subjectTitle` varchar(255) DEFAULT NULL,
  `remarks` varchar(75) DEFAULT NULL,
  `units` int(11) DEFAULT NULL,
  `grade` double DEFAULT 0,
  `semester` varchar(55) DEFAULT NULL,
  `yearLevel` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fee`
--
ALTER TABLE `fee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `studentId` (`studentId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `studentNumber` (`studentNumber`);

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `studentId` (`studentId`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`id`),
  ADD KEY `studentId` (`studentId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fee`
--
ALTER TABLE `fee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `student_info`
--
ALTER TABLE `student_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `subject`
--
ALTER TABLE `subject`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `fee`
--
ALTER TABLE `fee`
  ADD CONSTRAINT `fee_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`);

--
-- Constraints for table `student_info`
--
ALTER TABLE `student_info`
  ADD CONSTRAINT `student_info_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`);

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
