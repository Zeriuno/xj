/*
 * String titre
 * String auteur
 * int anneeParution
 * int nbrPage
 */

public class Livre
{
	
	String titre;
	String auteur;
	int anneeParution;
	int nbrPage;
	
	/**
	 * Deux constructeurs, l'un prenant 4 parametres correspondant aux 4 attributs
	 * l'autre 3, le nbrPage reste à 0
	 */
	
	public Livre (String titre, String auteur, int anneeParution, int nbrPage){
		this.titre = titre ;
		this.auteur = auteur ;
		this.anneeParution = anneeParution ;
		this.nbrPage = nbrPage;
	}
	/*
	public Livre(String v_titre, String v_auteur, int v_anneeParution){
		titre = v_titre ;
		auteur = v_auteur ;
		anneeParution = v_anneeParution ;
		nbrPage = 0 ;
	}*/
	
	//version abrégée
	
	public Livre(String titre, String auteur, int anneeParution){
		this(titre, auteur, anneeParution, 0);
	}
	
	//getters pour chaque attribut
	
	public String getTitre(){
		return this.titre ;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
	public int getAnneeParution(){
		return this.anneeParution;
	}
	public int getNbrPage(){
		return this.nbrPage;
	}
	
	//méthode pour définir le nombre de pages uniquement si le nombre est 0.
	
	public void setNbrPage(int nbrPage){
		if(this.nbrPage == 0)
		{
			this.nbrPage = nbrPage;
		}
	}
	
	//méthode String toString() qui retourne "Livre, Auteur, paru en annee. nbrPagep."
	
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result = result.append(this.titre)  ;
		result = result.append(", ")        ;
		result = result.append(this.auteur) ;
		result = result.append(", paru en ");
		result = result.append(this.anneeParution);
		if(this.nbrPage !=0)
		{
			result = result.append(this.nbrPage);
			result = result.append("p");
		}
		result = result.append(".");
	    return result.toString();
	}
}