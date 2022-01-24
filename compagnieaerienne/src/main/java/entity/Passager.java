package entity;

public class Passager {
	private int codePassager;
	private int nbPoints;
	
	
	public Passager() {
		super();
	}
	public Passager(int codePassager, int nbPoints) {
		super();
		this.codePassager = codePassager;
		this.nbPoints = nbPoints;
	}
	public int getCodePassager() {
		return codePassager;
	}
	public void setCodePassager(int codePassager) {
		this.codePassager = codePassager;
	}
	public int getNbPoints() {
		return nbPoints;
	}
	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}
	
	

}
