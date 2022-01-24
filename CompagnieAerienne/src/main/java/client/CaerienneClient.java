package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Avions;
import entity.Client;
import entity.Individu;
import entity.Passagers;
import entity.Pilotes;
import entity.Vol;



public class CaerienneClient {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAManager");
			EntityManager em = emf.createEntityManager();
			EntityTransaction txn = em.getTransaction();
			
			
			
			
		try {
			txn.begin();
			
			
			
			Passagers pass1 = new Passagers("francis","ngannou","win city","25000","douala");
			//Individu indiv1 = new Individu("francis","ngannou","win city","25000","douala");
			Client client1 = new Client("coco","rico","win city","25000","douala");
			
			Avions av1 = new Avions("Airbus","250","toulouse");
			Pilotes pil1  = new Pilotes("rudy","gobert","toulouse","50000");
			
			Vol vol1 = new Vol("10/05/03","PARIS","lille","10h00","15h00",av1,pil1);


			
			em.persist(vol1);
	
			//em.persist(pass1);
			//em.persist(indiv1);
			//em.persist(client1);
		
			
			
			txn.commit();
			
		} catch (Exception e) {
			if(txn!=null) {txn.rollback();}
			e.printStackTrace();
		}finally {
			if(em!=null) {em.close();}
		}
	}

}
