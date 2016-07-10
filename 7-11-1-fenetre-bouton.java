import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame
{
	
	//Un JPanel
	JPanel pan = new JPanel();
	//Un bouton
	JButton bouton = new JButton("Bouton 1");
	
	
	public Fenetre()
	{
		//dimensions
		this.setSize(500, 500);
		//fermeture
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//position, centre
		this.setLocationRelativeTo(null);
		//titre
		this.setTitle("Fenêtre");
		//visible
		this.setVisible(true);
		
		//ajout du bouton
		pan.add(bouton);
		//ajout du JPanel dans la fenêtre
		this.setContentPane(pan);
		
		
		//Couleur de fond de JPanel
		pan.setBackground(Color.CYAN);
		
		//On met pan dans la fenêtre
		//this.setContentPane(new Panneau());
	}

}
