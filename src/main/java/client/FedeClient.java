package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.amateur;
import entity.competitions;
import entity.epreuve;
import entity.inscription;
import entity.licencier;



public class FedeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FedeManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		
		
	try {
		txn.begin();
		
		
		competitions compet1 = new competitions("12/10/2022","volcans","clermont");
		
		epreuve ep1 = new epreuve ("sprint","200","pp",compet1);
		epreuve ep2 = new epreuve ("sprint","400","vc",compet1);
		
		amateur amat1 = new amateur("rudy","mopao","toulouse","5858","charles");
		amateur amat2 = new amateur("rudymmmmmm","movvvvvvvvvvpao","toulousfffffffffffffffe","777775858","charles");
		licencier lic1 = new licencier("george","pompi","marseille",457,"charles");
		
		inscription ins1 = new inscription(amat1,compet1, "478");
		inscription ins2 = new inscription(lic1,compet1, "555");
		inscription ins3 = new inscription(amat2,compet1, "455");
		
		
		
		
		
	
		
		em.persist(ins1);
		em.persist(ins2);
		em.persist(ins3);
		em.persist(ep1);
		em.persist(ep2);
		
		
		/*
		
		Produits prod1 = new Produits("PC","Ordinateur bureau","HP",500.00);
		Produits prod2 = new Produits("PC","Ordinateur bureau","DELL",400.00);
		Produits prod3 = new Produits("MAC","Ordinateur bureau","MAC",900.00);
		Produits prod4 = new Produits("MAC PRO","Ordinateur portable","MAC",1500.00);
		Produits prod5 = new Produits("Tableeette","Tab1","Safffmsung",500.00);
		Produits prod6 = new Produits("Tablette","Tab6","Samsung",7800.00);
		Produits prod7 = new Produits("Tablette","Tab1","Samsung",500.00);
		Produits prod8 = new Produits("Tablette","IPAD","Apple",500.00);
		
	
		
		ProduitFab prodF13 = new ProduitFab(1997777978,prod5.getId());
		
		
		
		
		
		
		
		
		
	
		
		
		
		ProduitFab prodF2 = new ProduitFab(50,prod6);
		ProduitFab prodF3 = new ProduitFab(10,prod7);
		ProduitFab prodF4 = new ProduitFab(150,prod8);
		
	
		em.persist(prodF13);
		
	*/
		
		txn.commit();
		
	} catch (Exception e) {
		if(txn!=null) {txn.rollback();}
		e.printStackTrace();
	}finally {
		if(em!=null) {em.close();}
	}
	} 
		
		
	}


