-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2024 at 09:09 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `exeat_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `studentaccount`
--

CREATE TABLE IF NOT EXISTS `studentaccount` (
  `indexnumber` varchar(30) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `othernames` varchar(30) DEFAULT NULL,
  `dateofbirth` datetime NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(200) NOT NULL,
  `programme` varchar(60) NOT NULL,
  `housenumber` varchar(30) NOT NULL,
  `registrationdatetime` datetime NOT NULL,
  `registeredby` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE IF NOT EXISTS `useraccount` (
  `userid` varchar(30) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `othernames` varchar(30) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phonenumber` varchar(15) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  `datetimeregistered` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
 ADD PRIMARY KEY (`userid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
