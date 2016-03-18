
public class Mois {

	int numero ;
	int jours  ;
	
	//costructeurs
	public Mois ()
	{
	}
	
	public Mois(int numero)
	{
		this()               ;
		this.numero = numero ;
	}
	public Mois (int numero, int jours)
	{
		this(numero)       ;
		this.jours = jours ;
	}
	
	//ajout de numero
	
	public void setNumber(int numero)
	{
		if(this.numero == 0)
		{
		    this.numero = numero;	
		}
		else
			System.out.println("Erreur, numéro déjà renseigné");
	}
	
	//ajout du nombre de jours
	
	public void setDays(int jours)
	{
		if(this.jours == 0)
		{
			if((0 < jours) && (jours < 32))
			{
				this.jours = jours;
			}
			else 
				System.out.println("Erreur, la valeur \"jours\" fournie fausse.");
		}
		else
			System.out.println("Erreur, la variable \"jours\" du Mois est déjà affectée");
	}
	
	//getters
	
	public int getJours()
	{
		return this.jours;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("Numero d'ordre du mois : ");
		s.append(this.numero);
		s.append("\nNumero de jours : ");
		s.append(jours);
		return s.toString();
	}
}
