import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame
{
	public Fenetre()
	{
		//dimensions
		this.setSize(500, 100);
		//fermeture
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//position, centre
		this.setLocationRelativeTo(null);
		//titre
		this.setTitle("Fenêtre");
		//visible
		this.setVisible(true);
		
		//Un JPanel
		JPanel pan = new JPanel();
		
		//Couleur de fond de JPanel
		pan.setBackground(Color.CYAN);
		
		//On met pan dans la fenêtre
		this.setContentPane(new Panneau());
	}

}
