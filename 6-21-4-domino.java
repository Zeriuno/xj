
public class Domino {
	
	int droite, gauche ;
	
	// constructeurs
	
	public Domino() {
		// TODO Auto-generated constructor stub
	}
	
	public Domino(int gauche)
	{
		this.gauche = gauche ;
	}
	
	public Domino(int gauche, boolean tourne)
	{
		this(gauche);
		if(tourne)
		{
			inverseDomino();
		}
	}
	
	
	public Domino(int gauche, int droite)
	{
		this(gauche);
		this.droite = droite ;
	}
	
	public Domino(int gauche, int droite, boolean tourne)
	{
		this(gauche, droite);
		if(tourne)
		{
			inverseDomino();
		}
	}
	
	public void inverseDomino()
	{
		int temp ;
		temp = this.gauche ;
		this.gauche = this.droite ;
		this.droite = temp ;
	}
	
	public boolean compatible(Domino tesselle)
	{
		if(this.droite == tesselle.droite)
		{
			return true;
		}
		else
			return false;
		
		
	}

}
