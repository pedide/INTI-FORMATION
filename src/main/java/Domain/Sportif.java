package Domain;

import java.util.ArrayList;
import java.util.List;

public class Sportif 
{
	protected int idsportif;
	protected String nomsportif;
	protected String prenomsportif;
	protected String adresse;
	protected String cp;
	protected String ville;
	protected String pays;
	protected String email;
	protected String tel;
	protected String fax;
	
	protected List<Inscription> inscr = new ArrayList<Inscription>();

	public Sportif() {}
	
	public Sportif(String n, String p, String pa)
	{
		nomsportif = n;
		prenomsportif = p;
		pays = p;
	}
	
	public Sportif(Sportif s)
	{
		this(s.nomsportif, s.prenomsportif, s.pays);
	}
	
	public void inscription(Inscription i)
	{
		inscr.add(i);
	}
}
