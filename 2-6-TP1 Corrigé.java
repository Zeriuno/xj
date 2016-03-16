import java.util.Scanner;


public class Tableaux {
    /*
    public static typeRetour nom( arguments sous la forme Type nom){
        code
    }
    */

    // maxpos
    public static int maxpos(int[] x){
        int j=0;
        int valj =x[0]; // pas à -1
        for(int i=1;i<x.length;i++){
            if (x[i]>valj){
                j=i;
                valj=x[j];
            }
        }
        return j;
    }

    // affiche comme ça : 4 entiers : 3 45 -34 0
    public static void affiche(int[] t){
    /*     System.out.print(t.length);
         System.out.print(" entier");
         if (t.length>1){ System.out.print("s");}
         System.out.print(" :");
         for( int i = 0;i<t.length;i++){
             System.out.print(" "+t[i]);
         }
         System.out.println("");
         */
        String s= "";
        s+= t.length+" entier";
        s+= (t.length>1) ? "s : " : " : "; //ternaire condition ? val1 : val2
        for( int i = 0;i<t.length;i++){
             s+=" "+t[i];
        }
        System.out.println(s);
    }

    public static int [] entree (){
        System.out.println("Entrez la taille du tableau");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        if (l<=0) l=1; // si la taille saisie est <=1, on prend 1
        int [] tab  = new int[l];
        for (int i =0 ; i< tab.length; i++){
            System.out.println("Entrez la valeur de la case "+i);
            tab[i] = sc.nextInt();
        }
        return tab;
    }

    public static void inverse (int[] x){
        int i = maxpos(x);
        int temp=x[0];
        x[0]=x[i];
        x[i]=temp;
    }

    // maxpos(int[] x, int i) qui retourne l'indice supérieur ou égal à i
    // qui correspond à la plus grande valeur
    public static int maxpos(int[] x, int i){
        int j=i;

        for(int cpt=i;cpt<x.length;cpt++){
            if(x[j]<x[cpt])
                j=cpt;
        }
        return j;
    }

    public static void inverse(int[] x, int i){
        int j = maxpos(x,i);
        System.out.println("i:"+i+" maxpos(x,i):"+j);
        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }

    public static void tri(int[] x){
        for (int i=0;i<x.length;i++){
            inverse(x,i);
        }
    }

    /*
    x : 3 4 9 8 23 90 2 5
    inverse(x, 0)
    x : 90 4 9 8 23 3 2 5
    inverse(x, 1)
    x : 90 23 9 8 4 3 2 5
    inverse(x, 2)
    x : 90 23 9 8 4 3 2 5
    ...
    inverse(x,7)
    */



    public static void main(String[] args){
        int [] a = entree();
        affiche(a);
        tri(a);
        affiche(a);
    }

}
