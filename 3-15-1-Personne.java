/*
Exercice du 3-15
Classe Personne qui contient
*/
public class Personne {
	
	String prenom ;
	String nom    ;
	
	//Constructeur
	public Personne (String v_prenom, String v_nom) {
		prenom = v_prenom ;
		nom = v_nom       ;
	}
	
	
	//retourner "Prenom Nom"
	
	public String toString(){
		return prenom + " " + nom ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
