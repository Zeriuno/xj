import java.util.ArrayList;

public class Universite{

  ArrayList<Personne> personnel = new ArrayList<Personne>();

  public String toString()
  {
    StringBuilder s = new SstringBuilder();

    for(Personne p : personnel)
    {
      s.append(p.toString().append("\n"));
    }
    return s.toString
  }
}
