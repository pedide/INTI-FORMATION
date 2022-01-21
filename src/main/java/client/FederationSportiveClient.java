package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competitions;
import entity.Epreuve;
import entity.Inscription;
import entity.Licencier;


public class FederationSportiveClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationSportiveManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			
			Inscription ins1 = new Inscription(1245);
			Inscription ins2 = new Inscription(4566);
			Inscription ins3 = new Inscription(7866);
			Inscription ins4 = new Inscription(7254);
			Inscription ins5 = new Inscription(1235);
			Inscription ins6 = new Inscription(8796);
			Inscription ins7 = new Inscription(8643);
			Inscription ins8 = new Inscription(8931);
			
			List<Inscription> listeinscription1 = new ArrayList<Inscription>();
			listeinscription1.add(ins1);
			listeinscription1.add(ins2);
			Licencier lic1 = new Licencier("Michel", "Un", "1 rue des sportifs", 75000, "Paris", "France", "0345789651", "faxmichel1", 1245876, "MichelClub", listeinscription1);
			
			List<Inscription> listeinscription2 = new ArrayList<Inscription>();
			listeinscription2.add(ins3);
			Licencier lic2 = new Licencier("Michel", "Deux", "2 rue des sportifs", 75000, "Paris", "France", "4642384753", "faxmichel2", 5446565, "MichelClub", listeinscription2);
			
			List<Inscription> listeinscription3 = new ArrayList<Inscription>();
			listeinscription3.add(ins4);
			listeinscription3.add(ins5);	
			Licencier lic3 = new Licencier("Michel", "Trois", "3 rue des sportifs", 75000, "Paris", "France", "4654353416", "faxmichel3", 2468435, "MichelClub", listeinscription3);
			
			em.persist(lic1);
			em.persist(lic2);
			em.persist(lic3);
			
			List<Inscription> listeinscription4 = new ArrayList<Inscription>();
			listeinscription4.add(ins6);
			Amateur ama1 = new Amateur("Jack", "Un", "1 rue des jackalopes", 59000, "Lille", "France", "14545431", "faxjack1", 1, "MedecinDeJack1", listeinscription4);
			
			List<Inscription> listeinscription5 = new ArrayList<Inscription>();
			listeinscription5.add(ins7);
			Amateur ama2 = new Amateur("Jack", "Deux", "2 rue des jackalopes", 59000, "Lille", "France", "456846486", "faxjack2", 1, "MedecinDeJack2", listeinscription5);
			
			List<Inscription> listeinscription6 = new ArrayList<Inscription>();
			listeinscription6.add(ins8);
			Amateur ama3 = new Amateur("Jack", "Trois", "3 rue des jackalopes", 59000, "Lille", "France", "84646868", "faxjack3", 1, "MedecinDeJack3", listeinscription6);
			
			em.persist(ama1);
			em.persist(ama2);
			em.persist(ama3);
			
			Epreuve ep1 = new Epreuve("Course", 250, "Terrain herbe");
			Epreuve ep2 = new Epreuve("Course", 500, "Terrain boue");			
			Epreuve ep3 = new Epreuve("Course", 1500, "Terrain montagneux");	
			Epreuve ep4 = new Epreuve("Nage", 800, "Eau froide");	
			Epreuve ep5 = new Epreuve("Nage", 1500, "Eau chaude");	
			Epreuve ep6 = new Epreuve("Nage", 6000, "Océan");	
			
			List<Epreuve> liste1 = new ArrayList<Epreuve>();
			liste1.add(ep1);
			liste1.add(ep2);			
			List<Inscription> listeinscription7 = new ArrayList<Inscription>();
			listeinscription7.add(ins1);		
			listeinscription7.add(ins3);
			listeinscription7.add(ins4);
			Competitions compet1 = new Competitions("21/01/20211", "La Course des Enfers", "Paris", 75000, liste1, listeinscription7);
			
			List<Epreuve> liste2 = new ArrayList<Epreuve>();
			liste2.add(ep3);
			liste2.add(ep6);			
			List<Inscription> listeinscription8 = new ArrayList<Inscription>();
			listeinscription8.add(ins2);		
			listeinscription8.add(ins5);
			listeinscription8.add(ins6);
			Competitions compet2 = new Competitions("23/01/20211", "Terre et Mer", "Paris", 75000, liste2, listeinscription8);			
			
			List<Epreuve> liste3 = new ArrayList<Epreuve>();
			liste3.add(ep4);
			liste3.add(ep5);			
			List<Inscription> listeinscription9 = new ArrayList<Inscription>();
			listeinscription9.add(ins7);		
			listeinscription9.add(ins8);
			Competitions compet3 = new Competitions("21/01/20211", "Thermodynamic choc", "Paris", 75000, liste3, listeinscription9);
			
			em.persist(compet1);
			em.persist(compet2);
			em.persist(compet3);
			
			txn.commit();
			
		} catch (Exception e) {
			System.out.println(e);
			if(txn !=null) {txn.rollback();}
		} finally {
			if(em !=null) {
				em.close();
			}
		}
	}

}
