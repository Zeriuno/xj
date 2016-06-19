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
				if(tesselle.compatibleInverse(suite.get(0)))
				{
					tesselle.inverseDomino() ;
					suite.add(0, tesselle)   ;
					return true              ;
				}
				else
					return false             ;
			}
		}
	}
	
	public boolean ajoutTesselleFin(Domino tesselle)
	{
		if(suite.get(suite.size()-1).compatible(tesselle))
		{
			suite.add(tesselle) ;
			return true         ;
		}
		else
		{
			tesselle.inverseDomino() ;
			if(suite.get(suite.size() -1).compatible(tesselle))
			{
				suite.add(tesselle)  ;
				return true          ;
			}
			else
			{
				tesselle.inverseDomino() ;
				return false             ;
			}
		}
	}
	
	
//	public void 

}
