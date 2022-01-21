package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Amateur")
public class Amateur extends Sportif
{
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idamateur;*/
	
	@Column(name = "certificat")
	private boolean certif;
	
	@Column(name = "medecin")
	private String medecin;
	
	public Amateur() {}
	
	public Amateur(boolean c, String m, Sportif s)
	{
		super(s);
		certif = c;
		medecin = m;
	}
}
