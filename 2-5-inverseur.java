//Code de M. Laurent Boyer

import java.util.Scanner;


public class Inverseur {

    // une fonction qui inverse un String

    public static String inverse(String s){
        // Bonjour -> ruojnoB
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t.concat(Character.toString(s.charAt(i)));
        }
        return t;
    }

    public static String inverseB(String s){
        // Bonjour -> ruojnoB
        StringBuilder t= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            t.append(s.charAt(i));
        }
        return t.toString();
    }



    public static void main(String[] args) {
        // demande une chaine de caractère
        System.out.println("Rentrez une phrase");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // appelle la fonction inverse
        String u = inverse(s);
        String v = inverseB(s);
        //affiche le résultat
        System.out.println(u);
        System.out.println(v);
        sc.close();
    }

}
