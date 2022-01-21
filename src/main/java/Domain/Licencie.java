package Domain;

public class Licencie extends Sportif
{
	private int idlicencie;
	private int numlicence;
	private String club;
	
	public Licencie() {}
	
	public Licencie(int n, String c, Sportif s)
	{
		super(s);
		numlicence = n;
		club = c;
	}
}
