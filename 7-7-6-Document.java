
public abstract class Document
{
	public String chaine ;
	public int numero    ;
	
	public Document(String chaine, int numero)
	{
		this.chaine = chaine ;
		this.numero = numero ;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder() ;
		sb.append(chaine) ;
		sb.append(" ")    ;
		sb.append(numero) ;
		return sb.toString() ;
	}

}
