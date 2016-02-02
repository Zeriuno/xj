import java.math.BigInteger;

public class BigI {

	/**
	 * @param args
	 */

	/*TP 2 - I facto*/
	public static int factorielle(int gris){
		if(gris < 0){
			return -1;
		}
		int gra = 1;
		for(int i=gris ; i > 0 ; i--){
			gra *= i;
		}
		return gra;
	}

	/*TP 2 - II - 1*/
	public static BigInteger bbb(BigInteger a, BigInteger b, BigInteger c){
		a.add(b) ;  //La méthode est décrite dans la documentation: a.add(truc) ajoute truc à a
		a.add(c) ;
		return a ;
	}

	/*TP 2 - II - 2*/
	public static boolean plusPetitQue(BigInteger fa, BigInteger fe){
		if(fa.compareTo(fe)==1){ //la méthode retourne -1 si le premier est plus petit que le paramètre, 0 en cas d'égalité, 1 si le premier est le majeur
			return true;
		}
		else
			return false;
	}

	/*TP 2 - II - 3*/
	public static BigInteger incr(BigInteger gr){
		BigInteger is = BigInteger.valueOf(1); //BigInteger est différent de int (1 sera automatiquement un int), et donc on ne peut pas les additionner directement. Il faut donc transformer 1 en BigInteger. Ici on déclare le BigInteger au nom is et il vaut 1, qui est converti en BigInteger par valueOf.
		gr.add(is); //on ajoute un BigInteger à l'autre (1).
		return gr; //la valeur est stockée dans le premier des deux, que l'on retourne ici.
	}

	public static void main(String[] args) {
/*		System.out.println("De quel nombre faire la factorielle ?");
		Scanner rentre=new Scanner(System.in)             ;
		int z = rentre.nextInt()                     ;
		rentre.close();

		System.out.println(z+"!="+factorielle(z));*/


		BigInteger ra = new BigInteger("468354");
		BigInteger pl = new BigInteger("58794");
		BigInteger apla = new BigInteger("59874");
		System.out.println(ra + " " + pl + " " + apla);
		incr(ra);
		System.out.println("BigInteger augmenté de 1 : " + ra);
		bbb(ra, pl, apla);
		System.out.println("Somme des trois BigInteger : " + ra);

		System.out.println(" ");

	}

}
