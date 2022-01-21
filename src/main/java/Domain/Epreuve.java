package Domain;


public class Epreuve 
{
	private int idepreuve;
	private String typeepreuve;
	private String conditionepreuve;
	
	private Competition compet;
	
	
	public Epreuve() {}
	
	public Epreuve (String t, String c)
	{
		typeepreuve = t;
		conditionepreuve = c;
	}
	
	public void setcompet(Competition c)
	{
		compet = c;
	}
}
