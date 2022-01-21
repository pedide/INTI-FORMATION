package Domain;

public class Inscription 
{
	private int idinscr;
	private int dossard;
	
	private Sportif sportif;
	private Competition compet;
	
	public Inscription() {}
	
	public Inscription(int d, Sportif s, Competition c)
	{
		dossard = d;
		sportif = s;
		compet = c;
		
		s.inscription(this);
		c.inscription(this);
	}
}
