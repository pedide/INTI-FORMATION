#Le bloc ci-dessous permet d'écraser l'ancienne version de la base de données
#quand j'effectue des modifications
DROP DATABASE IF EXISTS LaFerme_controle_24_01;
CREATE DATABASE LaFerme_controle_24_01 CHARSET = utf8 COLLATE = utf8_general_ci;
USE LaFerme_controle_24_01;

CREATE TABLE clients(idCli int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					 nomCli varchar(40),
                     prenomCli varchar(40),
                     adresse varchar(40),
                     cp varchar(6),
                     ville varchar(40));

CREATE TABLE produits(idProd int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					  proNom varchar(40),
					  proPrix float,
					  designation text);

CREATE TABLE animal(idAnim int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					espece varchar(40),
                    sexe char(10),
                    dateNaissance date,
                    nom varchar(30),
                    commentaire TEXT);

CREATE TABLE adoption(idAdoption int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					  dateAdoption date,
                      prixAdoption float,
                      certificatAdoption int);

CREATE TABLE voiture(idVoit int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					 modele varchar(40),
                     couleur varchar(40),
                     immatriculation varchar(20),
                     puissance int);

CREATE TABLE achat(idAchat int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                   prixAchat float);
