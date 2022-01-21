package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competition;
import entity.Epreuve;
import entity.Inscription;
import entity.Licencier;

public class FederationSportiveClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationSportive");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Amateur amateur1 = new Amateur("Martin", "Lucas", "3 rue de la salsa", 75000, "Paris", "France", "lucas.martin@mail.com", "0652312565", "0968589833", true, "Dr. Leroux Marcel");
			Amateur amateur2 = new Amateur("Renaud", "Julie", "3 rue du tango", 75000, "Paris", "France", "julie.renaud@mail.com", "0798522563", "0945599771", true, "Dr. Simon Henri");
			Amateur amateur3 = new Amateur("Jan", "Patrick", "3 rue du tchatcha", 75000, "Paris", "France", "patrick.jan@mail.com", "0648711662", "0902033664", true, "Dr. Dumas Céline");
			Amateur amateur4 = new Amateur("Dupont", "Pierre", "3 rue du rock", 75000, "Paris", "France", "pierre.dupont@mail.com", "0636393831", "0993303145", true, "Dr. House Grégory");
			
			em.persist(amateur1);
			em.persist(amateur2);
			em.persist(amateur3);
			em.persist(amateur4);
			
			Licencier licencier1 = new Licencier("Seligour", "Thibaud", "3 rue du Hip Hop", 75000, "Paris", "France", "thibaud.seligour@mail.com", "0685825154", "0936323030", 456598, "Athlétisme Paris Sud");
			Licencier licencier2 = new Licencier("Robert", "Adrien", "3 rue du Jazz", 75000, "Paris", "France", "adrien.robert@mail.com", "0631212526", "0974585858", 626145, "Athlétisme Paris Nord");
			Licencier licencier3 = new Licencier("Le Du", "Guillaume", "3 rue du Disco", 75000, "Paris", "France", "guillaume.ledu@mail.com", "0748817072", "0996633231", 183965, "Athlétisme Paris Ouest");
			Licencier licencier4 = new Licencier("Corbel", "Antoine", "3 rue de la bachata", 75000, "Paris", "France", "corbel.antoine@mail.com", "0607196532", "0961361847", 132454, "Athlétisme Paris Est");

			em.persist(licencier1);
			em.persist(licencier2);
			em.persist(licencier3);
			em.persist(licencier4);
			
			Competition compet1 = new Competition("2022-01-24", "Grand triathlon de Lyon", "Lyon");
			Competition compet2 = new Competition("2022-01-29", "Grand triathlon de Marseille", "Marseille");
			Competition compet3 = new Competition("2022-02-04", "Grand triathlon de Lille", "Lille");
			
			em.persist(compet1);
			em.persist(compet2);
			em.persist(compet3);
			
			Epreuve compet1_epreuve1 = new Epreuve("Natation", 1500, "Nudisme interdit", compet1);
			Epreuve compet1_epreuve2 = new Epreuve("Cyclisme", 40000, "Vélo de compétition réglementaire obligatoire", compet1);
			Epreuve compet1_epreuve3 = new Epreuve("Course à pied", 10000, "Ne pas oublier de déposer son vélo", compet1);
			Epreuve compet2_epreuve1 = new Epreuve("Natation", 1500, "Nudisme interdit", compet2);
			Epreuve compet2_epreuve2 = new Epreuve("Cyclisme", 40000, "Vélo de compétition réglementaire obligatoire", compet2);
			Epreuve compet2_epreuve3 = new Epreuve("Course à pied", 10000, "Ne pas oublier de déposer son vélo", compet2);
			Epreuve compet3_epreuve1 = new Epreuve("Natation", 1500, "Nudisme interdit", compet3);
			Epreuve compet3_epreuve2 = new Epreuve("Cyclisme", 40000, "Vélo de compétition réglementaire obligatoire", compet3);
			Epreuve compet3_epreuve3 = new Epreuve("Course à pied", 10000, "Ne pas oublier de déposer son vélo", compet3);
			
			em.persist(compet1_epreuve1);
			em.persist(compet1_epreuve2);
			em.persist(compet1_epreuve3);
			em.persist(compet2_epreuve1);
			em.persist(compet2_epreuve2);
			em.persist(compet2_epreuve3);
			em.persist(compet3_epreuve1);
			em.persist(compet3_epreuve2);
			em.persist(compet3_epreuve3);
			
			Inscription inscription1 = new Inscription(154, amateur1, compet1);
			Inscription inscription2 = new Inscription(12, amateur1, compet2);
			Inscription inscription3 = new Inscription(156, amateur1, compet3);
			Inscription inscription4 = new Inscription(92, amateur2, compet1);
			Inscription inscription5 = new Inscription(131, amateur3, compet3);
			Inscription inscription6 = new Inscription(11, amateur4, compet2);
			Inscription inscription7 = new Inscription(3, amateur4, compet3);
			Inscription inscription8 = new Inscription(68, licencier1, compet2);
			Inscription inscription9 = new Inscription(98, licencier2, compet1);
			Inscription inscription10 = new Inscription(44, licencier2, compet3);
			Inscription inscription11 = new Inscription(27, licencier3, compet1);
			Inscription inscription12 = new Inscription(136, licencier3, compet3);
			Inscription inscription13 = new Inscription(130, licencier4, compet1);
			Inscription inscription14 = new Inscription(19, licencier4, compet2);
			Inscription inscription15 = new Inscription(61, licencier4, compet3);
			
			em.persist(inscription1);
			em.persist(inscription2);
			em.persist(inscription3);
			em.persist(inscription4);
			em.persist(inscription5);
			em.persist(inscription6);
			em.persist(inscription7);
			em.persist(inscription8);
			em.persist(inscription9);
			em.persist(inscription10);
			em.persist(inscription11);
			em.persist(inscription12);
			em.persist(inscription13);
			em.persist(inscription14);
			em.persist(inscription15);
			
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
