package clients;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avions;
import entity.Pilotes;
import entity.Vols;

public class Gestion {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AerienneManager");
		EntityManager em=emf.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		try {
			txn.begin();
			Avions a1=new Avions("A300",300,"Nice");
			Avions a2=new Avions("A310",300,"Nice");
			Avions a3=new Avions("B707",250,"Paris");
			Avions a4=new Avions("A300",280,"Lyon");
			Avions a5=new Avions("A380",400,"Paris");
			Avions a6=new Avions("B747",460,"Paris");
			Avions a7=new Avions("B707",250,"Nice");
			Avions a8=new Avions("A310",300,"Toulouse");
			Avions a9=new Avions("C200",190,"Lyon");
			Avions a10=new Avions("A380",460,"Paris");
			em.persist(a1);
			em.persist(a2);
			em.persist(a3);
			em.persist(a4);
			em.persist(a5);
			em.persist(a6);
			em.persist(a7);
			em.persist(a8);
			em.persist(a9);
			em.persist(a10);
			
			Pilotes p1=new Pilotes("Miranda","Serge","Paris",26000);
			Pilotes p2=new Pilotes("Lethanh","Nahn","Toulouse",21000);
			Pilotes p3=new Pilotes("Taladoire","Gilles","Nice",18000);
			Pilotes p4=new Pilotes("Charbonnier","Annette","Paris",17000);
			Pilotes p5=new Pilotes("Rey","Christophe","Toulouse",19000);
			Pilotes p6=new Pilotes("Charbonnier","Fabien","Paris",18000);
			Pilotes p7=new Pilotes("Penauld","Pierre","Nice",17000);
			Pilotes p8=new Pilotes("Fouilhoux","Pierre","Lyion",15000);
			Pilotes p9=new Pilotes("Gannat","Christophe","",18000);
			Pilotes p10=new Pilotes("Gadaix","Sonia","Paris",20000);
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.persist(p4);
			em.persist(p5);
			em.persist(p6);
			em.persist(p7);
			em.persist(p8);
			em.persist(p9);
			em.persist(p10);
			
			Vols v1=new Vols("2021-02-11","","","","",a1,p1);
			Vols v2=new Vols("2021-02-11","","","","",a8,p1);
			Vols v3=new Vols("2021-02-11","","Lyon","14h00","16h00",a1,p2);
			Vols v4=new Vols("2021-02-11","Toulouse","Lyon","18h00","20h00",a3,p5);
			Vols v5=new Vols("2021-02-11","Paris","Nice","6h45","8h15",a1,p9);
			Vols v6=new Vols("2021-02-11","Lyon","Nice","11h00","12h00",a2,p10);
			Vols v7=new Vols("2021-02-11","Paris","Lyon","8h00","9h00",a4,p1);
			Vols v8=new Vols("2021-02-11","Nice","Paris","7h00","8h45",a4,p8);
			Vols v9=new Vols("2021-02-11","Nantes","Lyon","9h00","15h30",a8,p1);
			Vols v10=new Vols("2021-02-11","Nice","Paris","12h15","13h45",a2,p8);
			Vols v11=new Vols("2021-02-11","Paris","Lyon","15h00","16h00",a2,p9);
			Vols v12=new Vols("2021-02-11","Lyon","Nantes","16h30","20h00",a2,p1);
			Vols v13=new Vols("2021-02-11","Nice","Lens","11h00","14h00",a5,p4);
			Vols v14=new Vols("2021-02-11","Lens","Paris","15h00","16h00",a5,p3);
			Vols v15=new Vols("2021-02-11","Paris","Toulouse","17h00","18h00",a9,p8);
			Vols v16=new Vols("2021-02-11","Paris","Toulouse","18h00","18h00",a5,p7);
			em.persist(v1);
			em.persist(v2);
			em.persist(v3);
			em.persist(v4);
			em.persist(v5);
			em.persist(v6);
			em.persist(v7);
			em.persist(v8);
			em.persist(v9);
			em.persist(v10);
			em.persist(v11);
			em.persist(v12);
			em.persist(v13);
			em.persist(v14);
			em.persist(v15);
			em.persist(v16);
			
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
