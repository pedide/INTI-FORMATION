package Domain;

import java.util.ArrayList;
import java.util.List;

public class Competition 
{
	private int idcompet;
	private String datecompet;
	private String nomcompet;
	private String villecompet;
	
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
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
