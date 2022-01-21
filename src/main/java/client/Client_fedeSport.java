package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Amateur;
import entity.Competition;
import entity.Epreuve;
import entity.Licencier;
import entity.Sportif;

public class Client_fedeSport {

	public static void main(String[] args) {
		// Creation du manager d'entité
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fedeSportManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tnx = em.getTransaction();
		
		try {
			//Creation des sportifs
			Sportif sport1 = new Sportif("Ronaldo","Cristiano","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",1);
			Sportif sport2 = new Sportif("Messi","Lionel","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",2);
			Sportif sport3 = new Sportif("Neymar","Junior","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",3);
			Sportif sport4 = new Sportif("James","LeBron","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",4);
			Sportif sport5 = new Sportif("Federer","Roger","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",5);
			Sportif sport6 = new Sportif("Woods","Tiger","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",6);
			Sportif sport7 = new Sportif("Nadal","Rafael","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",7);
			Sportif sport8 = new Sportif("Bolt","Usain","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",8);
			Sportif sport9 = new Sportif("Pogba","Paul","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",9);
			Sportif sport10 = new Sportif("Wiliams","Serena","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",10);
			Sportif sport11 = new Sportif("Manaudou","Laure","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",11);
			Sportif sport12 = new Sportif("Biles","Simone","1 rue de Toulouse",31000,"Toulouse","France","nom@toulouse.fr","123456789","123456789",12);

			Licencier lic1 = new Licencier(sport1, 1, "ASToulouse");
			Licencier lic2 = new Licencier(sport3, 2, "ASParis");
			Licencier lic3 = new Licencier(sport5, 3, "ASToulouse");
			Licencier lic4 = new Licencier(sport7, 4, "ASParis");
			Licencier lic5 = new Licencier(sport9, 5, "ASToulouse");
			Licencier lic6 = new Licencier(sport11, 6, "ASParis");
			
			Amateur ama1 = new Amateur(sport2, 1, "Dr.Murphy");
			Amateur ama2 = new Amateur(sport4, 1, "Dr.House");
			Amateur ama3 = new Amateur(sport6, 1, "Dr.McCoy");
			Amateur ama4 = new Amateur(sport8, 1, "Dr.Sheperd");
			Amateur ama5 = new Amateur(sport10, 1, "Dr.Watson");
			Amateur ama6 = new Amateur(sport12, 1, "Dr.Montgomery");
			
			//Creation des Epreuves
			Epreuve epr1 = new Epreuve ("Natation",4000,null);
			Epreuve epr2 = new Epreuve ("Cyclisme",180000,null);
			Epreuve epr3 = new Epreuve ("Course",42000,null);
			Epreuve epr4 = new Epreuve ("Ski fond",15000,null);
			Epreuve epr5 = new Epreuve ("Tir carabine",0,null);
			Epreuve epr6 = new Epreuve ("Course",100,null);
			
			List<Epreuve> listEpr1 = new ArrayList<Epreuve>();
			List<Epreuve> listEpr2 = new ArrayList<Epreuve>();
			List<Epreuve> listEpr3 = new ArrayList<Epreuve>();
			listEpr1.add(epr1);
			listEpr1.add(epr2);
			listEpr1.add(epr3);
			listEpr2.add(epr4);
			listEpr2.add(epr5);
			listEpr3.add(epr6);
			
			
			//Creation Competition
			Competition compet1 = new Competition("2022-01-21", "Iron Man", "Toulouse", listEpr1);
			Competition compet2 = new Competition("2022-01-20", "Biatlon JO", "Toulouse", listEpr2);
			Competition compet3 = new Competition("2022-01-19", "Sprint", "Toulouse", listEpr3);
			
			//Commit dans base de données
			tnx.begin();
			
			em.persist(lic1);
			em.persist(lic2);
			em.persist(lic3);
			em.persist(lic4);
			em.persist(lic5);
			em.persist(lic6);
			em.persist(ama1);
			em.persist(ama2);
			em.persist(ama3);
			em.persist(ama4);
			em.persist(ama5);
			em.persist(ama6);
			
			em.persist(compet1);
			em.persist(compet2);
			em.persist(compet3);

			tnx.commit();
			
			
		} catch (Exception e) {
			if(tnx != null) {tnx.rollback();}
			e.printStackTrace();
		}finally {
			if(em!=null) {em.close();}
		}

	}

}
