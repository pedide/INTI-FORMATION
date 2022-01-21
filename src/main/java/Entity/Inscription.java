package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Inscription")
public class Inscription 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idinscr;
	
	@Column(name = "dossard")
	private int dossard;
	
	@ManyToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "sportif")
	private Sportif sportif;
	
	@ManyToOne
	@JoinColumn(name = "competition")
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
