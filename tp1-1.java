/*
 * To change this license header, choose License Headers in Project
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meriyama Bane
 */
public class TpMimo1 {
    public static void main( String[] args)
    {
        //Fonction principale
        int A[] =3D {1,2,3};
        System.out.println("Le maxpos est : "+maxpos(A));
        affiche(A);
    }

     private static int maxpos(int[] Tab)
     {
         int N =3D Tab.length,max=3D-99999999,resultat=3D-1;
        if (N=3D=3D1)
        {
            resultat =3D 0;
        }
        else
        {
            if (N>1)
                    {
                     for (int i =3D 0; i < N; i++)
                        {
                            if (Tab[i] > max)
                            {
                                max =3D Tab[i];
                                resultat =3D i;
                            }
                        }
                    }
        }
        return resultat+1;
    }

     private static void affiche(int[] Tab)
     {
         int N =3D Tab.length;
         String Resultat =3D "";
         if (N>1)
         {
         Resultat =3D "" + N + " entiers :";
         }
         else
         {
          Resultat =3D "" + N + " entier :";
         }

         for (int i =3D 0; i < N; i++)
         {
             Resultat =3D Resultat + " " + Tab[i];
         }
         System.out.println(Resultat);

     }

     private double[] entree(void)
     {
         double[] retour;
     }
}
