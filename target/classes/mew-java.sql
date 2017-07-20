-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2017 at 03:08 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mew-java`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `createdAt` date DEFAULT NULL,
  `updatedAt` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `title`, `code`, `createdAt`, `updatedAt`) VALUES
(1, 'new', 'new', '2017-07-11', '2017-07-11'),
(2, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(3, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(4, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(5, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(6, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(7, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(8, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(9, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(10, 'Advanced CS', 'PSY101', '2017-07-10', '2017-07-10'),
(11, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(12, 'Introduction to Software Engineering', 'CSCC01', '2017-07-10', '2017-07-10'),
(13, NULL, NULL, '2017-07-11', '2017-07-11'),
(14, 'the title', 'PS101', '2017-07-11', '2017-07-11'),
(15, 'new', 'new', '2017-07-11', '2017-07-11'),
(16, 'new', 'new', '2017-07-11', '2017-07-11'),
(17, 'new11', 'new11', '2017-07-11', '2017-07-11'),
(18, 'test title', 'test code', '2017-07-12', '2017-07-12'),
(19, 'test title', 'test code', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `course_announcements`
--

CREATE TABLE `course_announcements` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_materials`
--

CREATE TABLE `course_materials` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `material_url` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_materials`
--

INSERT INTO `course_materials` (`id`, `course_id`, `material_url`) VALUES
(1, 1, 'test code'),
(2, 1, 'test code'),
(3, 1, 'C:/xampp/htdocs/projects/whiteboard-application/src/main/webapp/uploads/authorize.php'),
(4, 1, '/uploads/COPYRIGHT.txt'),
(5, 1, '/uploads/cron.php'),
(6, 1, '/uploads/authorize.php'),
(7, 1, '/uploads/cnp.sh'),
(8, 1, '/uploads/new.txt'),
(9, 1, '/uploads/links.txt'),
(10, 1, '/uploads/jin sha shen hua.mp3');

-- --------------------------------------------------------

--
-- Table structure for table `profiles`
--

CREATE TABLE `profiles` (
  `id` int(11) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `imageUrl` varchar(255) DEFAULT NULL,
  `createdAt` date DEFAULT NULL,
  `updatedAt` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `createdAt` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course_announcements`
--
ALTER TABLE `course_announcements`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course_materials`
--
ALTER TABLE `course_materials`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `profiles`
--
ALTER TABLE `profiles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `course_announcements`
--
ALTER TABLE `course_announcements`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_materials`
--
ALTER TABLE `course_materials`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
