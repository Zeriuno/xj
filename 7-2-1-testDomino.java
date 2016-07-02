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
		Domino g = new Domino(42, 42)  ;
		System.out.println(g)          ;
		Domino h = new Domino()        ;
		System.out.println(h)          ;
		Domino i = new Domino(2, 42)   ;
		System.out.println(i)          ;
		
		SuiteDomino jeu = new SuiteDomino();
		jeu.ajout(a)            ;
		jeu.ajout(b)            ;
		jeu.ajout(c)            ;
		jeu.ajout(d)            ;
		jeu.ajout(e)            ;
		jeu.ajout(f)            ;
		jeu.ajout(g)            ;
		jeu.ajout(h)            ;
		jeu.ajout(i)            ;
		System.out.println(jeu) ;
	}
}
