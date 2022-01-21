package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competitions;
import entity.Epreuves;
import entity.Licencier;
import entity.Sportifs;
import entity.inscription;

public class federationsportiveClient {

	public static void main(String[] args) {
		// creation d'une emf
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FedeSportiveManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			
			inscription ins = new inscription("123456");
			List<inscription> listc1 = new ArrayList<inscription>();
			listc1.add(ins);
			
			Licencier lic1 = new Licencier("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"bleuet");
			Licencier lic2 = new Licencier("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"bleuet");
			Licencier lic3 = new Licencier("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"bleuet");
			Amateur amat1 = new Amateur("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"Bernard");
			Amateur amat2 = new Amateur("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"Bernard");
			Amateur amat3 = new Amateur("ogor","alan","42 point de vue",77127,"Lieusaint","France","alanogor@gmail.com",
					"123456","987654",123456,"Bernard");
			
			Epreuves epr1 = new Epreuves("100m",100,"course a pied");
			Epreuves epr2 = new Epreuves("1000m",1000,"course a pied");
			Epreuves epr3 = new Epreuves("100m haies",100,"course a pied");
			Epreuves epr4 = new Epreuves("ski",1000,"descente");
			Epreuves epr5 = new Epreuves("snowboard",300,"descente");
			Epreuves epr6 = new Epreuves("biathlon",1000,"ski plus tir");
			
			List<Epreuves> liste1 = new ArrayList<Epreuves>();
			liste1.add(epr1);
			liste1.add(epr2);
			liste1.add(epr3);
			List<Epreuves> liste2 = new ArrayList<Epreuves>();
			liste2.add(epr4);
			liste2.add(epr5);
			liste2.add(epr6);
			
			
			Competitions compt1 = new Competitions("21/07/2024","JO d'été","Paris",liste1,listc1);
			Competitions compt2 = new Competitions("21/01/2024","JO d'hiver","Paris",liste2,listc1);
			
			
			
			em.persist(ins);
			
			//em.persist(sport1);
			em.persist(compt1);
			em.persist(compt2);
			
			em.persist(lic1);
			em.persist(lic2);
			em.persist(lic3);
			em.persist(amat1);
			em.persist(amat2);
			em.persist(amat3);
			
			txn.commit();
		}
		catch(Exception e) {
			System.out.println(e);
			if( txn !=null) {
				txn.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}

	}

}
