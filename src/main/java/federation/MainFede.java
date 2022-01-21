package federation;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Amateur;
import Entity.Competition;
import Entity.Epreuve;
import Entity.Inscription;
import Entity.Licencie;
import Entity.Sportif;


public class MainFede {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FEDEManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
		/*	Sportif spo1 = new Sportif ("Dupuis", "Stephane", "1 rue", 75000, "Paris", "France", "0601","0101",1);
			Sportif spo2 = new Sportif ("Dupont", "Paul", "2 rue", 75001, "Paris", "France", "0602","0102",2);
			Sportif spo3 = new Sportif ("Jeannot", "Jeanne", "3 rue", 75002, "Paris", "France", "0603","0103",3);
			Sportif spo4 = new Sportif ("Cesario", "Patricia", "4 rue", 75003, "Paris", "France", "0604","0104",4);
			
			ArrayList<Sportif> listSportif = new ArrayList<Sportif>();
			listSportif.add(spo1);
			listSportif.add(spo2);
			listSportif.add(spo3);
			listSportif.add(spo4);
			
			em.persist(spo1);
			em.persist(spo2);
			em.persist(spo3);
			em.persist(spo4);*/
			
			Amateur ama1 = new Amateur ("Dupuis", "Stephane", "1 rue", 75000, "Paris", "France", "0601","0101",01,true,"Dr.Bill");
			Amateur ama2 = new Amateur ("Dupont", "Paul", "2 rue", 75001, "Paris", "France", "0602","0102",02,true,"Dr.Martin");

			em.persist(ama1);
			em.persist(ama2);
			
			Licencie lic1 = new Licencie ("Jeannot", "Jeanne", "3 rue", 75002, "Paris", "France", "0603","0103",03,1234,"FCParis2");
			Licencie lic2 = new Licencie ("Cesario", "Patricia", "4 rue", 75003, "Paris", "France", "0604","0104",04,5678,"FCParis3");
			
			em.persist(lic1);
			em.persist(lic2);
			
			Epreuve ep1 = new Epreuve ("500m haie",500,"athletisme");
			Epreuve ep2 = new Epreuve ("100m haie",100,"athletisme");
			Epreuve ep3 = new Epreuve ("100m",100,"athletisme");
			Epreuve ep4 = new Epreuve ("100m-nage-libre",100,"natation");
			Epreuve ep5 = new Epreuve ("400m-nage-libre",400,"natation");
			Epreuve ep6 = new Epreuve ("100m-quatre-nages",100,"natation");
			
			ArrayList<Epreuve> liste1 = new ArrayList<Epreuve>();
	           liste1.add(ep1);
	           liste1.add(ep2);
	           liste1.add(ep3);
	           
	        Competition comp1 = new Competition("02/02/2022", "Championnats d'athletisme de Paris","Paris",liste1);
	        
	        ArrayList<Epreuve> liste2 = new ArrayList<Epreuve>();
	           liste2.add(ep4);
	           liste2.add(ep5);
	           liste2.add(ep6);
	           
	        Competition comp2 = new Competition("06/06/2022", "Championnats de natation de Paris","Paris",liste2);
	        
	        em.persist(comp1);	
	        em.persist(comp2);	
	        
	        ArrayList<Competition> listeCompet = new ArrayList<Competition>();
	        listeCompet.add(comp1);
	        listeCompet.add(comp2);
			
	        Inscription ins1 = new Inscription(1,comp1,ama1);
	        Inscription ins2 = new Inscription(2,comp1,ama2);
	        Inscription ins3 = new Inscription(3,comp2,lic1);
	        Inscription ins4 = new Inscription(4,comp2,lic2);
	 
	        em.persist(ins1);	
	        em.persist(ins2);
	        em.persist(ins3);	
	        em.persist(ins4);
	        
			
			txn.commit();
		    
		} catch (Exception e) {
			if (txn !=null) {txn.rollback();}
			 e.printStackTrace();
	} finally {
		if(em !=null) {em.close();}
	}
	}

}
