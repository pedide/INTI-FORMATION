package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avion;
import entity.Pilote;
import entity.Vol;

public class Agencevoyage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenceVoyageManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			
			Avion avi1 = new Avion("A300", 300, "Nice"); 
			Avion avi2 = new Avion("A310", 300, "Nice");
			Avion avi3 = new Avion("B707", 250, "Paris");
			Avion avi4 = new Avion("A300", 280, "Lyon");
			Avion avi5 = new Avion("A380", 400, "Nice");
			Avion avi6 = new Avion("B747", 460, "Paris");
			Avion avi7 = new Avion("B707", 250, "Paris");
			Avion avi8 = new Avion("A310", 300, "Toulouse");
			Avion avi9 = new Avion("C200", 190, "Lyon");
			Avion avi10 = new Avion("A380", 460, "Paris");
			em.persist(avi1);
			em.persist(avi2);
			em.persist(avi3);
			em.persist(avi4);
			em.persist(avi5);
			em.persist(avi6);
			em.persist(avi7);
			em.persist(avi8);
			em.persist(avi9);
			em.persist(avi10);
			
			Pilote pil1 = new Pilote ("MIRANDA", "Serge", "Paris", 26000.00); 
			Pilote pil2 = new Pilote ("LETHANH", "Nanh", "Toulouse", 21000.00); 
			Pilote pil3 = new Pilote ("TALADOIRE", "Gilles", "Nice", 18000.00); 
			Pilote pil4 = new Pilote ("CHARBONNIER", "Annette", "Paris", 17000.00); 
			Pilote pil5 = new Pilote ("REY", "Christophe", "Toulouse", 19000.00); 
			Pilote pil6 = new Pilote ("CHARBONNIER", "Fabien", "Paris", 18000.00); 
			Pilote pil7 = new Pilote ("PENAULD", "Pierre", "Nice", 17000.00); 
			Pilote pil8 = new Pilote ("FOUILHOUX", "Pierre", "Lyon", 15000.00); 
			Pilote pil9 = new Pilote ("GANNAT", "Christophe", null, 18000.00); 
			Pilote pil10 = new Pilote ("GADAIX", "Sonia", "Paris", 20000.00); 
			em.persist(pil1);
			em.persist(pil2);
			em.persist(pil3);
			em.persist(pil4);
			em.persist(pil5);
			em.persist(pil6);
			em.persist(pil7);
			em.persist(pil8);
			em.persist(pil9);
			em.persist(pil10);
			
			Vol vol1 = new Vol("2021-02-11", null, null, null, null, pil1, avi1); 
			Vol vol2 = new Vol("2021-02-11", null, null, null, null, pil1, avi8); 
			Vol vol3 = new Vol("2021-02-11", null, "Lyon", "14h00", "16h00",pil2, avi1); 
			Vol vol4 = new Vol("2021-02-11", "Toulouse", "Lyon", "18h00", "20h00",pil5, avi3); 
			Vol vol5 = new Vol("2021-02-11", "Paris", "Nice", "06h45", "08h15",pil9, avi1); 
			Vol vol6 = new Vol("2021-02-11", "Lyon", "Nice", "11h00", "12h00", pil10, avi2); 
			Vol vol7 = new Vol("2021-02-11", "Paris", "Lyon", "08h00", "09h00", pil1,avi4); 
			Vol vol8 = new Vol("2021-02-11", "Nice", "Paris", "12h15", "13h45", pil8, avi4); 
			Vol vol9 = new Vol("2021-02-12", "Nantes", "Lyon", "09h00", "15h30",pil1, avi8); 
			Vol vol10 = new Vol("2021-02-12", "Nice", "Paris", "12h15", "13h45", pil8,avi2); 
			em.persist(vol1);
			em.persist(vol2);
			em.persist(vol3);
			em.persist(vol4);
			em.persist(vol5);
			em.persist(vol6);
			em.persist(vol7);
			em.persist(vol8);
			em.persist(vol9);
			em.persist(vol10);
			
			
			txn.commit();
			
		}  catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}

}
