//Code de M. Laurent Boyer

import java.math.BigInteger;


public class MonFIchierDeTestDsBigItneger {

    public static BigInteger somme(BigInteger a, BigInteger b, BigInteger c){
        return a.add(b).add(c);
    }

    public static boolean plusPetitQue(BigInteger a, BigInteger b){
        return a.subtract(b).signum()==-1;
    }

    public static BigInteger incr(BigInteger b){
        return b.add(BigInteger.ONE);
    }
    public static int facto(int n){
        int f=1;
        for (int i=1;i<n;i++){
            f=f*i;
        }
        return f;
    }

    public static BigInteger factoBig(BigInteger n){
        BigInteger f=new BigInteger("1");
        for (BigInteger i=BigInteger.ONE ; plusPetitQue(i,incr(n)) ; i=incr(i)){
            f=f.multiply(i);
        }
        return f;
    }


    public static void main(String[] args) {

        for (int i=0 ; i< 100 ; i++){
            System.out.println(i+"! = "+factoBig(BigInteger.valueOf(i)));
        }


        //BigInteger x = BigInteger.ONE;

         int y = 1;
        int z = y;
        z=z+1;
        System.out.println(y+" "+z);

        int [] a = {1};
        int [] b = a;
        a[0]=a[0]+1;
        System.out.println(a[0]+" "+b[0]);

        int[] c = {3};
        a=c;
        System.out.println(a[0]+" "+b[0]+" "+c[]);

        String s = "Bonjour";

        String t = "Bonjour";


        String u = "Bon";


        //

        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("1");
        System.out.println(x==y);
// false car == teste l'égalité physique des références
        // il y a un autr mécanisme pour tester l'égalité :
        System.out.println(x.equals(y));
        x.add(y);
        x=y;

        String x = new String("Bonjour");
        String y = "Bonjour";
        String z = "Bonjour";
        System.out.println(x==z);
        // sur les String on utilise toujours .equals

        System.out.println(y.equals(z));
        System.out.println(y.equals(x));

        StringBuilder k = new StringBuilder();
        k.append("as"); // je n'ai aps écrit k = ...
        k.append("zefsdf"); // k est modifié !!
        s.concat("dfqs"); // s (String) n'es aps modifié !
                            // i lfaut faire s= s.concat...
        k.setCharAt(3,'w'); // sur les Strign pas d'équivalent
        System.out.println(k);



        }



}
