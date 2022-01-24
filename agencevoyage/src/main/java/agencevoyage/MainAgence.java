package agencevoyage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Avions;
import Entity.Pilote;
import Entity.Vols;



public class MainAgence {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenceManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			
			Avions av1 = new Avions("A300",300,"NICE");
			Avions av2 = new Avions("A310",300,"NICE");
			Avions av3 = new Avions("B707",250,"PARIS");
			Avions av4 = new Avions("A300",280,"LYON");
			Avions av5 = new Avions("A380",400,"NICE");
			Avions av6 = new Avions("B747",460,"PARIS");
			Avions av7 = new Avions("B707",250,"PARIS");
			Avions av8 = new Avions("A310",300,"TOULOUSE");
			Avions av9 = new Avions("C200",190,"LYON");
			Avions av10 = new Avions("A380",460,"PARIS");
			
			em.persist(av1);	
	        em.persist(av2);
	        em.persist(av3);	
	        em.persist(av4);
	        em.persist(av5);	
	        em.persist(av6);
	        em.persist(av7);	
	        em.persist(av8);
	        em.persist(av9);	
	        em.persist(av10);
			
	        Pilote pi1 = new Pilote ("MIRANDA","SERGE","PARIS",26000.00);
	        Pilote pi2 = new Pilote ("LETHANH","NAHN","TOULOUSE",21000.00);
	        Pilote pi3 = new Pilote ("TALADOIRE","GILLES","NICE",18000.00);
	        Pilote pi4 = new Pilote ("CHARBONNIER","ANNETTE","PARIS",17000.00);
	        Pilote pi5 = new Pilote ("REY","CHRISTOPHE","TOULOUSE",19000.00);
	        Pilote pi6 = new Pilote ("CHARBONNIER","FABIEN","PARIS",18000.00);
	        Pilote pi7 = new Pilote ("PENAULD","PIERRE","NICE",17000.00);
	        Pilote pi8 = new Pilote ("FOUILHOUX","PIERRE","LYON",15000.00);
	        Pilote pi9 = new Pilote ("GANNAT","CHRISTOPHE","NULL",18000.00);
	        Pilote pi10 = new Pilote ("GADAIX","SONIA","PARIS",20000.00);
	        
	        em.persist(pi1);	
	        em.persist(pi2);
	        em.persist(pi3);	
	        em.persist(pi4);
	        em.persist(pi5);	
	        em.persist(pi6);
	        em.persist(pi7);	
	        em.persist(pi8);
	        em.persist(pi9);	
	        em.persist(pi10);
	        
	        
			 Vols vol1 = new Vols ("2021-02-11", "NULL", "NULL", "NULL", "NULL",av1,pi1);
			 Vols vol2 = new Vols ("2021-02-11", "NULL", "NULL", "NULL", "NULL",av8,pi1);
			 Vols vol3 = new Vols ("2021-02-11", "NULL", "LYON", "14h00", "16h00",av1,pi2);
			 Vols vol4 = new Vols ("2021-02-11", "TOULOUSE", "LYON", "18h00", "20h00",av3,pi5);
			 Vols vol5 = new Vols ("2021-02-11", "PARIS", "NICE", "06h45", "08h15",av1,pi9);
			 Vols vol6 = new Vols ("2021-02-11", "LYON", "NICE", "11H00", "12h00",av2,pi10);
			 Vols vol7 = new Vols ("2021-02-11", "PARIS", "LYON", "08h00", "09h00",av4,pi1);
			 Vols vol8 = new Vols ("2021-02-11", "NICE", "PARIS", "07h00", "08h45",av4,pi8);
			 Vols vol9 = new Vols ("2021-02-12", "NANTES", "LYON", "09h00", "15h30",av8,pi1);
			 Vols vol10 = new Vols ("2021-02-12", "NICE", "PARIS", "12h15", "13h45",av2,pi8);
			 Vols vol11 = new Vols ("2021-02-12", "PARIS", "LYON", "15h00", "16h00",av2,pi9);
			 Vols vol12 = new Vols ("2021-02-12", "LYON", "NANTES", "16h30", "20h00",av2,pi1);
			 Vols vol13 = new Vols ("2021-02-12", "NICE", "LENS", "11h00", "14h00",av5,pi4);
			 Vols vol14 = new Vols ("2021-02-12", "LENS", "PARIS", "15h00", "16h00",av5,pi3);
			 Vols vol15 = new Vols ("2021-02-12", "PARIS", "TOULOUSE", "17h00", "18h00",av9,pi8);
			 Vols vol16 = new Vols ("2021-02-12", "PARIS", "TOULOUSE", "18h00", "19h00",av5,pi7);
			 
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
		        em.persist(vol11);	
		        em.persist(vol12);
		        em.persist(vol13);	
		        em.persist(vol14);
		        em.persist(vol15);	
		        em.persist(vol16);
		        
			txn.commit();
		    
		} catch (Exception e) {
			if (txn !=null) {txn.rollback();}
			 e.printStackTrace();
	} finally {
		if(em !=null) {em.close();}
	}
	}

}
