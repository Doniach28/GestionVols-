-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3308
-- Généré le : lun. 01 jan. 2024 à 20:23
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_vol2`
--

-- --------------------------------------------------------

--
-- Structure de la table `aeroport`
--

CREATE TABLE `aeroport` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `pays` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `aeroport`
--

INSERT INTO `aeroport` (`id`, `nom`, `pays`) VALUES
(1, 'orly', 'France'),
(2, 'carthage', 'Tunisie'),
(3, 'Wahran alger', 'Algérie'),
(4, 'ribat', 'Marroc'),
(5, 'Charles de Gaulle', 'France'),
(6, 'Habib Bourguiba Monastir', 'Tunisie');

-- --------------------------------------------------------

--
-- Structure de la table `escale`
--

CREATE TABLE `escale` (
  `id` int(11) NOT NULL,
  `heurearrive` time NOT NULL,
  `heuredepart` time NOT NULL,
  `id_vol` int(11) NOT NULL,
  `id_aeroport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

CREATE TABLE `vol` (
  `id` int(11) NOT NULL,
  `datedepart` date NOT NULL,
  `heuredepart` time NOT NULL,
  `datearrive` date NOT NULL,
  `heurearrive` time NOT NULL,
  `reservable` tinyint(1) NOT NULL,
  `id_aeroport_depart` int(11) DEFAULT NULL,
  `id_aeroport_arrive` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `vol`
--

INSERT INTO `vol` (`id`, `datedepart`, `heuredepart`, `datearrive`, `heurearrive`, `reservable`, `id_aeroport_depart`, `id_aeroport_arrive`) VALUES
(1, '0000-00-00', '00:00:00', '0000-00-00', '00:00:00', 0, NULL, 0),
(2, '2023-12-30', '20:13:06', '2023-12-30', '20:13:06', 0, NULL, 0),
(3, '2020-11-20', '20:26:21', '2023-12-30', '20:26:21', 1, NULL, 0),
(4, '2020-11-20', '00:00:00', '2022-10-20', '10:00:00', 1, NULL, 0),
(5, '2020-11-20', '00:00:00', '2022-10-20', '22:00:00', 1, NULL, 0),
(6, '2020-11-20', '09:00:00', '2022-10-20', '22:00:00', 1, NULL, 0),
(7, '2020-11-20', '12:12:00', '2020-11-20', '11:11:00', 0, NULL, 0),
(8, '2020-11-20', '12:12:00', '2020-11-20', '11:11:00', 0, NULL, 0),
(9, '2020-10-11', '09:00:00', '2020-08-11', '09:00:00', 0, NULL, 0),
(10, '2023-03-05', '10:15:00', '2023-04-05', '23:30:00', 0, NULL, 0),
(11, '2015-03-08', '10:15:00', '2015-04-11', '23:30:00', 0, NULL, 0),
(12, '2023-12-05', '06:00:00', '2023-12-05', '08:00:00', 0, NULL, 0),
(13, '2023-12-20', '01:00:00', '2023-12-20', '03:00:00', 1, NULL, 0),
(14, '2023-12-20', '01:00:00', '2023-12-20', '03:00:00', 0, NULL, 0),
(15, '2023-12-05', '04:00:00', '2023-12-05', '01:00:00', 0, NULL, NULL),
(16, '2023-12-13', '01:00:00', '2023-12-15', '01:00:00', 0, 1, 3),
(17, '2023-12-12', '01:00:00', '2023-12-14', '01:00:00', 0, 2, 3),
(18, '2024-01-17', '01:00:00', '2024-01-23', '01:00:00', 0, 3, 2);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `aeroport`
--
ALTER TABLE `aeroport`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `escale`
--
ALTER TABLE `escale`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vol`
--
ALTER TABLE `vol`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `aeroport`
--
ALTER TABLE `aeroport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `escale`
--
ALTER TABLE `escale`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `vol`
--
ALTER TABLE `vol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
