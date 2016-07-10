
public abstract class Volume extends Document implements Empruntable
{
	public String chaine2;

	public Volume(String chaine, String chaine2, int ISBN)
	{
		super(chaine, ISBN);
		this.chaine2 = chaine2;
	}
	
	public String toString()
	{
		return super.toString() + " " + chaine2;
	}

}
