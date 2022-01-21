package client;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competition;
import entity.Epreuve;
import entity.Inscription;
import entity.Licencie;

public class FedeSportClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FedeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Competition compet1 = new Competition("2022-01-31", "Le tournoi des champions", "Vezoul");
			Competition compet2 = new Competition("2023-03-05", "Le tournoi des champions 2", "Vezoul");
			
			Epreuve epreuve1 = new Epreuve("Course de chameaux", 42, "Avoir un chameau en grande forme", compet1);
			Epreuve epreuve2 = new Epreuve("Chasse à la truite", 3, "Être prêt à se mouiller", compet1);
			
			Epreuve epreuve3 = new Epreuve("Chasse à la truite", 5, "Être prêt à se mouiller", compet2);
			
			Amateur amat1 = new Amateur("Barre", "Raymond", "Paris", "France", 2854, "Dr Robert");
			Amateur amat2 = new Amateur("Gamegie", "Samsagace", "Hobbitebourg", "Comté", 2827, "Dr Glandalf");
			
			Licencie lic1 = new Licencie("Sacquet", "Frodon", "Hobbitebourg", "Comté", 067575, "FC Baggins");
			
			Inscription insc1 = new Inscription(1, amat1, compet1);
			Inscription insc2 = new Inscription(1, amat1, compet2);
			Inscription insc3 = new Inscription(3, amat2, compet1);
			Inscription insc4 = new Inscription(5, lic1, compet1);
			Inscription insc5 = new Inscription(2, lic1, compet2);
			
			
			
			em.persist(compet1);
			em.persist(compet2);
			em.persist(epreuve1);
			em.persist(epreuve2);
			em.persist(epreuve3);
			em.persist(amat1);
			em.persist(amat2);
			em.persist(lic1);
			em.persist(insc1);
			em.persist(insc2);
			em.persist(insc3);
			em.persist(insc4);
			em.persist(insc5);
			

			
			//Competition compet1 = new Competition("2022-01-31", "Le tournoi des champions", "Vezoul", listepreuv1);
			
			//Licencie licencie1 = new Licencie("Les pélos du Larzac", );
			//Amateur;
			
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
