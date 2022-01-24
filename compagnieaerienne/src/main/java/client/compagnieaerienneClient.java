package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avions;
import entity.Pilotes;
import entity.vol;

public class compagnieaerienneClient {

	public static void main(String[] args) {
		// creation d'une emf 
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("compagnieManager");
				EntityManager em = emf.createEntityManager();
				EntityTransaction txn = em.getTransaction();
				try {
					txn.begin();
					
					vol vol1 =new vol("2021-02-11","0","0","0","0");
					vol vol2 =new vol("2021-02-11","0","0","0","0");
					vol vol3 =new vol("2021-02-11","0","Lyon","14h00","16h00");
					vol vol4 =new vol("2021-02-11","Toulouse","Lyon","18h00","20h00");
					vol vol5 =new vol("2021-02-11","Paris","Nice","06h45","08h15");
					vol vol6 =new vol("2021-02-11","Lyon","Nice","11h00","12h00");
					vol vol7 =new vol("2021-02-11","paris","Lyon","08h00","09h00");
					vol vol8 =new vol("2021-02-11","Nice","Paris","07h00","08h45");
					vol vol9 =new vol("2021-02-11","Nantes","Lyon","09h00","15h30");
					vol vol10 =new vol("2021-02-11","Nice","Paris","12h15","13h45");
					vol vol11 =new vol("2021-02-11","Paris","Lyon","15h00","16h00");
					vol vol12 =new vol("2021-02-11","Lyon","Nantes","16h30","20h00");
					vol vol13 =new vol("2021-02-11","Nice","lens","11h00","14h00");
					vol vol14 =new vol("2021-02-11","Lens","Paris","15h00","16h00");
					vol vol15 =new vol("2021-02-11","Paris","Toulouse","17h00","18h00");
					vol vol16 =new vol("2021-02-11","Paris","Toulouse","18h00","19h00");
					
					List<vol> liste1 = new ArrayList<vol>();
					liste1.add(vol1);
					liste1.add(vol2);
					liste1.add(vol7);
					liste1.add(vol9);
					liste1.add(vol12);
					List<vol> liste2 = new ArrayList<vol>();
					liste1.add(vol3);
					List<vol> liste3 = new ArrayList<vol>();
					liste1.add(vol14);
					List<vol> liste4 = new ArrayList<vol>();
					liste1.add(vol13);
					List<vol> liste5 = new ArrayList<vol>();
					liste5.add(vol4);
					List<vol> liste6 = new ArrayList<vol>();
					List<vol> liste7 = new ArrayList<vol>();
					liste7.add(vol16);
					List<vol> liste8 = new ArrayList<vol>();
					liste8.add(vol8);
					liste1.add(vol10);
					liste1.add(vol15);
					List<vol> liste9 = new ArrayList<vol>();
					liste9.add(vol5);
					liste1.add(vol11);
					List<vol> liste10 = new ArrayList<vol>();
					liste10.add(vol6);
					
					List<vol> liste11 = new ArrayList<vol>();
					liste10.add(vol1);
					liste10.add(vol3);
					liste10.add(vol5);
					List<vol> liste12 = new ArrayList<vol>();
					liste10.add(vol6);
					liste10.add(vol10);
					liste10.add(vol11);
					liste10.add(vol12);
					List<vol> liste13 = new ArrayList<vol>();
					liste10.add(vol4);
					List<vol> liste14 = new ArrayList<vol>();
					liste10.add(vol7);
					liste10.add(vol8);
					List<vol> liste15 = new ArrayList<vol>();
					liste10.add(vol13);
					liste10.add(vol14);
					liste10.add(vol16);
					List<vol> liste16 = new ArrayList<vol>();
					List<vol> liste17 = new ArrayList<vol>();
					List<vol> liste18 = new ArrayList<vol>();
					liste10.add(vol9);
					liste10.add(vol2);
					List<vol> liste19 = new ArrayList<vol>();
					liste10.add(vol15);
					List<vol> liste20 = new ArrayList<vol>();
					
					
					
					Pilotes pil1 = new Pilotes("Miranda","Serge","Paris","26000",liste1);
					Pilotes pil2 = new Pilotes("Lethanh","Nahn","Toulouse","21000",liste2);
					Pilotes pil3 = new Pilotes("Taladoire","Gilles","Nice","18000",liste3);
					Pilotes pil4 = new Pilotes("charbonnier","Annettes","Paris","17000",liste4);
					Pilotes pil5 = new Pilotes("rey","Serge","Toulouse","19000",liste5);
					Pilotes pil6 = new Pilotes("Charbonnier","Fabien","Paris","18000",liste6);
					Pilotes pil7 = new Pilotes("Penauld","Pierre","Paris","17000",liste7);
					Pilotes pil8 = new Pilotes("Fouilhoux","Pierre","Nice","15000",liste8);
					Pilotes pil9 = new Pilotes("Gannat","Christophe","Lyon","18000",liste9);
					Pilotes pil10 = new Pilotes("Gadaix","Sonia","Paris","20000",liste10);
					
					em.persist(pil1);
					em.persist(pil2);
					em.persist(pil3);
					em.persist(pil4);
					em.persist(pil5);
					em.persist(pil6);
					em.persist(pil7);
					em.persist(pil8);
					em.persist(pil9);
					em.persist(pil10);
					
					Avions avi1 = new Avions("A300",300,"Nice",liste11);
					Avions avi2 = new Avions("A310",300,"Nice",liste12);
					Avions avi3 = new Avions("B707",250,"Paris",liste13);
					Avions avi4 = new Avions("A300",280,"Lyon",liste14);
					Avions avi5 = new Avions("A380",400,"Nice",liste15);
					Avions avi6 = new Avions("B747",460,"Paris",liste16);
					Avions avi7 = new Avions("B707",250,"Paris",liste17);
					Avions avi8 = new Avions("A310",300,"Toulouse",liste18);
					Avions avi9 = new Avions("C200",190,"Lyon",liste19);
					Avions avi10 = new Avions("A380",460,"Paris",liste20);
					
					em.persist(avi1);
					em.persist(avi2);
					em.persist(avi3);
					em.persist(avi4);
					em.persist(avi5);
					em.persist(avi6);
					em.persist(avi7);
					em.persist(avi8);
					em.persist(avi9);
					em.persist(avi10);

					
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
