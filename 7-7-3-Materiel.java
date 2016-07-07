
public abstract class Materiel
{
	
	String description ;
	int id             ;
	static int compteur = 1  ;


	public Materiel(String description)
	{
		this.description = description ;
		id = Materiel.compteur         ;
		Materiel.compteur++            ;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder() ;
		sb.append(description)                 ;
		sb.append(" ")                         ;
		sb.append(id)                          ;
		return sb.toString()                   ;
	}

}
