DROP DATABASE IF EXISTS federation_sportive_db;
CREATE DATABASE federation_sportive_db CHARSET = utf8 COLLATE = utf8_general_ci;
USE federation_sportive_db;

CREATE TABLE Competitions(idCompet int NOT NULL AUTO_INCREMENT KEY,
                     dateCompet varchar(20),
                     nomCompet varchar(50),
                     villeCompet varchar(50));

CREATE TABLE Epreuve(idEpreuve int NOT NULL AUTO_INCREMENT KEY,
					typeEpreuve varchar(50),
                    distanceEpreuve int,
                    conditionEpreuve varchar(50));

CREATE TABLE Inscription(idInscription int NOT NULL AUTO_INCREMENT KEY, dossardCompet int);

CREATE TABLE Sportifs(idSportif int NOT NULL AUTO_INCREMENT KEY,
					nomSportif varchar(50),
                    prenomSportif varchar(50),
                    adresse varchar(50),
                    cp int,
                    ville varchar(50),
                    pays varchar(50),
                    email varchar(50),
                    tel varchar(50),
                    fax varchar(50));

CREATE TABLE Licencie(idLicencie int NOT NULL AUTO_INCREMENT KEY,
					nomClub varchar(50));

CREATE TABLE Amateur(certificatMedical boolean,
					nomMedecin varchar(50));


