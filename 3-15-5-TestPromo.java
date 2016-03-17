classe TestPromo

// on a utilisé des classes, c'est à dire :
// exemples : BigInteger, String, StringBuilder,
// Scanner, FileReader ...

//(
// types primitifs : int, char, float, double,
// long, boolean
// pas de new / pas de méthodes (notation .)
// )

// charAt -> méthode ! (traitement défini lié à
// une classe et qu'on utilise à partir un objet)
// un objet : des données et des méthdoes
// une classe : le "truc" qui permet de définir
// des objets -> un modèle / "un patron"
// programmer en Orienté objet c'est faire des classes
// c'est à dire définir des gabarits.

// un gabarit :
// des cases pour des données
// des méthodes
// une classe c'est :
// des attributs (les données)
// des méthodes

public class testClass
{
  public static void main(String[] args)
  {

// créer une Promo vide, un objet Promo vide
Promo c = new Promo("LaPromo");
Promo d = new Promo();

// on a une promo c mais qui est vide...
// si je veux ajouter un élève
c.ajoutEleve("Pif");
c.ajoutEleve("Paf");
c.ajoutEleve("Pouf");
d.ajoutEleve("Pouf");

// liste liste les noms de l'objet

System.out.println(d.liste());

// il m'affiche rien.
System.out.println(c.liste());
  }
}
