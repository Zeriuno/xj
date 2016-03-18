
public class TestMoisAnnee {

	public static void main(String[] args) {
		Mois janvier = new Mois();
		Mois fevrier = new Mois(2);
		Mois mars = new Mois(3, 31);
		System.out.println(janvier.getJours());
		janvier.setDays(31);
		System.out.println(janvier.getJours());
		System.out.println(janvier.getNumero());
		janvier.setNumber(1);
		System.out.println(janvier.getNumero());
		Annee a = new Annee();
		Annee b = new Annee(janvier);
		a.addMonth(janvier);
		b.addMonth(fevrier);
		for(int i = 0 ; i < 11 ; i++)
		{
			b.addMonth(mars);
		}
		System.out.println(b.checkYear());
		System.out.println(a.checkYear());

	}

}
