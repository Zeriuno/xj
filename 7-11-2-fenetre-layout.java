import java.awt.BorderLayout;
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
		
		//quel layout
		this.setLayout(new BorderLayout());
		//ajout des boutons
		this.getContentPane().add(bouton, BorderLayout.NORTH);
		this.getContentPane().add(new JButton("Bouton 2"), BorderLayout.EAST);
		
		
		//On met pan dans la fenêtre
		//this.setContentPane(new Panneau());
	}

}
