package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avion;
import entity.Pilotes;
import entity.Vols;

public class AvionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AvionManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Pilotes pil1 = new Pilotes("Miranda","Serge","Paris",26000.00);
			Pilotes pil2 = new Pilotes("Lethanh","Nahn","Toulouse",21000.00);
			Pilotes pil3 = new Pilotes("Taladoire","Gilles","Nice",18000.00);
			Pilotes pil4 = new Pilotes("Charbonnier","Annette","Paris",17000.00);
			Pilotes pil5 = new Pilotes("Rey","Christophe","Toulouse",19000.00);
			Pilotes pil6 = new Pilotes("Charbonnier","Fabien","Paris",18000.00);
			Pilotes pil7 = new Pilotes("Penauld","Pierre","Nice",17000.00);
			Pilotes pil8 = new Pilotes("Fouilhoux","Pierre","Lyon",15000.00);
			Pilotes pil9 = new Pilotes("Gannat","Christophe",18000.00);
			Pilotes pil10 = new Pilotes("Gadaix","Sonia","Paris",20000.00);
						
			Avion avi1 = new Avion("A300",300,"Nice");
			Avion avi2 = new Avion("A310",300,"Nice");
			Avion avi3 = new Avion("B707",250,"Paris");
			Avion avi4 = new Avion("A300",280,"Lyon");
			Avion avi5 = new Avion("A380",400,"Nice");
			Avion avi6 = new Avion("B747",460,"Paris");
			Avion avi7 = new Avion("B707",250,"Paris");
			Avion avi8 = new Avion("A310",300,"Toulouse");
			Avion avi9 = new Avion("C200",190,"Lyon");
			Avion avi10 = new Avion("A380",460,"Paris");
			
						
			Vols vol1 = new Vols("11/02/2021","Toulouse","Lyon","18h00","20h00",pil5);			
			Vols vl1 = new Vols("11/02/2021","Toulouse","Lyon","18h00","20h00",avi3);	
			
			Vols vol2 = new Vols("11/02/2021","Paris","Nice","06h45","08h15",pil9);			
			Vols vl2 = new Vols("11/02/2021","Paris","Nice","06h45","08h15",avi1);	
			
			Vols vol3 = new Vols("11/02/2021","Lyon","Nice","11h00","12h00",pil10);			
			Vols vl3 = new Vols("11/02/2021","Lyon","Nice","11h00","12h00",avi2);	
		
			Vols vol4 = new Vols("11/02/2021","Paris","Lyon","08h00","09h00",pil1);			
			Vols vl4 = new Vols("11/02/2021","Paris","Lyon","08h00","09h00",avi4);	
			
			Vols vol5 = new Vols("11/02/2021","Nice","Paris","07h00","08h45",pil8);			
			Vols vl5 = new Vols("11/02/2021","Nice","Paris","07h00","08h45",avi4);	
		
			Vols vol6 = new Vols("12/02/2021","Nantes","Lyon","09h00","15h30",pil1);			
			Vols vl6 = new Vols("12/02/2021","Nantes","Lyon","09h00","15h30",avi8);	
		
			Vols vol7 = new Vols("12/02/2021","Nice","Paris","12h15","13h45",pil8);			
			Vols vl7 = new Vols("12/02/2021","Nice","Paris","12h15","13h45",avi2);	
		
			Vols vol8 = new Vols("12/02/2021","Paris","Lyon","15h00","16h00",pil9);			
			Vols vl8 = new Vols("12/02/2021","Paris","Lyon","15h00","16h00",avi2);	
			
			Vols vol9 = new Vols("12/02/2021","Lyon","Nantes","16h30","20h00",pil1);			
			Vols vl9 = new Vols("12/02/2021","Lyon","Nantes","16h30","20h00",avi2);	
	
			Vols vol10 = new Vols("12/02/2021","Nice","Lens","11h00","14h00",pil4);			
			Vols vl10 = new Vols("12/02/2021","Nice","Lens","11h00","14h00",avi5);	
		
			Vols vol11 = new Vols("12/02/2021","Lens","Paris","15h00","16h00",pil3);			
			Vols vl11 = new Vols("12/02/2021","Lens","Paris","15h00","16h00",avi5);	
	
			Vols vol12 = new Vols("12/02/2021","Paris","Toulouse","17h00","18h00",pil8);			
			Vols vl12 = new Vols("12/02/2021","Paris","Toulouse","17h00","18h00",avi9);	

			Vols vol13 = new Vols("12/02/2021","Paris","Toulouse","18h00","19h00",pil7);			
			Vols vl13 = new Vols("12/02/2021","Paris","Toulouse","18h00","19h00",avi5);	

			em.merge(vol1);
			em.merge(vl1);
			em.merge(vol2);
			em.merge(vl2);
			em.merge(vol3);
			em.merge(vl3);
			em.merge(vol4);
			em.merge(vl4);
			em.merge(vol5);
			em.merge(vl5);
			em.merge(vol6);
			em.merge(vl6);
			em.merge(vol7);
			em.merge(vl7);
			em.merge(vol8);
			em.merge(vl8);
			em.merge(vol9);
			em.merge(vl9);
			em.merge(vol10);
			em.merge(vl10);
			em.merge(vol11);
			em.merge(vl11);
			em.merge(vol12);
			em.merge(vl12);
			em.merge(vol13);
			em.merge(vl13);
			
			
			txn.commit();
			
		}catch(Exception e) {
			if (txn !=null) {
				txn.rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
		}

	}
}