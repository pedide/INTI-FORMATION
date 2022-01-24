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
import entity.Voiture;

public class LaFermeClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaFerme"); //unité de persistance
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Clients client1 = new Clients("Martin", "Bernard", "4 rue de l'école", 75000, "Paris");
			Clients client2 = new Clients("Le Du", "Lucas", "8 rue de la bibliothèque", 75000, "Paris");
			Clients client3 = new Clients("Dupond", "Jean", "2 rue de l'église", 75000, "Paris");
			
			em.persist(client1);
			em.persist(client2);
			em.persist(client3);
			
			Produits produit1 = new Produits("Tomate", 0.80, "Une tomate rouge", client1);
			Produits produit2 = new Produits("Patate", 0.30, "Une belle patate", client1);
			Produits produit3 = new Produits("Melon", 3.20, "Un melon tout rond", client2);
			
			em.persist(produit1);
			em.persist(produit2);
			em.persist(produit3);
			
			Animal animal1 = new Animal("Chat", "Male", "2021-11-25", "Minou", "Ronronne fort");
			Animal animal2 = new Animal("Chien", "Male", "2021-11-12", "Toutou", "Aboie fort");
			Animal animal3 = new Animal("Chien", "Femelle", "2021-11-19", "Toutoute", "Court partout");
			
			em.persist(animal1);
			em.persist(animal2);
			em.persist(animal3);
			
			Adoption adoption1 = new Adoption("2022-01-22", 230.00, 1, client2, animal1);
			Adoption adoption2 = new Adoption("2022-01-22", 230.00, 1, client3, animal2);
			Adoption adoption3 = new Adoption("2022-01-22", 230.00, 1, client3, animal3);
			
			em.persist(adoption1);
			em.persist(adoption2);
			em.persist(adoption3);
			
			Voiture voiture1 = new Voiture("Mercedes", "Rouge", "EC-694-KN", 120);
			Voiture voiture2 = new Voiture("Peugeot", "Noire", "AX-899-KF", 90);
			
			em.persist(voiture1);
			em.persist(voiture2);
			
			Achat achat1 = new Achat(15000.00, client1, voiture1);
			Achat achat2 = new Achat(9000.00, client3, voiture2);
			
			em.persist(achat1);
			em.persist(achat2);

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
