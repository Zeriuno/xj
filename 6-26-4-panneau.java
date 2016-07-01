import java.awt.Graphics;
import javax.swing.JPanel;


public class Panneau extends JPanel
{
	public void paintComponent(Graphics g)
	{
		System.out.println("Commande exécutée");
		g.fillOval(20, 20, 75, 75);
	}
}
