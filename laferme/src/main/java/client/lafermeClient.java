package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Adoption;
import entity.Animale;
import entity.Clients;
import entity.Produit;
import entity.Voiture;

public class lafermeClient {

	public static void main(String[] args) {
		// creation d'une emf 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lafermeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Adoption adopt1= new Adoption("2021-01-16 15:30:00.000000",350,"1");
			em.persist(adopt1);
			Animale anim1 = new Animale("chien","F","2007-02-20 08:45:00","Rouquine","Mordile parfois");
			em.persist(anim1);
			Clients cli1 = new Clients("Louis","jean","42 point de vue","77127","lieusaint");
			em.persist(cli1);
			Voiture voit1 = new Voiture("AudiRS3","rouge","AB-123-CD",190);
			em.persist(voit1);
			Produit prod1 = new Produit("Maison",281500,"Maison neuve");
			em.persist(prod1);
			
			txn.commit();
		}
		catch(Exception e) {
			System.out.println(e);
			if( txn !=null) {
				txn.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}

	}

}
