
public class TestEtudiant {
	
	public static void main(String[] args)
	{
		Etudiant e = new Etudiant("Jerôme", "Canard", 123);
	    Personne n = new Personne ("Mattia", "Pascal");
		
		System.out.println(e.getNom());
		System.out.println(e);
		
//		Etudiant r = n;
		Personne p = e ;
		//Personne q = "Châine";
		Etudiant r = (Etudiant) p;
		System.out.println(r);
		//System.out.println(p.getNumEtudiant());
		/* * La méthode n'existe pas dans la classe personne
 */
		
	}

}
