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
import entity.Sportifs;


public class FederationsportivejpaClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationSportiveManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			// Création des inscriptions
			Inscription ins1 = new Inscription(164);
            Inscription ins2 = new Inscription(153);
            Inscription ins3 = new Inscription(201);
            Inscription ins4 = new Inscription(245);
            Inscription ins5 = new Inscription(001);
            Inscription ins6 = new Inscription(010);
            Inscription ins7 = new Inscription(100);
            Inscription ins8 = new Inscription(040);
            Inscription ins9 = new Inscription(123);
            Inscription ins10 = new Inscription(666);
            
            // Liste d'inscriptions
            List<Inscription> listins1 = new ArrayList<Inscription>();
            listins1.add(ins1);
            listins1.add(ins2);
            
            List<Inscription> listins2 = new ArrayList<Inscription>();
            listins2.add(ins3);
            listins2.add(ins4);

            List<Inscription> listins3 = new ArrayList<Inscription>();
            listins3.add(ins5);
            
            List<Inscription> listins4= new ArrayList<Inscription>();
            listins4.add(ins7);
            listins4.add(ins8);           
            
            List<Inscription> listins5= new ArrayList<Inscription>();
            listins5.add(ins9);
            listins5.add(ins2);            
            
            List<Inscription> listins6= new ArrayList<Inscription>();
            listins6.add(ins8);
            listins6.add(ins6);
            
            List<Inscription> listins7= new ArrayList<Inscription>();
            listins7.add(ins3);
            listins7.add(ins4);
            listins7.add(ins9);

            List<Inscription> listins8= new ArrayList<Inscription>();
            listins8.add(ins6);
            listins8.add(ins1);
            listins8.add(ins5);
            
            List<Inscription> listins9= new ArrayList<Inscription>();
            listins9.add(ins2);
            listins9.add(ins7);
            listins9.add(ins8);
            
 
            
            
            
            // Liste des épreuves
            Epreuve ep1 = new Epreuve("Course", 250, "Terrain herbe");
            Epreuve ep2 = new Epreuve("Course", 500, "Terrain boue");            
            Epreuve ep3 = new Epreuve("Course", 1500, "Terrain montagneux");    
            Epreuve ep4 = new Epreuve("Nage", 800, "Eau froide");    
            Epreuve ep5 = new Epreuve("Nage", 1500, "Eau chaude");    
            Epreuve ep6 = new Epreuve("Nage", 6000, "Océan");    
            
            List<Epreuve> liste1 = new ArrayList<Epreuve>();
            liste1.add(ep1);
            liste1.add(ep2);            
            
            List<Epreuve> liste2 = new ArrayList<Epreuve>();
            liste2.add(ep3);
            liste2.add(ep6);            
            
            List<Epreuve> liste3 = new ArrayList<Epreuve>();
            liste3.add(ep4);
            liste3.add(ep5);            
            
            // Liste de licenciés
            Licencier lic1 = new Licencier("Michel", "Un", "1 rue des sportifs", 75000, "Paris", "France", "0345789651", "faxmichel1", 1245876, "MichelClub",listins1);
            Licencier lic2 = new Licencier("Michel", "Deux", "2 rue des sportifs", 75000, "Paris", "France", "4642384753", "faxmichel2", 5446565, "MichelClub",listins2);
            Licencier lic3 = new Licencier("Michel", "Trois", "3 rue des sportifs", 75000, "Paris", "France", "4654353416", "faxmichel3", 2468435, "MichelClub",listins3);
            
            em.persist(lic1);
            em.persist(lic2);
            em.persist(lic3);
            
            Amateur ama1 = new Amateur("Jack", "Un", "1 rue des jackalopes", 59000, "Lille", "France", "14545431", "faxjack1", 1, "MedecinDeJack1",listins4);
            Amateur ama2 = new Amateur("Jack", "Deux", "2 rue des jackalopes", 59000, "Lille", "France", "456846486", "faxjack2", 1, "MedecinDeJack2",listins5);
            Amateur ama3 = new Amateur("Jack", "Trois", "3 rue des jackalopes", 59000, "Lille", "France", "84646868", "faxjack3", 1, "MedecinDeJack3",listins6);
            
            em.persist(ama1);
            em.persist(ama2);
            em.persist(ama3);
            
            // Création de compétitions
            Competitions compet1 = new Competitions("21/01/20211", "La Course des Enfers", "Paris",liste1,listins7);
            Competitions compet2 = new Competitions("23/01/20211", "Terre et Mer", "Paris",liste2,listins8);            
            Competitions compet3 = new Competitions("21/01/20211", "Thermodynamic choc", "Paris", liste3,listins9);

            em.persist(compet1);
            em.persist(compet2);
            em.persist(compet3);
            
            
            txn.commit();
		} catch (Exception e) {
			if(txn !=null) {txn.rollback();}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
		}
	}

}
