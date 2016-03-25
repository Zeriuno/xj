import java.util.ArrayList;

public class Banque {

  ArrayList<Compte> comptes = new ArrayList<Compte>();


  public String toString()
  {
    StringBuilder s = new StringBuilder();
    for(Compte cpt : comptes)
    {
    	s.append(cpt) ;
        s.append("\n");
    }
    return s.toString() ;
  }

  public void ajouteCompte(Compte untel)
  {
    comptes.add(untel);
  }

  public void retireCompte(Compte unautre)
  {
    comptes.remove(unautre);
  }

  public boolean trouve(Compte ilya)
  {
	  return comptes.contains(ilya);
  }
}
