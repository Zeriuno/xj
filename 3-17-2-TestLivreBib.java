
public class TestLivreBib {

	public static void main(String[] args) {
		Livre Q = new Livre("Q", "Luther Blisset", 2002);
		
		System.out.println(Q)             ;
		System.out.println(Q.getTitre())  ;
		System.out.println(Q.getAuteur()) ;
		System.out.println(Q.getAnneeParution());
		System.out.println(Q.getNbrPage());
		Q.setNbrPage(450);
		System.out.println(Q.getNbrPage());
		
		Livre Altai = new Livre("Altai", "Wu Ming", 2009, 398);
		System.out.println(Altai);
		System.out.println(Altai.getTitre());
		System.out.println(Altai.getAuteur());
		System.out.println(Altai.getAnneeParution());
		System.out.println(Altai.getNbrPage());
		Altai.setNbrPage(0);
		System.out.println(Altai.getNbrPage());
		
		Bibliotheque petite = new Bibliotheque(2);
		Bibliotheque grande = new Bibliotheque();
		
		System.out.println("Ajout de Q dans la bibliothèque \"petite\": \n" + petite.ajout(Q))    ;
		System.out.println("Ajout de Altai dans la bibliothèque \"petite\": \n" + petite.ajout(Altai));
		
		
	}

}
