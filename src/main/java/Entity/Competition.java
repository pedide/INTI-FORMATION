package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Compet")
public class Competition 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcompet;
	
	@Column(name = "datecompet")
	private String datecompet;
	
	@Column(name = "nomcompet")
	private String nomcompet;
	
	@Column(name = "villecompet")
	private String villecompet;
	
	@OneToMany(mappedBy = "compet", cascade = CascadeType.ALL)
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@OneToMany(mappedBy = "compet", cascade = CascadeType.ALL)
	private List<Inscription> inscr = new ArrayList<Inscription>();
	
	public Competition() {}
	
	public Competition(String d, String n, String v, ArrayList<Epreuve> liste)
	{
		datecompet = d;
		nomcompet = n;
		villecompet = v;
		
		epreuves = liste;
		
		for (Epreuve e : epreuves)
		{
			e.setcompet(this);
		}
	}
	
	public void inscription(Inscription i)
	{
		inscr.add(i);
	}
}
