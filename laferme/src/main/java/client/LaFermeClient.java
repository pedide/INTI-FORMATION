package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Achat;
import entity.Adoption;
import entity.Animal;
import entity.Clients;
import entity.Produits;
import entity.Voiture;

public class LaFermeClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaFermeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			
			Clients client1 = new Clients("Dupont","René","2 Rue des riches","99999","Riche-ville");
			em.persist(client1);
			
            List<Clients> listeclients = new ArrayList<Clients>();
            listeclients.add(client1);			
			
			Produits produit1 = new Produits("Yacht",2000000.00,"Assez grand",listeclients);
			em.persist(produit1);
			
			Animal animal1 = new Animal("Vache","Femelle","2000-05-18", "Marguerite", "Très gentille");
			em.persist(animal1);
			
			Voiture voiture1 = new Voiture("Model X", "Grise", "15GH51", 180);
			em.persist(voiture1);
			
			Adoption adoption1 = new Adoption("2022-01-24", 2000.00, 1, animal1, client1);
			em.persist(adoption1);
			
			Achat achat1 = new Achat(30000.00, client1, voiture1);
			em.persist(achat1);
			
			
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
