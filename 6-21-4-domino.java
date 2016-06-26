public class Domino {
	
	int droite, gauche ;
	
	// constructeurs
	
	public Domino() {
		this.gauche = 0 ;
		this.droite = 0 ;
	}
	
	public Domino(int gauche)
	{
		if((-1 < gauche) && (gauche < 7))
		{
			this.gauche = gauche ;
			this.droite = 0      ;
		}
		else
			System.out.println("Erreur. Les valeurs d'un domino sont entre 0 et 6 uniquement.");
	}
	
	public Domino(int gauche, boolean tourne) // cela permet de créer un domino en donnant uniquement la valeur de droite: 'new Domino(3, true)'
	{
		this(gauche)        ;
		if(tourne)
		{
			inverseDomino() ;
		}
	}
	
	
	public Domino(int gauche, int droite)
	{
		if((-1 < gauche) && (gauche < 7))
		{
			if((-1 < droite) && (droite < 7))
			{
				this.gauche = gauche ;
				this.droite = droite ;
			}
			else
				System.out.println("Erreur. Les valeurs d'un domino sont entre 0 et 6 uniquement.");			
		}
		else
			System.out.println("Erreur. Les valeurs d'un domino sont entre 0 et 6 uniquement.")    ;
	}
	
	public Domino(int gauche, int droite, boolean tourne) //on passe les arguments dans un ordre, il seront stockés dans l'objet en ordre inverse 
	{
		this(gauche, droite) ;
		if(tourne)
		{
			inverseDomino()  ;
		}
	}
	
	//constructeurs joker
	
	public Domino DominoJoker()
	{
		Domino joker = new Domino() ;
		this.gauche = 42            ;
		this.droite = 42            ;
		return joker                ;
	}
	
	
	//autres méthodes
	
	public void inverseDomino()
	{
		int temp                  ;
		temp = this.gauche        ;
		this.gauche = this.droite ;
		this.droite = temp        ;
	}
	
	public boolean compatible(Domino tesselle)
	{
		if(this.droite == tesselle.gauche)
		{
			return true  ;
		}
		else
			return false ;
	}

	public boolean compatibleInverse(Domino tesselle)
	{
		this.inverseDomino()     ;
		boolean a = this.compatible(tesselle);
		this.inverseDomino(); //on va tester la compatibilité pour avoir une information, mais on ne va pas inverser la tesselle à la fin du test
		return a;
		
	}
		
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[" + this.gauche + "," + this.droite + "]");
		String s = sb.toString();
	return s;	
	}
}
