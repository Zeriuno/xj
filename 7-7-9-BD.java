
public class BD extends Volume {

	public BD(String titre, String dessinateur, int ISBN)
	{
		super(titre, dessinateur, ISBN);
	}

	@Override
	public boolean estEmprunte() {
		// TODO Auto-generated method stub
		return false;
	}

}
