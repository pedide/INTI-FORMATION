package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.avions;
import entity.pilotes;
import entity.vols;


public class AgenceVoyageClient {

	public static void main(String[] args) {		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenceVoyageManager");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();

	try {
		txn.begin();
			
		vols vol1 = new vols("2021-02-11");
		vols vol2 = new vols("2021-02-11");
		vols vol3 = new vols("2021-02-11", "Lyon", "14h00", "16h00");
		vols vol4 = new vols("2021-02-11", "Toulouse", "Lyon", "18h00", "20h00");
		vols vol5 = new vols("2021-02-11", "Paris", "Nice", "06h45", "08h15");
		vols vol6 = new vols("2021-02-11", "Lyon", "Nice", "11h00", "12h00");
		vols vol7 = new vols("2021-02-11", "Paris", "Lyon", "08h00", "09h00");
		vols vol8 = new vols("2021-02-11", "Nice", "Paris", "07h00", "08h45");
		vols vol9 = new vols("2021-02-12", "Nantes", "Lyon", "09h00", "15h30");
		vols vol10 = new vols("2021-02-12", "Nice", "Paris", "12h15", "13h45");
		vols vol11 = new vols("2021-02-12", "Paris", "Lyon", "15h00", "16h00");
		vols vol12 = new vols("2021-02-12", "Lyon", "Nantes", "16h30", "20h00");
		vols vol13 = new vols("2021-02-12", "Nice", "Lens", "11h00", "14h00");
		vols vol14 = new vols("2021-02-12", "Lens", "Paris", "15h00", "16h00");
		vols vol15 = new vols("2021-02-12", "Paris", "Toulouse", "17h00", "18h00");
		vols vol16 = new vols("2021-02-12", "Paris", "Toulouse", "18h00", "19h00");
		

		List<vols> volpilote1 = new ArrayList<vols>();
		volpilote1.add(vol1);
		volpilote1.add(vol2);
		volpilote1.add(vol7);
		volpilote1.add(vol9);
		volpilote1.add(vol12);
		pilotes pilote1 = new pilotes("Miranda", "Serge", "Paris", 26000.00, volpilote1);
		
		List<vols> volpilote2 = new ArrayList<vols>();
		volpilote2.add(vol3);		
		pilotes pilote2 = new pilotes("Lethanh", "Nahn", "Toulouse", 21000.00, volpilote2);
		
		List<vols> volpilote3 = new ArrayList<vols>();
		volpilote3.add(vol14);
		pilotes pilote3 = new pilotes("Taladoire", "Gilles", "Nice", 18000.00, volpilote3);
		
		List<vols> volpilote4 = new ArrayList<vols>();
		volpilote4.add(vol13);		
		pilotes pilote4 = new pilotes("Charbonnier", "Annette", "Paris", 17000.00, volpilote4);
		
		List<vols> volpilote5 = new ArrayList<vols>();
		volpilote5.add(vol4);				
		pilotes pilote5 = new pilotes("Rey", "Christophe", "Toulouse", 19000.00, volpilote5);
		
		pilotes pilote6 = new pilotes("Charbonnier", "Fabien", "Paris", 18000.00);	
		
		List<vols> volpilote7 = new ArrayList<vols>();
		volpilote7.add(vol16);
		pilotes pilote7 = new pilotes("Penauld", "Pierre", "Nice", 17000.00, volpilote7);
		
		List<vols> volpilote8 = new ArrayList<vols>();
		volpilote8.add(vol8);
		volpilote8.add(vol10);
		volpilote8.add(vol15);
		pilotes pilote8 = new pilotes("Fouilhoux", "Pierre", "Lyon", 15000.00, volpilote8);
		
		List<vols> volpilote9 = new ArrayList<vols>();
		volpilote9.add(vol5);
		volpilote9.add(vol11);
		pilotes pilote9 = new pilotes("Gannat", "Christophe", 18000.00, volpilote9);
		
		List<vols> volpilote10 = new ArrayList<vols>();
		volpilote10.add(vol6);
		pilotes pilote10 = new pilotes("Gadaix", "Sonia", "Paris", 20000.00, volpilote10);
		
		em.persist(pilote1);
		em.persist(pilote2);
		em.persist(pilote3);
		em.persist(pilote4);
		em.persist(pilote5);
		em.persist(pilote6);
		em.persist(pilote7);
		em.persist(pilote8);
		em.persist(pilote9);
		em.persist(pilote10);
		
		
		List<vols> volavion1 = new ArrayList<vols>();
		volavion1.add(vol1);
		volavion1.add(vol3);
		volavion1.add(vol5);
		avions avion1 = new avions("A300", 300, "Nice", volavion1);
		
		List<vols> volavion2 = new ArrayList<vols>();
		volavion2.add(vol6);
		volavion2.add(vol10);
		volavion2.add(vol11);		
		volavion2.add(vol12);		
		avions avion2 = new avions("A310", 300, "Nice", volavion2);
		
		List<vols> volavion3 = new ArrayList<vols>();
		volavion3.add(vol4);	
		avions avion3 = new avions("B707", 250, "Paris", volavion3);
		
		List<vols> volavion4 = new ArrayList<vols>();
		volavion4.add(vol7);
		volavion4.add(vol8);
		avions avion4 = new avions("A300", 280, "Lyon", volavion4);
		
		List<vols> volavion5 = new ArrayList<vols>();
		volavion5.add(vol13);
		volavion5.add(vol14);
		volavion5.add(vol16);
		avions avion5 = new avions("A380", 400, "Nice", volavion5);

		avions avion6 = new avions("B747", 460, "Paris");
		
		avions avion7 = new avions("B707", 250, "Paris");		
	
		List<vols> volavion8 = new ArrayList<vols>();
		volavion8.add(vol2);
		volavion8.add(vol9);	
		avions avion8 = new avions("A310", 300, "Toulouse", volavion8);
		
		List<vols> volavion9 = new ArrayList<vols>();
		volavion9.add(vol15);		
		avions avion9 = new avions("C200", 190, "Lyon", volavion9);
		
		avions avion10 = new avions("A380", 460, "Paris");
		
		em.persist(avion1);
		em.persist(avion2);
		em.persist(avion3);
		em.persist(avion4);
		em.persist(avion5);
		em.persist(avion6);
		em.persist(avion7);
		em.persist(avion8);
		em.persist(avion9);
		em.persist(avion10);
		
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
