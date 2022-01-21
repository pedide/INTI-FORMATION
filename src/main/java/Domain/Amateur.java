package Domain;

public class Amateur extends Sportif
{
	private int idamateur;
	private boolean certif;
	private String medecin;
	
	public Amateur() {}
	
	public Amateur(boolean c, String m, Sportif s)
	{
		super(s);
		certif = c;
		medecin = m;
	}
}
