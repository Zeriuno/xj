/*
 * 
 * 
 * Universite ArrayList<Personne> personnel
 * Personne (String prenom, String nom)
 * Etudiant (int numEtudiant)
 * Enseignant (String matiere)
 * 
 * méthodes: ajout, retire, contient, toString
 * 
 * On peut ranger dans le même ArrayList des Personnes,
 * Etudiants, Enseignants
 */

public class Enseignant extends Personne
{
	String matiere ;
	
	public Enseignant(String prenom, String nom, String matiere)
	{
		super(prenom, nom) ;
		this.matiere = matiere ;
	}
}
