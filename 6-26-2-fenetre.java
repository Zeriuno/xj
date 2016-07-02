import javax.swing.JFrame;


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
	}

}
