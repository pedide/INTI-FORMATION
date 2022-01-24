package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Aeroport;
import entity.Avion;
import entity.ClientRes;
import entity.Compagnie;
import entity.Escale;
import entity.Passager;
import entity.Pilote;
import entity.Reservation;
import entity.Ville;
import entity.Vol;

public class compagnieAerienneClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CompagnieAerienne"); //unité de persistance
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Compagnie compagnie = new Compagnie("AirFrance");
			
			em.persist(compagnie);
			
			Pilote pilote1 = new Pilote("Martin", "Jean", "Paris", "21000");
			Pilote pilote2 = new Pilote("Dumas", "Marie", "Marseille", "18000");
			Pilote pilote3 = new Pilote("Loisel", "Pierre", "Lyon", "22000");
			
			em.persist(pilote1);
			em.persist(pilote2);
			em.persist(pilote3);
			
			Avion avion1 = new Avion("A320", 300, "Lyon");
			Avion avion2 = new Avion("A380", 450, "Nantes");
			
			em.persist(avion1);
			em.persist(avion2);
			
			Aeroport aeroport1 = new Aeroport("Aeroport Saint-Exupery");
			Aeroport aeroport2 = new Aeroport("Aeroport Charles De Gaulle");
			Aeroport aeroport3 = new Aeroport("Aeroport Lille-Lesquin");
			Aeroport aeroport4 = new Aeroport("Aeroport Marseille-Provence");
			
			em.persist(aeroport1);
			em.persist(aeroport2);
			em.persist(aeroport3);
			em.persist(aeroport4);
			
			Ville ville1 = new Ville("Lyon", aeroport1);
			Ville ville2 = new Ville("Paris", aeroport2);
			Ville ville3 = new Ville("Lille", aeroport3);
			Ville ville4 = new Ville("Marseille", aeroport4);
			
			em.persist(ville1);
			em.persist(ville2);
			em.persist(ville3);
			em.persist(ville4);
			
			Vol vol1 = new Vol("2022-01-24", "08:00:00", "10:00:00", compagnie, aeroport1, aeroport2, pilote1, avion1);
			Vol vol2 = new Vol("2022-01-24", "09:00:00", "12:00:00", compagnie, aeroport2, aeroport4, pilote2, avion2);
			Vol vol3 = new Vol("2022-01-24", "13:00:00", "16:00:00", compagnie, aeroport4, aeroport3, pilote3, avion2);
			Vol vol4 = new Vol("2022-01-24", "16:00:00", "18:00:00", compagnie, aeroport2, aeroport3, pilote1, avion1);
			
			em.persist(vol1);
			em.persist(vol2);
			em.persist(vol3);
			em.persist(vol4);
			
			Escale escale1 = new Escale("10:30:00", "11:00:00", aeroport1, vol2);
			
			em.persist(escale1);
			
			ClientRes clientRes1 = new ClientRes("Michel", "Julie", "4 rue de la poste", 75000, "Paris", "C164588");
			ClientRes clientRes2 = new ClientRes("Dumas", "Philippe", "8 rue de la gare", 75000, "Paris", "C193222");
			ClientRes clientRes3 = new ClientRes("Dupond", "Henri", "1 rue de la mairie", 75000, "Paris", "C095848");
			
			em.persist(clientRes1);
			em.persist(clientRes2);
			em.persist(clientRes3);
			
			Passager passager1 = new Passager("Le Du", "Pierre", "17 rue de la plage", 75000, "Paris", 15);
			Passager passager2 = new Passager("Le Du", "Monique", "12 rue de la plage", 75000, "Paris", 30);
			Passager passager3 = new Passager("Le Ray", "Jacques", "9 rue de la libération", 75000, "Paris", 10);
			Passager passager4 = new Passager("Moreaux", "Jeanne", "3 rue de la libération", 75000, "Paris", 0);
			Passager passager5 = new Passager("Martin", "John", "22 rue de la santé", 75000, "Paris", 20);
			Passager passager6 = new Passager("Jean", "Jean", "16 rue de la prospérité", 75000, "Paris", 50);
			Passager passager7 = new Passager("Le Haut", "Victor", "15 rue de la persistence", 75000, "Paris", 115);
			Passager passager8 = new Passager("Jeannot", "Lucas", "11 rue de la longévité", 75000, "Paris", 5);
			
			em.persist(passager1);
			em.persist(passager2);
			em.persist(passager3);
			em.persist(passager4);
			em.persist(passager5);
			em.persist(passager6);
			em.persist(passager7);
			em.persist(passager8);
			
			Reservation reservation1 = new Reservation("2022-01-21", clientRes1, passager1, vol1);
			Reservation reservation2 = new Reservation("2022-01-21", clientRes1, passager2, vol1);
			Reservation reservation3 = new Reservation("2022-01-18", clientRes2, passager3, vol2);
			Reservation reservation4 = new Reservation("2022-01-16", clientRes2, passager4, vol2);
			Reservation reservation5 = new Reservation("2022-01-19", clientRes3, passager5, vol3);
			Reservation reservation6 = new Reservation("2022-01-22", clientRes3, passager6, vol3);
			Reservation reservation7 = new Reservation("2022-01-23", clientRes1, passager7, vol4);
			Reservation reservation8 = new Reservation("2022-01-21", clientRes1, passager8, vol4);
			
			em.persist(reservation1);
			em.persist(reservation2);
			em.persist(reservation3);
			em.persist(reservation4);
			em.persist(reservation5);
			em.persist(reservation6);
			em.persist(reservation7);
			em.persist(reservation8);
			
			txn.commit();
		} catch (Exception e) {
			if(txn != null) {txn.rollback();}
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	
}
