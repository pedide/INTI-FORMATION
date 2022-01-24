package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avion;
import entity.Pilote;
import entity.Vol;

public class client_compAerienne {

	public static void main(String[] args) {
		//Create Factory entite
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("compAerienneManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();
		
		try {
			
			Avion avi1 = new Avion("A747", 500, "LYON");
			
			Pilote pil1 = new Pilote("GARNIER","VALERIE","LYON","30000");
			
			Vol vol1 = new Vol(avi1,pil1,"2021-01-24","LYON","TOULOUSE","09:00","11:00");
			Vol vol2 = new Vol(avi1,pil1,"2021-01-24","TOULOUSE","PARIS","12:00","15:00");
			Vol vol3 = new Vol(avi1,pil1,"2021-01-24","PARIS","MONTPELLIER","17:00","20:00");
			
			tnx.begin();
			em.persist(vol1);
			em.persist(vol2);
			em.persist(vol3);
			
			tnx.commit();
		} catch (Exception e) {
			if (tnx!=null) {
				tnx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(em!=null) {
				em.close();
			}
		}
	}

}
