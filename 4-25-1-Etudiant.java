/*
 * 2015-04-25
 * 
 * Hériter les méthodes
 * Redéfinir les méthodes
 * 
 */

public class Etudiant extends Personne{
	
	public int numEtudiant;
	
	public Etudiant(String prenom, String nom, int numEtudiant)
	{
		super(prenom, nom);
		this.numEtudiant = numEtudiant ;
	}
	
	public String toString()
	{
		/*return this.prenom+" "+this.nom+" "+this.numEtudiant;
		 * ne fonctionne pas si les attributs de la superclasse
		 *  sont en 'private'
		 */
		
		return super.toString() + " " + this.numEtudiant ; 
	}
	
	public int getNumEtudiant()
	{
		return this.numEtudiant ;
	}
}
