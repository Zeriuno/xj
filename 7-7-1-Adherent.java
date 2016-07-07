//code de M. Laurent Boyer

import java.util.ArrayList;


public class Adherent {
	private String nom;
	private String prenom;
	private ArrayList<Empruntable> emprunts = new ArrayList<Empruntable>();
	
	
	public Adherent(String nom, String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public boolean ajoutEmprunt(Empruntable e)
	{
		if (emprunts.size()>=5){ 
			return false; 
		}
		else{
			emprunts.add(e);
			return true;			
		}
	}
	public boolean retireEmprunt(Empruntable e)
	{
		return emprunts.remove(e); // retourne true si un element a été effectivement retiré
	}
	
	public String listeEmprunts()
	{
		String s= new String();
		for (Empruntable e : emprunts)
		{
			s=s+e+"\n";
		}
		return s;
	}
	
	public String toString()
	{
		return nom+" "+prenom;
	}
	
}
