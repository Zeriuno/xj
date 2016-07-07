
public class Livre extends Volume
{

	public Livre(String titre, String auteur, int ISBN)
	{
		super(titre, auteur, ISBN);
	}

	@Override
	public boolean estEmprunte() {
		// TODO Auto-generated method stub
		return false;
	}

}
