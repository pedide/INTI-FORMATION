package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Adoption;
import entity.Animal;
import entity.Clients;
import entity.Produits;
import entity.Voiture;

public class LafermeClient {

	public static void main(String[] args) {
		// Création d'une entité
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaFermeManager");
				EntityManager em = emf.createEntityManager();
				EntityTransaction txn = em.getTransaction();
				
				try {
					txn.begin();
					Produits prod1 = new Produits("Brouette", "99.99", "neuve");
					Animal ani1 = new Animal("serpent","M","01/11/2021","Kaa","sans venin");
					//Clients cli1 = new Clients("Dupuis","Simon");
					Voiture voit1 = new Voiture("Chevrolet Spark", "rouge","AB-159-NB", 60);
					//Adoption adopt1 = new Adoption("20/01/2022",599.99,"CERT12AS");
					
					em.persist(prod1);
					em.persist(ani1);
					//em.persist(cli1);
					em.persist(voit1);
					//em.persist(adopt1);
					
					
					txn.commit();
					
				} catch (Exception e) {
					if(txn != null) {
						txn.rollback();
					}
					e.printStackTrace();
				}finally {
					if(em!=null) {
						em.close();
					}
				}
				
			}

		}
