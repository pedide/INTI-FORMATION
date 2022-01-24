#Le bloc ci-dessous permet d'écraser l'ancienne version de la base de données
#quand j'effectue des modifications
DROP DATABASE IF EXISTS compagnieaerienne_controle_24_01;
CREATE DATABASE compagnieaerienne_controle_24_01 CHARSET = utf8 COLLATE = utf8_general_ci;
USE compagnieaerienne_controle_24_01;

CREATE TABLE Compagnie(idCompagnie int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					   nomCompagnie varchar(25));


CREATE TABLE Avion(idAvion int NOT NULL AUTO_INCREMENT PRIMARY KEY,
				   modele varchar(4),
                   nbrPlaces int,
                   localite varchar(20));
                   
                   
CREATE TABLE Pilote(idPilote int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					nom varchar(20),
                    prenom varchar(20),
                    ville varchar(20),
                    salaire decimal(7, 2));
                    

CREATE TABLE Aeroport(idAeroport int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					  nomAeroport varchar(50));
                      

CREATE TABLE Ville(idVille int NOT NULL AUTO_INCREMENT PRIMARY KEY,
				   nomVille varchar(20));


CREATE TABLE Vol(idVol int NOT NULL AUTO_INCREMENT PRIMARY KEY,
				 jour date,
				 heureDepartVol time,
				 heureArriveeVol time);


CREATE TABLE Escale(idEscale int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    heureArrivee time,
                    heureDepart time);
                    
CREATE TABLE Individu(idIndividu int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					  nomIndividu varchar(50),
                      prenomIndividu varchar(50),
                      adresseIndividu varchar(50),
                      cpIndividu int,
                      villeIndividu varchar(50));


CREATE TABLE ClientRes(codeClient varchar(9));


CREATE TABLE Passager(nbPoints int);


CREATE TABLE Reservation(idReservation int NOT NULL AUTO_INCREMENT PRIMARY KEY,
						 dateReservation date);