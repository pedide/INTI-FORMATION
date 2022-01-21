DROP DATABASE IF EXISTS FederationSportive;
CREATE DATABASE FederationSportive CHARSET = utf8 COLLATE = utf8_general_ci;
USE FederationSportive;

CREATE TABLE sportif(idSportif int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					 nomSportif varchar(20),
                     prenomSportif varchar(20),
                     adresse varchar(20),
                     cp int,
                     ville varchar(20),
                     pays varchar(20),
                     email varchar(40),
                     tel varchar(10),
                     fax varchar(20));
                      
CREATE TABLE licencier(numLicence int,
					   nomClub varchar(40));
                       
CREATE TABLE amateur(certificatMedical boolean,
					 nomMedecin varchar(20));
                      
CREATE TABLE competition(idCompetition int NOT NULL AUTO_INCREMENT PRIMARY KEY,
						 dateCompet date,
                         nomCompet varchar(40),
                         villeCompet varchar(20));

CREATE TABLE inscription(idInscription int NOT NULL AUTO_INCREMENT PRIMARY KEY,
						 dossardCompet int);

CREATE TABLE epreuve(idEpreuve int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					 typeEpreuve varchar(20),
                     distanceEpreuve int,
                     conditionEpreuve varchar(50));