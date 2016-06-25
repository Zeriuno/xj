public class Main {
	
	public static void main(String[] args)
	{
		Domino a = new Domino()        ;
		System.out.println(a)          ;
		Domino b = new Domino(1, true) ;
		System.out.println(b)          ;
		Domino c = new Domino(1,6)     ;
		System.out.println(c)          ;
		Domino d = new Domino(4,6)     ;
		System.out.println(d)          ;
		Domino e = new Domino(3,0)     ;
		System.out.println(e)          ;
		Domino f = new Domino(3,2)     ;
		System.out.println(f)          ;
		
		SuiteDomino jeu = new SuiteDomino();
		jeu.ajout(a)            ;
		System.out.println(jeu) ;
		jeu.ajout(b)            ;
		System.out.println(jeu) ;
		jeu.ajout(c)            ;
		System.out.println(jeu) ;
		jeu.ajout(d)            ;
		System.out.println(jeu) ;
		jeu.ajout(e)            ;
		System.out.println(jeu) ;
		jeu.ajout(f)            ;
		System.out.println(jeu) ;
	}
}
