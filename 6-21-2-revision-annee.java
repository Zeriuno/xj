public class Annee {

  int taille = 12 ;
  int numero      ;
  Mois[] an       ;


  //constructeurs

  public Annee()
  {
    for(int i=0; i<12; i++)
    {
      an[i] = null;
    }
  }

  public Annee(Mois mois)
  {
    this();
    an[0] = mois ;
  }
}
