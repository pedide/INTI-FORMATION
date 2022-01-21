package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Epreuve")
public class Epreuve 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idepreuve;
	
	@Column(name = "typeepreuve")
	private String typeepreuve;
	
	@Column(name = "conditionepreuve")
	private String conditionepreuve;
	
	@ManyToOne
	@JoinColumn(name = "competition")
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
