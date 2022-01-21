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
import entity.Inscrire;
import entity.Licencier;
import entity.Sportifs;

public class FederationSportiveClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FederationSportiveManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			
				Epreuves ep1 = new Epreuves ("Athlétisme", 400,"Haies"); 
				Epreuves ep2 = new Epreuves ("Athlétisme", 5000,"Course"); 
				Epreuves ep3 = new Epreuves ("Athlétisme", 1600,"4*400 Relais"); 
				Epreuves ep4 = new Epreuves ("Natation", 800,"Nage libre"); 
				Epreuves ep5 = new Epreuves ("Natation", 200,"Papillon"); 
				Epreuves ep6 = new Epreuves ("Natation", 400,"4 nages individuel"); 
				Epreuves ep7 = new Epreuves ("Triathlon", 51500,"Natation, Vélo, Course à pied"); 
				
				Epreuves ep8 = new Epreuves ("Natation", 3800,"Nage libre"); 
				Epreuves ep9 = new Epreuves ("Athlétisme", 42000,"Course à pied"); 
				Epreuves ep10 = new Epreuves ("Cyclisme", 180000,"Vélo"); 
				em.persist(ep1);
				em.persist(ep2);
				em.persist(ep3);
				em.persist(ep4);
				em.persist(ep5);
				em.persist(ep6);
				em.persist(ep7);
				em.persist(ep8);
				em.persist(ep9);
				em.persist(ep10);
				
				
				Sportifs spo1 = new Sportifs ("SOUCHU", "Maeva", "8 avenue Occitanie", 31320, "PECHABOU","France", "maevasouchu@gmail.com", "0605040102", 1);
				Sportifs spo2 = new Sportifs ("BIGNES", "Florian", "8 avenue Occitanie", 31320, "PECHABOU","France", "florianbignes@gmail.com", "0605040103", 2);
				Sportifs spo3 = new Sportifs ("BOURDAIS", "Marc","8 avenue Occitanie", 31320, "PECHABOU","France", "marcbourdais@gmail.com", "0605040104", 3);
				Sportifs spo4 = new Sportifs ("SOUCHU", "Chloe","route des plaines", 13910, "MAILLANE","France", "chloesouchu@gmail.com", "0605040105", 4);
				em.persist(spo1);
				em.persist(spo2);
				em.persist(spo3);
				em.persist(spo4);
				
				ArrayList<Sportifs> listeSpo = new ArrayList<Sportifs>();
				listeSpo.add(spo1);
				listeSpo.add(spo2);
				listeSpo.add(spo3);
				listeSpo.add(spo4);

				ArrayList<Epreuves> listeEp1 = new ArrayList<Epreuves>();
				listeEp1.add(ep1);
				listeEp1.add(ep2);
				listeEp1.add(ep3);
				listeEp1.add(ep4);
				listeEp1.add(ep5);
				listeEp1.add(ep6);
				listeEp1.add(ep7);
				
				ArrayList<Epreuves> listeEp2 = new ArrayList<Epreuves>();
				listeEp2.add(ep8);
				listeEp2.add(ep9);
				listeEp2.add(ep10);

				Competitions compet1 = new Competitions ("15/06/2022", "JO ETE", "TOKYO", listeEp1); 
				Competitions compet2 = new Competitions ("17/09/2022", "IRON MAN", "FRANCE", listeEp2); 
				em.persist(compet2);
				em.persist(compet1); 

				Amateur am1 = new Amateur ("SOUCHU", "Maeva", "8 avenue Occitanie", 31320, "PECHABOU","France", "maevasouchu@gmail.com", "0605040102", 1, true, "LEPARGNEUR"); 
				Amateur am2 = new Amateur ("BIGNES", "Florian", "8 avenue Occitanie", 31320, "PECHABOU","France", "florianbignes@gmail.com", "0605040103", 2, true, "GARCIA"); 
				em.persist(am1);
				em.persist(am2);
				
				Licencier lic1 = new Licencier ("BOURDAIS", "Marc","8 avenue Occitanie", 31320, "PECHABOU","France", "marcbourdais@gmail.com", "0605040104", 3,123, "PSG"); 
				Licencier lic2 = new Licencier ("SOUCHU", "Chloe","route des plaines", 13910, "MAILLANE","France", "chloesouchu@gmail.com", "0605040105", 4,456, "OM"); 
				em.persist(lic1);
				em.persist(lic2);
				
				Inscrire insc1 = new Inscrire(1, compet1, spo1); 
				Inscrire insc2 = new Inscrire(2, compet2, spo2); 
				Inscrire insc3 = new Inscrire(3, compet1, spo3); 
				Inscrire insc4 = new Inscrire(4, compet2, spo4); 
				em.persist(insc1);
				em.persist(insc2);
				em.persist(insc3);
				em.persist(insc4);
				
			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}

	}

}
