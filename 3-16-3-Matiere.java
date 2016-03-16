
public class Matiere {
	
	String entitule     ;
	Personne professeur ;
	int montanthoraire  ;
	Bibliotheque bibliographie ;
	public Matiere()
	{	
	}
	
	//constructeurs
	
	public Matiere(String entitule)
	{
		this.entitule = entitule;
	}
	
	public Matiere(String entitule, Personne prof)
	{
		this(entitule);
		this.professeur = prof ;
	}
	
	public Matiere(String entitule, Personne prof, int montanthoraire)
	{
		this (entitule, prof);
		this.montanthoraire = montanthoraire;
	}
	
	public Matiere(String entitule, Personne prof, int montanthoraire, Bibliotheque bibliographie)
	{
		this (entitule, prof, montanthoraire);
		this.bibliographie = bibliographie ;
	}
	
	//
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
