package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competitions;
import entity.Epreuve;
import entity.Inscription;
import entity.Licencie;
import entity.Sportif;

public class FedesportClient {

	public static void main(String[] args) {
		// Création d'une entité
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FedesportManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
	
			Sportif sp1 = new Sportif("Dupont","Antoine",145);
			Sportif sp2 = new Sportif("Lloris","Hugo",106);
			Sportif sp3 = new Sportif("Ntamack","Romain",136);
			Sportif sp4 = new Sportif("Fourcade","Martin",178);
			Sportif sp5 = new Sportif("Laffont","Perrine",190);
			Sportif sp6 = new Sportif("Papadakis","Gabriella",124);
			Sportif sp7 = new Sportif("Jougla","Anthony",100);
			Sportif sp8 = new Sportif("Legrand","Lisa",128);
			Sportif sp9 = new Sportif("Dupuis","Lucile",123);			
			
			
			Amateur am1 = new Amateur("Jougla","Anthony",100,"ok","Dr Gentil");
			Amateur am2 = new Amateur("Legrand","Lisa",128,"ok","Dr Joyeux");
			Amateur am3 = new Amateur("Dupuis","Lucile",123,"ok","Dr Joyeux");
			em.merge(am1);
			em.merge(am2);
			em.merge(am3);
			
			
			Licencie l1 = new Licencie("Dupont","Antoine",145,14789632,"ST");
			Licencie l2 = new Licencie("Lloris","Hugo",106,32147896,"Tottenham Hotspur");
			Licencie l3 = new Licencie("Porte","Valentin",136,78945623,"Montpellier Handball");
			Licencie l4 = new Licencie("Fourcade","Martin",178,98765432,"Font-Romeu/P2000");
			Licencie l5 = new Licencie("Laffont","Perrine",190,25874193,"Boss Club des Monts d'Olmes");
			Licencie l6 = new Licencie("Papadakis","Gabriella",124,45671938,"Auvergne Danse sur Glace");
			em.merge(l1);
			em.merge(l2);
			em.merge(l3);
			em.merge(l4);
			em.merge(l5);
			em.merge(l6);
			
			
			Inscription ins1 = new Inscription(100);
			Inscription ins2 = new Inscription(106);
			Inscription ins3 = new Inscription(123);
			Inscription ins4 = new Inscription(124);
			Inscription ins5 = new Inscription(128);
			Inscription ins6 = new Inscription(136);
			Inscription ins7 = new Inscription(145);
			Inscription ins8 = new Inscription(178);
			Inscription ins9 = new Inscription(190);
			
			List<Inscription> list1 = new ArrayList<Inscription>();
			list1.add(ins1);
			list1.add(ins2);
			
			List<Inscription> list2 = new ArrayList<Inscription>();
			list2.add(ins2);
			list2.add(ins3);
			list2.add(ins4);
			list2.add(ins5);
			
			List<Inscription> list3 = new ArrayList<Inscription>();
			list3.add(ins6);
			list3.add(ins7);
			
			
			List<Inscription> list4 = new ArrayList<Inscription>();
			list4.add(ins8);
			list4.add(ins9);
			
			
			Epreuve ep1 = new Epreuve("rugby");
			Epreuve ep2 = new Epreuve("ski de bosses");
			Epreuve ep3 = new Epreuve("patinage artistique");
			Epreuve ep4 = new Epreuve("luge");
			Epreuve ep5 = new Epreuve("biathlon");
			Epreuve ep6 = new Epreuve("football");
			Epreuve ep7 = new Epreuve("double mixte");
			Epreuve ep8 = new Epreuve("simple");

			List<Epreuve> liste1 = new ArrayList<Epreuve>();
			liste1.add(ep1);
			Competitions compet1 = new Competitions("25/06/2022","Finale du Top 14","Paris",liste1,list1);
			
			List<Epreuve> liste2 = new ArrayList<Epreuve>();
			liste2.add(ep2);
			liste2.add(ep3);
			liste2.add(ep4);
			liste2.add(ep5);
			Competitions compet2 = new Competitions("12/02/2022","Jeux Olympiques d'hiver","Beijing",liste2,list2);

			List<Epreuve> liste3 = new ArrayList<Epreuve>();
			liste3.add(ep6);
			Competitions compet3 = new Competitions("25/11/2022","Coupe du Monde de Football","Doha",liste3,list3);
			
			List<Epreuve> liste4 = new ArrayList<Epreuve>();
			liste4.add(ep7);
			liste4.add(ep8);
			Competitions compet4 = new Competitions("23/03/2022","Championnat de France de Badminton","Nantes",liste4,list4);
			em.persist(compet1);
			em.persist(compet2);
			em.persist(compet3);
			em.persist(compet4);
			
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

