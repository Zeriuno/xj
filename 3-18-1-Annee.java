
public class Annee {
	
	int taille = 12 ;
	int numero      ;
	Mois[] an       ;
	
	//constructeurs
	
	public Annee()
	{
		for(int i = 0; i < 12 ; i++)
		{
			an[i] = null;
		}
	}
	
	public Annee(Mois mois)
	{
		this();
		an[0] = mois;
	}
	
	public Annee(Mois mois, int numero)
	{
		this(mois)           ;
		this.numero = numero ;
	}
	//méthodes
	
	//tester si l'année est complète
	
	public boolean checkYear()
	{
		if(an[11] == null)
			return false;
		else
			return true ;
	}
	
	//ajoute mois
	
	public boolean addMonth(Mois mois)
	{
		int i ;
		if(checkYear())
		{
			for(i = 0 ; i < 12 ; i++)
			{
				an[i] = mois ;
				return true  ;
			}
		}
		else
		{
			return false;
		}
	}
	
	//efface mois
	
	public boolean delMonth(int numeroMois)
	{
		if(numeroMois < 13)
		{
			an[numeroMois - 1] = null ;
			return true ;
		}
		else
		{
			return false;
		}
	}
	
	
	public String toString(int mois)
	{
		int i ;
		StringBuilder s = new StringBuilder();
		for(i = 0 ; i < taille ; i++)
		{
			if(an[i] != null)
			{
				s = s.append(an[i].toString());
			}
		}
		return s.toString();
	}

}
