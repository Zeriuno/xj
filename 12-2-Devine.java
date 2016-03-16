import java.util.Scanner;

public class Devine {
	public static void main(String[] args){
		System.out.println("Salut! Essaie de deviner x");
		System.out.println("X vaut... ? ");
		
		int x = 42 ;
		
		
		//Scanner: initialisation
		Scanner devine = new Scanner(System.in) ;
		//scanner lit un entier
		int i = devine.nextInt() ;
		
		while ()
		if (i == x)
			System.out.println("BRAVO!");
		else
			System.out.println("Zut, loupé!");
		
		
	}

}
