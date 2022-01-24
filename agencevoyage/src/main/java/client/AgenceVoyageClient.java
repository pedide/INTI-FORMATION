package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avion;
import entity.Pilotes;
import entity.Vol;

public class AgenceVoyageClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenceVoyageManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			
			Avion avion1 = new Avion("A300", 300, "NICE");
			Avion avion2 = new Avion("A310", 300, "NICE");
			Avion avion3 = new Avion("A310", 300, "PARIS");
			Avion avion4 = new Avion("A300", 280, "LYON");
			Avion avion5 = new Avion("A380", 400, "NICE");
			Avion avion6 = new Avion("B747", 460, "PARIS");
			Avion avion7 = new Avion("B707", 250, "PARIS");
			Avion avion8 = new Avion("A310", 300, "TOULOUSE");
			Avion avion9 = new Avion("C200", 190, "LYON");
			Avion avion10 = new Avion("A380", 460, "PARIS");

			
			em.persist(avion1);
			em.persist(avion2);
			em.persist(avion3);
			em.persist(avion4);
			em.persist(avion5);
			em.persist(avion6);
			em.persist(avion7);
			em.persist(avion8);
			em.persist(avion9);
			em.persist(avion10);

			Pilotes pilote1 = new Pilotes("MIRANDA","SERGE","PARIS",26000.00);
			Pilotes pilote2 = new Pilotes("LETHANH","NAHN","TOULOUSE",21000.00);
			Pilotes pilote3 = new Pilotes("TALADOIRE","GILLES","NICE",18000.00);
			Pilotes pilote4 = new Pilotes("CHARBONNIER","ANNETTE","PARIS",17000.00);
			Pilotes pilote5 = new Pilotes("REY","CHRISTOPHE","TOULOUSE",19000.00);
			Pilotes pilote6 = new Pilotes("CHARBONNIER","FABIEN","PARIS",18000.00);
			Pilotes pilote7 = new Pilotes("PENAULD","PIERRE","NICE",17000.00);
			Pilotes pilote8 = new Pilotes("FOUILHOUX","PIERRE","LYON",15000.00);
			Pilotes pilote9 = new Pilotes("GANNAT","CHRISTOPHE","",19000.00);
			Pilotes pilote10 = new Pilotes("GADAIX","SONIA","PARIS",20000.00);

			em.persist(pilote1);
			em.persist(pilote2);
			em.persist(pilote3);
			em.persist(pilote4);
			em.persist(pilote5);
			em.persist(pilote6);
			em.persist(pilote7);
			em.persist(pilote8);
			em.persist(pilote9);
			em.persist(pilote10);
			
			
			Vol vol1 = new Vol(pilote1, "2021-02-11","0","0","0","0",avion1);
			Vol vol2 = new Vol(pilote1, "2021-02-11","0","0","0","0",avion8);
			Vol vol3 = new Vol(pilote2, "2021-02-11","0","LYON","14H00","16H00",avion1);
			Vol vol4 = new Vol(pilote5, "2021-02-11", "TOULOUSE","LYON","18H00","20H00",avion3);
			Vol vol5 = new Vol(pilote9, "2021-02-11", "PARIS","NICE","06H45","08H15",avion1);
			Vol vol6 = new Vol(pilote10, "2021-02-11", "LYON","NICE","11H00","12H00",avion2);
			Vol vol7 = new Vol(pilote1, "2021-02-11", "PARIS","LYON","08H00","09H00",avion4);
			Vol vol8 = new Vol(pilote8, "2021-02-11", "NICE","PARIS","07H00","08H45",avion4);
			Vol vol9 = new Vol(pilote1, "2021-02-12", "NANTES","LYON","09H00","15H30",avion8);
			Vol vol10 = new Vol(pilote8, "2021-02-12", "NICE","PARIS","12H15","13H45",avion2);
			Vol vol11 = new Vol(pilote9, "2021-02-12", "PARIS","LYON","15H00","16H00",avion2);
			Vol vol12 = new Vol(pilote1, "2021-02-12", "LYON","NANTES","16H30","20H00",avion2);
			Vol vol13 = new Vol(pilote4, "2021-02-12", "NICE","LENS","11H00","14H00",avion5);
			Vol vol14 = new Vol(pilote3, "2021-02-12", "LENS","PARIS","15H00","16H00",avion5);
			Vol vol15 = new Vol(pilote8, "2021-02-12", "PARIS","TOULOUSE","17H00","18H00",avion9);
			Vol vol16 = new Vol(pilote7, "2021-02-12", "PARIS","TOULOUSE","18H00","19H00",avion5);

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
			if(txn !=null) {txn.rollback();}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
		}
		
	}

}
