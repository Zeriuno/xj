import java.util.ArrayList;


public class Bibliotheque {
	
	public String nom ;
	
	private ArrayList<Document> catalogue = new ArrayList<Document>() ;
	private ArrayList<Materiel> equipement = new ArrayList<Materiel>() ;
	private ArrayList<Adherent> lecteurs = new ArrayList<Adherent>() ;

	public Bibliotheque(String nom)
	{
		this.nom = nom ;
	}
	
	public void adhesion(Adherent a)
	{
		lecteurs.add(a);
	}
	
	public void nouvoMat(Materiel m)
	{
		equipement.add(m);
	}
	
	public void nouvoDoc(Document d)
	{
		catalogue.add(d);
	}
	
	public String catToString()
	{
		
	}
}
