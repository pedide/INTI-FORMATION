package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.adoption;
import entity.animal;
import entity.clients;
import entity.produits;
import entity.voiture;



public class FermeClient {

	public static void main(String[] args) {	EntityManagerFactory emf = Persistence.createEntityManagerFactory("FermeManager");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();

	try {
		txn.begin();
			
		voiture voit1 = new voiture("Dacia", "blanc", "KD453QP", 160);
		voiture voit2 = new voiture("Audi", "noir", "MS457KQ", 220);		
		voiture voit3 = new voiture("Peugeot", "vert", "KD453QP", 160);
		
		em.persist(voit1);
		em.persist(voit2);
		em.persist(voit3);
		
		produits prod1 = new produits("Carotte", 1.3, "légumes");
		produits prod2 = new produits("Pomme", 0.9, "fruits");
		produits prod3 = new produits("Lait", 1.2, "produit laitier");
		
		em.persist(prod1);
		em.persist(prod2);
		em.persist(prod3);
		
		adoption adop1 = new adoption("24/01/22", 150.33, 1);
		adoption adop2 = new adoption("19/01/22", 132.78, 1);
		adoption adop3 = new adoption("06/01/22", 98.10, 1);	
		
		List<adoption> liste1 = new ArrayList<adoption>();
		liste1.add(adop1);
		animal ani1 = new animal("chien", "m", "12/12/19", "Médor", "mordille", liste1);
		clients cli1 = new clients("Roger", "Cavailles", "4 rue des saules", "75000", "Paris", liste1);
		
		List<adoption> liste2 = new ArrayList<adoption>();
		liste2.add(adop2);
		animal ani2 = new animal("chat", "f", "12/11/20", "Minette", "fait pipi sur les draps", liste2);
		clients cli2 = new clients("Ava", "Longoria", "12 rue de Lille", "59000", "Lille", liste2);
		
		List<adoption> liste3 = new ArrayList<adoption>();
		liste3.add(adop3);
		animal ani3 = new animal("chat", "m", "12/09/21", "Matou", "griffe le canapé", liste3);
		clients cli3 = new clients("Alan", "Rickman", "39 rue de poudlard", "75000", "Paris", liste3);
				
		em.persist(ani1);
		em.persist(ani2);
		em.persist(ani3);
		em.persist(cli1);
		em.persist(cli2);
		em.persist(cli3);

		

		
		txn.commit();
		
	} catch (Exception e) {
		System.out.println(e);
		if(txn !=null) {txn.rollback();}
	} finally {
		if(em !=null) {
			em.close();
		}
	}
}

}
