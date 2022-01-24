package clients;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Achat;
import entity.Adoption;
import entity.Animaux;
import entity.Clients;
import entity.Produit;
import entity.Voiture;

public class LaFermeJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LaFermeManager");
		EntityManager em=emf.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		try {
			txn.begin();
			
			Produit p1=new Produit("Maison",281500,"Maison neuve");
			Produit p2=new Produit("Appartement",120000,"Appartelent neuve");
			Produit p3=new Produit("Yacht",281500,"Yacht occation");
			Produit p4=new Produit("Nettoyage",0,null);
			
			Clients c1=new Clients("louis","jean",p1);
			Clients c2=new Clients("jean","Dugary",p2);
			Clients c3=new Clients("louuis","Legrand",p3);
			Clients c4=new Clients("louise","jean",p4);
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);
			
			Animaux an1=new Animaux("chien","F","2008-02-20 15:45:00","Canaille",null);
			Animaux an2=new Animaux("chien","F","2009-02-20 8:45:00","Cail",null);
			Animaux an3=new Animaux("chien","F","2007-02-20 8:45:00","Rouquine","mordille parfois");
			Animaux an4=new Animaux("chien","F","2009-02-20 15:45:00","Fila",null);
			Animaux an5=new Animaux("chien","F","2009-02-20 15:45:00","Cali",null);
			Animaux an6=new Animaux("chien","F","2009-02-20 15:45:00","Anya",null);
			Animaux an7=new Animaux("chien","F","2009-02-20 15:45:00","Louya",null);
			Animaux an8=new Animaux("chien","F","2009-02-20 15:45:00","Welva",null);
			Animaux an9=new Animaux("chien","F","2009-02-20 15:45:00","Cali",null);
			Animaux an10=new Animaux("chien","F","2009-02-20 15:45:00","cali",null);
			Animaux an11=new Animaux("chien","F","2007-02-20 15:45:00","Zira",null);
			Animaux an12=new Animaux("chien","F","2009-02-20 15:45:00","Java",null);
			Animaux an13=new Animaux("chien","F","2007-02-20 15:45:00","Balou","mordille parfois");
			Animaux an14=new Animaux("chien","F","2009-02-20 15:45:00","Patou",null);
			Animaux an15=new Animaux("chien","M","2009-02-20 15:45:00","Bouli",null);
			Animaux an16=new Animaux("chien","M","2009-02-20 15:45:00","Zoulou",null);
			Animaux an17=new Animaux("chien","M","2009-02-20 15:45:00","Cartouche",null);
			Animaux an18=new Animaux("chien","M","2009-02-20 15:45:00","Zambo",null);
			Animaux an19=new Animaux("chien","M","2009-02-20 15:45:00","Samba",null);
			Animaux an20=new Animaux("chien","M","2009-02-20 15:45:00","Moka",null);
			Animaux an21=new Animaux("chien","M","2007-02-20 15:45:00","Pilou",null);
			Animaux an22=new Animaux("chien","M","2009-02-20 15:45:00","Zonko",null);
			Animaux an23=new Animaux("chat","M","2007-02-20 15:45:00","Fiero","griffe parfois");
			Animaux an24=new Animaux("chat","M","2007-02-20 15:45:00","Zonko",null);
			Animaux an25=new Animaux("chat","M","2007-02-20 15:45:00","Filou",null);
			Animaux an26=new Animaux("chat","M","2007-02-20 15:45:00","Farceaur",null);
			em.persist(an1);
			em.persist(an2);
			em.persist(an3);
			em.persist(an4);
			em.persist(an5);
			em.persist(an6);
			em.persist(an7);
			em.persist(an8);
			em.persist(an9);
			em.persist(an10);
			em.persist(an11);
			em.persist(an12);
			em.persist(an13);
			em.persist(an14);
			em.persist(an15);
			em.persist(an16);
			em.persist(an17);
			em.persist(an18);
			em.persist(an19);
			em.persist(an20);
			em.persist(an21);
			em.persist(an22);
			em.persist(an23);
			em.persist(an24);
			em.persist(an25);
			em.persist(an26);
			
			Adoption ad1=new Adoption("2021-01-16 15:30:00",350,true,c2,an1);
			Adoption ad2=new Adoption("2021-01-16 15:30:00",350,true,c2,an16);
			Adoption ad3=new Adoption("2021-02-09 15:30:00",950,true,c2,an24);
			Adoption ad4=new Adoption("2012-08-16 15:30:00",250,true,c3,an26);
			Adoption ad5=new Adoption("2012-08-16 15:30:00",150,true,c2,an25);
			Adoption ad6=new Adoption("2012-08-16 15:30:00",50,true,c4,an8);
			em.persist(ad1);
			em.persist(ad2);
			em.persist(ad3);
			em.persist(ad4);
			em.persist(ad5);
			em.persist(ad6);
			
			Voiture v1=new Voiture("AudiR3","rouge","AB-123-CD",190);
			Voiture v2=new Voiture("Range Rover","Bleu","AB-128-CD",230);
			Voiture v3=new Voiture("Jeep Cherokee","noire","MB-198-CD",120);
			Voiture v4=new Voiture("Maseratti","blanche","GB-198-CD",230);
			em.persist(v1);
			em.persist(v2);
			em.persist(v3);
			em.persist(v4);
			
			Achat ac1=new Achat(c1,v1);
			Achat ac2=new Achat(c2,v2);
			Achat ac3=new Achat(c3,v3);
			Achat ac4=new Achat(c4,v4);
			em.persist(ac1);
			em.persist(ac2);
			em.persist(ac3);
			em.persist(ac4);
			
			txn.commit();
		}catch(Exception e) {
			if (txn!=null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if (em!=null) {
				em.close();
			}
		}
		System.out.println("fini");
	}

}
