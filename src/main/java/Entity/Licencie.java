package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Licencie")
public class Licencie extends Sportif
{
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlicencie;*/
	
	@Column(name = "licence")
	private int numlicence;
	
	@Column(name = "club")
	private String club;
	
	public Licencie() {}
	
	public Licencie(int n, String c, Sportif s)
	{
		super(s);
		numlicence = n;
		club = c;
	}
}
