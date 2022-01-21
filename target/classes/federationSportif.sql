DROP DATABASE IF EXISTS  federationSportif;

CREATE DATABASE federationSportif;

USE federationSportif;

CREATE TABLE Competition (
							idCompet int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            dateCompet date,
                            nomCompet varchar(255),
                            villeCompet varchar(255)
                            );
                            
CREATE TABLE Epreuve (
							idEpr int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            typeEpr varchar(255),
                            distanceEpr int,
                            conditionEpr int,
                            competition_idCompet int,
                            FOREIGN KEY (competition_idCompet) REFERENCES Competition(idCompet)
                            );
                            
CREATE TABLE Inscrire(
							idInscrire  int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            DossardCompet int,
							competition_idCompet int REFERENCES Competition(idCompet),
                            sportif_idSportif int REFERENCES Sportif(idSportif)
                            );
                            
CREATE TABLE Sportif(
							idSportif int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            nom varchar(45),
                            prenom varchar(45),
                            adresse varchar(245),
                            cp int,
                            ville varchar(45),
                            pays varchar(45),
                            email varchar(45),
                            tel varchar(45),
                            fax varchar(45)
                            );

CREATE TABLE Licencie(
							idLicencie int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            numLicence int,
                            nomClub varchar(45),
                            sportif_idSportif int,
                            FOREIGN KEY (sportif_idSportif) REFERENCES Sportif(idSportif)
                            );
                            
CREATE TABLE Amateur(
							idAmateur int PRIMARY KEY 
                            NOT NULL
                            UNIQUE
                            AUTO_INCREMENT,
                            certifMedical varchar(45),
                            nomMedecin varchar(150),
                            sportif_idSportif INT,
                            FOREIGN KEY (sportif_idSportif) REFERENCES Sportif(idSportif)
                            );
                            
                                        

						
/*

INSERT INTO Competition VALUES
						 (1, "2018/12/11" , "IRONMAN" , "NICE"),
                         (2, "2017/03/21" , "MUDDAY" , "ANTIBE"), 
                         (3, "2017/08/07" , "APOCAPISEZ" , "VENCE");
                         
INSERT INTO Epreuve ( idEpr, typeEpr, distanceEpr, conditionEpr, competition_idCompet) VALUES
										( 1, "COURSE A PIED", 10, 1, 1),
                                        ( 2, "COURSE EN VELO", 10, 2, 2),
                                        ( 3, "NATATION", 15, 3, 3),
                                        ( 4, "PLONGER SOUS MARIN", 1000, 10, 2);
	   
ALTER TABLE Epreuve
ADD competition_idCompet INT;

ALTER TABLE Epreuve
  ADD FOREIGN KEY (competition_idCompet) REFERENCES Competition(idCompet);
  
ALTER TABLE Inscrire
ADD competition_idCompet INT;

ALTER TABLE Inscrire
ADD sportif_idSportif INT;

ALTER TABLE Inscrire
  ADD PRIMARY KEY (competition_idCompet, sportif_idSportif) REFERENCES (Competition(idCompet), Sportif(idSportif));

ALTER TABLE Inscrire
  ADD PRIMARY KEY (competition_idCompet, sportif_idSportif) REFERENCES (Competition(idCompet), Sportif(idSportif));


*/


                            
                            
                            
