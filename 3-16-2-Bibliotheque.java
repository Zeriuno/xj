public class Bibliotheque
{
	
	int capacite;
	Livre[] rangement;

	//constructeur avec int 
	
	public Bibliotheque(int capacite){
		this.capacite = capacite ;
		this.rangement = new Livre[capacite] ;
	}
	//constructeur vide capacite 100
	
	public Bibliotheque(){
		this(100);
	}
	
	//toString
	
	public String toString(){
		String s = "";
		for(int i = 0 ; i < capacite ; i++)
		{
			if(rangement[i] != null)
			{
				s+=rangement[i];
			}
		}
		return s ;
		}
	
	//ajout(Livre)
	
	public Boolean ajout(Livre ajout){
		int i =0;
		
		/*
		 * version avec for
		 * 
		 * for(i = 0; i < capacite ; i++){
		 *   if rangement[i] = null
		 *   {rangement[i] = ajout;
		 *   return true;
		 *   }
		 *  return false;
		 *   }
		 * */
		while(rangement[i] != null)
		{
			i++;
		}
		if(i < (capacite -1))
		{
			rangement[i] = ajout;
			return true;
		}
		else
			return false;
	}
	
	//est présent
	
	public boolean estPresent(Livre present){
		boolean trouve = false ;
		int i;
		Livre temp = rangement[capacite-1];
		rangement[capacite-1] = present ;
		
		for(i = 0; i < capacite ; i++)
		{
			if(rangement[i] == present)
			{
				trouve = true ;
			}
		}
		if(i == (capacite-1))
		{
			if(temp != present)
			{
				trouve = false;
			}	
		}
		return trouve;
	}
	
	//retire(Livre)
	
	public void retire(Livre livre)
	{
		if(estPresent(livre))
		{
		for(int i = 0 ; i < capacite ; i++)
		{
			if(rangement[i] == livre)
			{
				rangement[i] = null;
			}
		}
		}
		else
			System.out.println("Livre non présent dans la bibliothèque.");
	}
}
