//code de M. Laurent Boyer

import java.util.Arrays;

public class Promo {
// les attributs
// quelles sont les caractéristiques?
// nombre personne
int nombre=0;

// liste des étudiants
String [] listeEtudiants = new String[1] ;

// nom de la classe
String nom = "";

// constructeurs
// un constructeur vide
public Promo(){
}

// un constructeur avec un argument (le nom)
public Promo(String n){
nom = n;
}

// jusque là c'est vraiment comme une structure.

// les méthodes
// quelles sont les manipulations qu'on veut
// pouvoir effectuer sur nos données ?
// ajouter un élève

public void ajoutEleve(String e)
{
  if (nombre==listeEtudiants.length)
  {
    String[] temp =
    Arrays.copyOf(listeEtudiants, 2*listeEtudiants.length);
    listeEtudiants=temp;
  }
listeEtudiants[nombre]=e;
nombre++;
}

// lister les étudiants

public String liste()
{
StringBuilder s = new StringBuilder();
for (int i=0;i<nombre ; i++)
{
  s.append(listeEtudiants[i]);
  s.append(" ");
}
return nom+" : "+s.toString();
}

// en sortir un au hasard.

}
