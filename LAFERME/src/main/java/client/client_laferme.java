package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Achat;
import entity.Adoption;
import entity.Animal;
import entity.Clients;
import entity.Produit;
import entity.Voiture;

public class client_laferme {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lafermeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();
		
		try {
			tnx.begin();

			
			Animal anim1 = new Animal("chien","M","2005-01-24 10:00","ALF","Vieux et Stupide");
			Produit prod1 = new Produit("Balai Brosse",15.25,"Pour les WC");
			Clients cli1 = new Clients("Macron","Manu","1 rue de l'elysee","70000","Paris",prod1);
			Voiture voit1 = new Voiture("Peugeot 206","jaune","20-DEF-54",150);
			Adoption adopt1 = new Adoption("2022-01-24 12:00",0.50,1,cli1,anim1);
			Achat ach1 = new Achat(2000,cli1,voit1);
			
			em.persist(adopt1);
			em.persist(ach1);
			
			
			System.out.println("--------------------------------------------------");
			System.out.println("Tous les Clients qui ont achetés une voiture");
			System.out.println("--------------------------------------------------");
			String voitClient = "SELECT a.cli from Achat a ";
			Query voitClientJPQL = em.createQuery(voitClient);
			List<Clients> listvoitClient = voitClientJPQL.getResultList();
			for(Clients c : listvoitClient) {System.out.println(c.toString());}
			
			
			System.out.println("--------------------------------------------------");
			System.out.println("Toutes les voitures sans couleur");
			System.out.println("--------------------------------------------------");
			String voitSSCouleur = "SELECT v from Voiture v "
								+" WHERE couleur = null";
			Query voitSSCouleurJPQL = em.createQuery(voitSSCouleur);
			List<Voiture> listvoitSSCouleur = voitSSCouleurJPQL.getResultList();
			for(Voiture v : listvoitSSCouleur) {System.out.println(v.toString());}
			
			System.out.println("--------------------------------------------------");
			System.out.println("Toutes les animaux adoptés par un client");
			System.out.println("--------------------------------------------------");
			String animAdopt = "SELECT a.anim from Adoption a";
			Query animAdoptJPQL = em.createQuery(animAdopt);
			List<Animal> listanimAdopt = animAdoptJPQL.getResultList();
			for(Animal a : listanimAdopt) {System.out.println(a.toString());}
			
			tnx.commit();
			
		} catch (Exception e) {
			if(tnx!=null) {
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
