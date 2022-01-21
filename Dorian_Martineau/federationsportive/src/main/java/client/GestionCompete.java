package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competition;
import entity.Dossard;
import entity.Epreuve;
import entity.Licencier;

public class GestionCompete {

	public static void main(String[] args) {		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("FederationSportiveManager");
		EntityManager em=emf.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		try {						
			txn.begin();
			//creation Dossard
			Dossard d1=new Dossard();
			Dossard d2=new Dossard();
			Dossard d3=new Dossard();
			Dossard d4=new Dossard();
			Dossard d5=new Dossard();
			Dossard d6=new Dossard();
			
			//creation amateur
			Amateur am1=new Amateur("jean","kevin",true,d1);
			Amateur am2=new Amateur("jean","pierre",true,d2);
			Amateur am3=new Amateur("jean","marcel",true,d3);
			
			//creation Licensier
			Licencier lc1=new Licencier("jean","louis","judos","judosClub",d4);
			Licencier lc2=new Licencier("jean","truc","arc","arcClub",d5);
			Licencier lc3=new Licencier("jean","machin","marathon","marathonClub",d6);
			
			//creation epreuv
			Epreuve ep1=new Epreuve("judos",0,"tatamis");
			Epreuve ep2=new Epreuve("arc",50.0,"dehors");
			Epreuve ep3=new Epreuve("marathon",42195.0,"dehors");			
			
			//creation competition
			List<Dossard> sliste1=new ArrayList<Dossard>();
			sliste1.add(d1);
			sliste1.add(d4);
			sliste1.add(d5);
			List<Epreuve> eliste1=new ArrayList<Epreuve>();
			eliste1.add(ep1);
			eliste1.add(ep2);
			Competition cp1=new Competition("19/01/22","Toulouse","compet Toulouse",sliste1,eliste1);
			List<Dossard> sliste2=new ArrayList<Dossard>();
			sliste2.add(d2);
			sliste2.add(d3);
			sliste2.add(d6);
			List<Epreuve> eliste2=new ArrayList<Epreuve>();
			eliste2.add(ep3);
			Competition cp2=new Competition("20/01/22","Paris","compet Paris",sliste2,eliste2);
			
			//Enrigistrement
			em.persist(ep1);
			em.persist(ep2);
			em.persist(ep3);
			
			em.persist(am1);
			em.persist(am2);
			em.persist(am3);
			em.persist(lc1);
			em.persist(lc2);
			em.persist(lc3);
			
			txn.commit();
		}catch(Exception e) {
			if (txn!=null) {
				txn.rollback();
			}
			System.out.println(e);
		}finally {
			if (em!=null) {
				em.close();
			}
		}
		System.out.println("fini");
	}

}
