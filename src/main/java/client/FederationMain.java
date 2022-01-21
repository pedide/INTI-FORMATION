package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.*;



public class FederationMain {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationManager");  //Unit� de persistence = AdamingManager --> cr�er fabrique
		EntityManager em = emf.createEntityManager();		// --> cr�er gestionnaire
		EntityTransaction txn = em.getTransaction();			// -->cr�er transaction
		try {
			txn.begin();
			
			Competition compet1 = new Competition("2018/12/11",  "IRONMAN" , "NICE");
			Competition compet2	= new Competition( "2017/03/21" , "MUDDAY" , "ANTIBE");
			Competition compet3 = new Competition( "2017/08/07" , "APOCAPISEZ" , "VENCE");
			
			em.persist(compet1);
			em.persist(compet2);
			em.persist(compet3);
			
			Sportif s1 = new Sportif("Drogba", "Dedier");
			Sportif s2 = new Sportif("Eto'o", "Samuel");
			Sportif s3 = new Sportif("Lin", "Jeremy");
			Sportif s4 = new Sportif("Trezeguet", "David");
			
			em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			em.persist(s4);
			
			Epreuve epr1 = new Epreuve("COURSE A PIED", 10, 1, compet1);
			em.persist(epr1);
			
			Epreuve epr2 = new Epreuve( "COURSE EN VELO", 10, 2, compet1);
			em.persist(epr2);
			
			Epreuve epr3 = new Epreuve( "NATATION", 15, 3, compet1);
			em.persist(epr3);
			
			Epreuve epr4 = new Epreuve( "PLONGER", 1000, 10, compet1);
			em.persist(epr4);
			
			Licencie l1 = new Licencie(1, "Chelsea", s1);
			em.persist(l1);
			
			Licencie l2 = new Licencie(2, "Barcelone", s2);
			em.persist(l2);
			
			Amateur a1 = new Amateur("12ZZA3", "MOMO", s3);
			em.persist(a1);
			
			Amateur a2 = new Amateur("4235EFF4", "LOLO", s4);
			em.persist(a2);
			
			Inscrire i1 = new Inscrire(21323, compet1, s1);
			em.persist(i1);
			
			Inscrire i2 = new Inscrire(213124, compet1, s2);
			em.persist(i2);
			
			Inscrire i3 = new Inscrire(353244, compet1, s3);
			em.persist(i3);
			
			Inscrire i4 = new Inscrire(213124, compet1, s4);
			em.persist(i4);
			
			txn.commit();
			
		}catch(Exception e) {
			if(txn !=null) {txn.rollback();}
			e.printStackTrace();
		} finally {
			if(em !=null) {
				em.close();
			}
		}

	}

}
