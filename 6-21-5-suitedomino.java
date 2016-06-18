import java.util.ArrayList;

public class SuiteDomino {
	
	private ArrayList<Domino> suite=new ArrayList<Domino>();
		
	public boolean ajoutTesselleDebut(Domino tesselle){
		if(suite.isEmpty())
		{
			suite.add(tesselle) ;
			return true         ;
		}
		else
		{
			if(tesselle.compatible(suite.get(0)))
			{
				suite.add(0, tesselle) ;
				return true            ;
			}
			else
			{
				if
			}
		}
	}
	
//	public void 

}
