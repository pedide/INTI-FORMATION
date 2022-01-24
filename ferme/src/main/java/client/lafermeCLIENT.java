package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Achat;
import entity.Adoption;
import entity.Animal;
import entity.Clients;
import entity.Produits;
import entity.Voitures;

public class lafermeCLIENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lafermeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Produits prod1 = new Produits("porshe",500000, "rouge");
			
			em.persist(prod1);
		
			Clients client1 = new Clients("Francis", "ngannou", "les maroniers", 75,prod1);
			
			em.persist(client1);
			Animal animal1 = new Animal("chien", "m", "2009-02-20 08:45:00", "yoko", "griffe");

			em.persist(animal1);
			
			Adoption adoption1 = new Adoption("2021-01-16 15:30:00", 600, 1, client1, animal1);
		
			Voitures voiture1 = new Voitures("rs4", "Rouge", "VC-714-XN", 520);
		
			em.persist(voiture1);
			
			Achat achat1 = new Achat(15000.00, client1, voiture1);
			
			em.persist(achat1);
			
			
			
		txn.commit();
		} catch (Exception e) {
			if(txn != null) {txn.rollback();}
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}

	}

	}


