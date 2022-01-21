package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Sportif")
@Inheritance(strategy = InheritanceType.JOINED)
public class Sportif 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idsportif;
	
	@Column(name = "nomsportif")
	protected String nomsportif;
	
	@Column(name = "prenomsportif")
	protected String prenomsportif;
	
	@Column(name = "adresse")
	protected String adresse;
	
	@Column(name = "cp")
	protected String cp;
	
	@Column(name = "ville")
	protected String ville;
	
	@Column(name = "pays")
	protected String pays;
	
	@Column(name = "email")
	protected String email;
	
	@Column(name = "tel")
	protected String tel;
	
	@Column(name = "fax")
	protected String fax;
	
	@OneToMany(mappedBy = "sportif", cascade = CascadeType.ALL)
	protected List<Inscription> inscr = new ArrayList<Inscription>();

	public Sportif() {}
	
	public Sportif(String n, String p, String pa)
	{
		nomsportif = n;
		prenomsportif = p;
		pays = pa;
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
