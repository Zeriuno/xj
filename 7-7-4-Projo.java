
public class Projo extends Materiel implements Empruntable
{
	public boolean sorti=false ;

	public Projo(String description) {
		super(description);
	}

	@Override
	public boolean estEmprunte() {
		// TODO Auto-generated method stub
		return false;
	}

}
