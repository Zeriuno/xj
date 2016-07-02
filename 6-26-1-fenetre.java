import javax.swing.JFrame;


public class main {
	
	public static void main(String[] args)
	{
		JFrame fenetre = new JFrame();
		
		//fenêtre visible
		fenetre.setVisible(true);
		
		//fenêtre avec titre
		fenetre.setTitle("Fenêtre avec titre");
		
		//fenêtre avec taille
		fenetre.setSize(500, 100);
		
		//fenêtre au centre
		fenetre.setLocationRelativeTo(null);
		
		//stop à la fermeture
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
