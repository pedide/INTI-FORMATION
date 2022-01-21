package Client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import Entity.*;

public class FederationClient
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try 
		{
			txn.begin();
			
			Sportif s1 = new Sportif("Moutal", "Antoine", "France");
			Sportif s2 = new Sportif("Gasquet", "Richard", "France");
			Sportif s3 = new Sportif("Federer", "Roger", "Suisse");
			Sportif s4 = new Sportif("Monfils", "Gael", "France");
			Sportif s5 = new Sportif("Legrand", "Louis", "France");
			Sportif s6 = new Sportif("Murray", "Andy", "Royaume Uni");
			Sportif s7 = new Sportif("Simon", "Gilles", "France");
			
			Licencie l1 = new Licencie(123, "Club Tennis Fr", s2);
			Licencie l2 = new Licencie(235, "Club Tennis Fr", s4);
			Licencie l3 = new Licencie(358, "Club Tennis Fr", s7);
			
			Licencie l4 = new Licencie(111, "Club Tennis CH", s3);
			Licencie l5 = new Licencie(333, "Club Tennis UK", s6);
			
			Amateur a1 = new Amateur(true, "Medecin", s1);
			Amateur a2 = new Amateur(true, "Medecin", s5);
			
			
			Epreuve e1 = new Epreuve("Tennis Simple", "terrain dur");
			Epreuve e2 = new Epreuve("Tennis Simple", "terrain gazon");
			Epreuve e3 = new Epreuve("Tennis Simple", "terrain terre battue");
			Epreuve e4 = new Epreuve("Tennis Double", "terrain terre battue");
			
			ArrayList<Epreuve> le1 = new ArrayList<Epreuve>();
			le1.add(e1);
			
			ArrayList<Epreuve> le2 = new ArrayList<Epreuve>();
			le2.add(e2);
			
			ArrayList<Epreuve> le3 = new ArrayList<Epreuve>();
			le3.add(e3);
			le3.add(e4);
			
			Competition c1 = new Competition("17/01/2022", "Open Australie", "Melbourne", le1);
			Competition c2 = new Competition("27/06/2022", "Wimbledon", "Londres", le2);
			Competition c3 = new Competition("16/05/2022", "Roland Garros", "Paris", le3);
			
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			
			Inscription s1c1 = new Inscription(1, a1, c1);
			Inscription s2c1 = new Inscription(1231, l1, c1);
			Inscription s3c1 = new Inscription(1111, l4, c1);
			Inscription s5c1 = new Inscription(2, a2, c1);
			Inscription s2c2 = new Inscription(1232, l1, c2);
			Inscription s3c2 = new Inscription(1112, l4, c2);
			Inscription s4c2 = new Inscription(2352, l2, c2);
			Inscription s6c2 = new Inscription(3332, l5, c2);
			Inscription s3c3 = new Inscription(1113, l4, c3);
			Inscription s4c3 = new Inscription(2353, l2, c3);
			Inscription s5c3 = new Inscription(2, a2, c3);
			Inscription s7c3 = new Inscription(3583, l3, c3);
			
			em.persist(s1c1);
			em.persist(s2c1);
			em.persist(s3c1);
			em.persist(s5c1);
			em.persist(s2c2);
			em.persist(s3c2);
			em.persist(s4c2);
			em.persist(s6c2);
			em.persist(s3c3);
			em.persist(s4c3);
			em.persist(s5c3);
			em.persist(s7c3);
			
		/*	em.persist(l1);
			em.persist(l2);
			em.persist(l3);
			em.persist(l4);
			em.persist(l5);
			
			em.persist(a1);
			em.persist(a2);*/
			
			
		/*	em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			em.persist(s4);
			em.persist(s5);
			em.persist(s6);
			em.persist(s7);*/
			
			
			txn.commit();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
