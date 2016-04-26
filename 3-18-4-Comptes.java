public class Compte {
	
	private String nomTitulaire ;
	private int numCompte       ;
	private float soldeCompte   ;
	/*private float decouv        ; on le récupère à chaque fois depuis le solde*/
	private float decouvMax     ;
	private float debitMax      ;
	
	private static int compteur = 1 ;
	//compteur
	
	//costructeurs
	public Compte(String nomTitulaire)
	{
		this.nomTitulaire = nomTitulaire ;
		this.decouvMax = 800             ;
		this.debitMax = 1000             ;
		this.numCompte = Compte.compteur ;
		Compte.compteur++                ;
	}
	
	public Compte(String nomTitulaire, float depotCompte)
	{
		this(nomTitulaire)        ;
		soldeCompte = depotCompte ;		
	}

	public Compte(float decouvMax, String nomTitulaire)
	{
		this(nomTitulaire)         ;
		this.decouvMax = decouvMax ;
	}

	
	public Compte(String nomTitulaire, float depotCompte, float decouvMax)
	{
		this(nomTitulaire, depotCompte) ;
		this.decouvMax = decouvMax      ;
	}
	
	public Compte(float depotCompte, String nomTitulaire, float debitMax)
	{
		this(nomTitulaire, depotCompte) ;
		this.debitMax = debitMax        ;
	}
	
	public Compte(float decouvMax, float debitMax, String nomTitulaire)
	{
		this(decouvMax, nomTitulaire) ;
		this.debitMax = debitMax      ;
	}
	
	public Compte(String nomTitulaire, float depotCompte, float decouvMax, float debitMax)
	{
		this(nomTitulaire, depotCompte, debitMax) ;
		this.debitMax = debitMax                  ;
	}
	
	
	public void majDecouvMax(float decouvMax)
	{
		this.decouvMax = decouvMax ;
	}
	

	public void majDebitMax(float debitMax)
	{
		this.debitMax = debitMax ;
	}
	
	/*
	 * public boolean equals(Object o) sert pour tester l'égalité 
	 * en comparant tous les éléments
	 * 
	 * */
	public boolean equals(Compte cpt)
	{
		if(cpt.getNumCompte() == this.numCompte)
			return true ;
		else
			return false ;
	}
	
	//test de l'opération avant de la faire
	
	private boolean test(float montant)
	{
		/*
		 * Le découvert est un montant positif, pour le 
		 * confronter avec le solde, multiplication par -1
		 */
		if((this.soldeCompte + montant) > (decouvMax * -1))
		    return true  ;
		else
		    return false ;
	}
	
	// calcul du decouvert actuel
	/* Pas nécessaire de l'utiliser pour affecter decouv, on va l'utiliser dans chaque méthode
	private void decouvActuel()
	{
		if(this.soldeCompte > 0)
			this.decouv = 0                            ;
		else
			this.decouv = (Math.abs(this.soldeCompte)) ;
	}*/
	public boolean mouvmt(float montant)
	{
		/*
		 * //si le montant est inférieur 
		 * à la version négative du débit maximal, c'est que :
		 *  - le montant est négatif (c'est un débit)
		 *  - il dépasse le débit maximal
		 */
		
		if(montant < (debitMax * -1))
			return false ;
		else
		{
			if(this.test(montant))
			{
				this.soldeCompte += montant ;
				return true                 ;
			}
			else
				return false                ;
		}
	}
	
	public boolean virmt(float montant, Compte beneficiaire)
	{
		if(this.mouvmt(montant))
		{
			this.mouvmt(-montant);
			beneficiaire.mouvmt(montant);
			return true  ;
		}
		else
			return false ;
	}

	//getters
	
	public int getNumCompte()
	{
		return this.numCompte   ;
	}
	
	public String getTitulaire()
	{
		return this.nomTitulaire;
	}
	
	public float getDecouvMax()
	{
		return this.decouvMax   ;
	}
	
	public float getDebitMax()
	{
		return this.debitMax    ;
	}
	
	public float getSoldeCompte()
	{
		return this.soldeCompte ;
	}
	
	public float getDecouvert()
	{
		if(this.soldeCompte > 0)
		{
			return 0                            ;
		}
		else
			return (Math.abs(this.soldeCompte)) ;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder()   ;
		sb.append("Récapitulatif du compte n.")  ;
		sb.append(numCompte)                     ;
		sb.append("\nTitulaire : ")              ;
		sb.append(nomTitulaire)                  ;
		sb.append("\nDécouvert maximal autorisé : ") ;
		sb.append(decouvMax)                     ;
		sb.append("\nDébit maximal autorisé : ") ;
		sb.append(debitMax)                      ;
		sb.append("\nSolde du compte : ")        ;
		sb.append(soldeCompte)                   ;
		if(this.getDecouvert() > 0)
		{
			sb.append("\nAttention : le compte est à découvert") ;
		}
		return sb.toString();
	}
}