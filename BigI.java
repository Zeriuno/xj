import java.math.BigInteger;

public class BigI {

	/**
	 * @param args
	 */
	
	/*TP 2 - I facto*/
	public static int factorielle_decrementation(int gris){
		if(gris < 0){
			return -1;
		}
		int gra = 1;
		for(int i=gris ; i > 0 ; i--){
			gra *= i;
		}
		return gra;
	}
	public static int facto(int n){
		int f=1;
		for(int i=1; i<n ; i++){
			f = f*i;
		}
		return f;
	}
	/*TP 2 - II - 1*/
	public static BigInteger bbb(BigInteger a, BigInteger b, BigInteger c){
/*		a = a.add(b) ;  //La méthode est décrite dans la documentation: a.add(truc) ajoute truc à a
		a = a.add(c) ;*/
/*		BigInteger s ;
	    s = a.add(b) ;
	    s = s.add(c) ;*/
		return a.add(b).add(c) ;
	}
	
	/*TP 2 - II - 2*/
	public static boolean plusPetitQue(BigInteger fa, BigInteger fe){
/*		if(fa.compareTo(fe)<0){ //la méthode retourne -1 si le premier est plus petit que le paramètre, 0 en cas d'égalité, 1 si le premier est le majeur
			return true;		}
		else
			return false;*/
/*		BigInteger d = fa.subtract(fe);
		return d.signum()<0 ;*/
		return fa.subtract(fe).signum() < 0;
	}
	
	/*TP 2 - II - 3*/
	public static BigInteger incr(BigInteger gr){
/*		BigInteger is = BigInteger.valueOf(1); //BigInteger est différent de int (1 sera automatiquement un int), et donc on ne peut pas les additionner directement. Il faut donc transformer 1 en BigInteger. Ici on déclare le BigInteger au nom is et il vaut 1, qui est converti en BigInteger par valueOf.
		gr = gr.add(is); //on ajoute un BigInteger à l'autre (1).
		return gr; //la valeur est stockée dans le premier des deux, que l'on retourne ici.
*/
		return gr.add(BigInteger.ONE);
	}
	
	/*TP 2 - II - 4*/
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



	
	public static void main(String[] args) {
/*		System.out.println("De quel nombre faire la factorielle ?");
		Scanner rentre=new Scanner(System.in)             ;
		int z = rentre.nextInt()                     ;
		rentre.close();
		
		System.out.println(z+"!="+factorielle(z));*/
		
		/*
		BigInteger ra = new BigInteger("468354");
		BigInteger pl = new BigInteger("58794");
		BigInteger apla = new BigInteger("59874");
		System.out.println(ra + " " + pl + " " + apla);
		ra = incr(ra);
		System.out.println("BigInteger augmenté de 1 : " + ra);
		ra = bbb(ra, pl, apla);
		System.out.println("Somme des trois BigInteger : " + ra);
		if(plusPetitQue(pl, apla)){
			System.out.println(pl +" < "+apla);
		}
		else System.out.println(pl+" => "+apla);*/
		
		for(int i = 0; i < 400; i++){
			System.out.println(i + "!= " +bigFac(BigInteger.valueOf(i)));
		/*
		 * BigInteger x = BigInteger.ONE  ;
		 * BigInteger y = BigIngeger.ZERO ;
		 * BigInteger z = BigInteger.TEN  ;*/
		}
	}
	
	
}
