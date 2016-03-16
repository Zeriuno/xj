import java.math.BigInteger;
import java.util.Scanner;


public class TP3 {


	public static String inverse(String s)
	{
/*fait avec String
 * 		String t ="";
		for(int i = s.length()-1 ; i > 0 ; i--)
		{
			t = t.concat(Character.toString(s.charAt(i)));
		}
*/
		StringBuilder t = new StringBuilder(s.length()); //StringBuilder(chiffre) réserve la taille chiffre pour le StringBuilder
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			t.append(t.charAt(i));
		}
		return t.toString();  //on convertit t en String
	}
	
	public static BigInteger bigFac(BigInteger gris){
	/*	if(plusPetitQue(gris, BigInteger.valueOf(0))){
			return BigInteger.valueOf(-1);
		}
		else{
		BigInteger gra = new BigInteger("1");
		
		for(BigInteger i = new BigInteger("1"); plusPetitQue(i, gris) ; i = incr(i)){
			gra = gra.multiply(i);
		}
		}
		return gra;
	}*/
		if(plusPetitQue(gris, BigInteger.ZERO)){
			BigInteger i = BigInteger.ONE ;
			return i.negate();
		}
		else{
			BigInteger gra = BigInteger.ONE;
			for(BigInteger i = BigInteger.ONE ; plusPetitQue(i, incr(gris)); i=incr(i)){
				gra = gra.multiply(i);
			}
		return gra;
		}
	}

	public static BigInteger incr(BigInteger gr)
	{
		return gr.add(BigInteger.ONE);
	}

	public static boolean plusPetitQue(BigInteger fa, BigInteger fe)
	{
		return fa.subtract(fe).signum() < 0;
	}
	
	public static BigInteger binomial(BigInteger a, BigInteger b)
	{
		
		return bigFac(a);
		// n! / (bi())
	}
	
	public static BigInteger binomial2(BigInteger n, BigInteger k)
	{
		BigInteger unB = BigInteger.ONE ;
		for (BigInteger i = n.subtract(k).add(unB); n.subtract(i).signum()!=-1; i = i.add(unB))
		{
			
		    f
		}
		for(BigInteger i = unB ; k >= 0 ; i = i.add(unB))
		{
			
		}
			
		}
		return ;
	}
	
	public static void main(String[] args) {
		/*
		System.out.println("Saisir une phrase :");
		Scanner scan = new Scanner(System.in)    ;
		String s = scan.nextLine()               ;
		String z = inverse(s)                    ;
		System.out.println(z)                    ;
		scan.close()                             ;*/
		
		
	}

}
