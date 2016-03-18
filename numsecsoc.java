//Programme de Jean-Michel Léry, Algorithmique, Applications en C, C++, et Java
//numsecsoc.java
import java.io.*;
class Num_Sec_Soc {
  private String ch ;

  public Num_Sec_Soc() {
    ch=Saisie.lire_String("Entrez votre numéro de Sécurité sociale : ") ; /*Nécessite de la classe lire_String, ou bien doit être remplacé par un Scanner*/
  }
  public void interprete_sexe() {
    int sexe=Integer.parseInt(ch.substring(0,1))         ;
    if (sexe == 1) System.out.println("Bonjour Monsieur");
    else System.out.println("Bonjour Madame")           ;
  }
  public void interprete_annee() {
    int annee=Integer.parseInt(ch.substring(1,3))+1900  ;
    System.out.println("Vous êtes né en : "+annee)      ;
  }
  public void interprete_mois() {
    int mois=Integer.parseInt(ch.substring(3,5));
    String Nom_mois=new String("")              ;
    switch (mois)
    {
      case 1 : Nom_mois="Janvier" ; break ;
      case 2 : Nom_mois="Février" ; break ;
      case 3 : Nom_mois="Mars"    ; break ;
      case 4 : Nom_mois="Avril"   ; break ;
      case 5 : Nom_mois="Mai"     ; break ;
      case 6 : Nom_mois="Juin"    ; break ;
      case 7 : Nom_mois="Juillet" ; break ;
      case 8 : Nom_mois="Août"    ; break ;
      case 9 : Nom_mois="Septembre" ; break ;
      case 10 : Nom_mois="Octobre"  ; break ;
      case 11 : Nom_mois="Novembre" ; break ;
      case 12 : Nom_mois="Décembre" ; break ;
    }

    System.out.prntln("Au mois de : "+Nom_mois);

  public void interprete_departement() {
  int departement=Integer.parseInt(ch.substring(5,7))    ;
  System.out.println("Dans le département : "+department);
  }

  public void interprete_commune() {
  int commune=Integer.parseInt(ch.substring(5,10)) ;
  System.out.println("Dans la commune : "+commune) ;
  }

  public void interprete_ordre() {
  int ordre=Integer.parseInt(ch.substring(10))         ;
  System.out.println("Avec le numéro d'ordre : "+ordre);
  }

}
//programme principal

public class numsecsoc {
  public static void main(String[] args) {
    Num_Sec_Soc Numero = new Num_Sec_Soc()  ;
    Numero.interprete_sexe();
    Numero.interprete_annee();
    Numero.interprete_mois();
    Numero.interprete_departement();
    Numero.interprete_commune();
    Numero.interprete_ordre();
  }
}
