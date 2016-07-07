
public class Test {

	public static void main(String[] args)
	{
		Ordi a = new Ordi("HP")      ;
		Ordi b = new Ordi("IBM")     ;
		Projo vi = new Projo("HDMI") ;
		Projo deo = new Projo("VGA") ;
		Revue fmr = new Revue("FMR", 1);
		Revue allia = new Revue("allia", 1);
		BD tin = new BD("Tintin", "Hergé", 12);
		Livre hug = new Livre("93", "VHUG", 1700);
		
		System.out.println(a.toString())  ;
		System.out.println(b.toString())  ;
		System.out.println(vi.toString()) ;
		System.out.println(deo.toString());
		System.out.println(fmr.toString());
		System.out.println(allia.toString());
		System.out.println(tin.toString());
		System.out.println(hug.toString());
	}

}
