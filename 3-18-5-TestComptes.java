
public class TestCompte {

	public static void main(String[] args)
	{
	Compte c1 = new Compte("J.DUPONT", 1000)  ;
	Compte c2 = new Compte("C.DURAND", 50000) ;
	c2.majDebitMax(6000)   ;
	c2.majDecouvMax(5000)  ;
	
	System.out.println(c1) ;
	System.out.println(c2) ;
	
	c1.mouvmt(-300) ;
	c2.mouvmt(-600) ;
	c1.mouvmt(500)  ;
	
	System.out.println(c1) ;
	System.out.println(c2) ;
	/*
	System.out.println(c1) ;
	System.out.println(c2) ;*/
	
	}
}
