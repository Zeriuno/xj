import java.util.Scanner;
public class tp1_1 {

	/*
	 
	 public static typeRetour nom(arguments sous la forme Type nom)
	 
	 */
	
	public static void affiche(int[] ba){
		/*
		System.out.print(ba.length);
		System.out.print(" entier");
		if(ba.length > 1){
     		System.out.print("s")  ;
		}
		for( int )
		//pour toute la boucle
		System.out.println("")     ;
				
		*/
		 String s=""                     ;
		 s+=""                           ;
		 s+=ba.length+ " entier"         ;
		 s+= (ba.length>1) ? "s :" : " :";
		 for (int i =0; i< ba.length; i++){
		     s+= " "+ba[i]               ;
		 }
		 System.out.println(s)           ;
	}
	
	@SuppressWarnings("resource")
	public static int[] entree(){
		System.out.print("Saisir la taille du tableau : ");
		Scanner rentre=new Scanner(System.in)             ;
		int taille = rentre.nextInt()                     ;
		if (taille < 1){
			taille = 1                                    ;
		}
		int[] b = new int[taille]                         ;
		for(int i=0; i< taille ; i++){
			System.out.print("Entrez la valeur de la case "+i+" :");
			int val = rentre.nextInt()                    ;
			b[i] = val                                    ;
		}
		return b                                          ;
	}
	
	public static void inverse(int[] zuppa){
		int i = maxpos(zuppa);
		int var = zuppa[i]   ;
		zuppa[i] = zuppa[0]  ;
		zuppa[0] = var       ;
	}
	
    public static void inverse(int[] c, int i){
	    
		int max = maxpos(c, i) ;
		int var = c[i]         ;
		c[i] = c[max]      ;
		c[max] = var              ;
	}
	
	public static int maxpos(int[] x){
		int max, maxcas;
		
		max = maxcas = -1 ;
		
		for(int i=0; i<x.length; i++) //x.lenght récupère la longueur du tableau
		{
			if(x[i]> max){
				max = x[i] ;
				maxcas = i ;	
			}
		}
		return maxcas;
	}
	
	
	public static int maxpos(int[] bim, int bam){
		int max, maxcas;
		
		max = maxcas = -1 ;
		for(int i=bam; i<bim.length; i++)
		{
			if(bim[i]> max){
			    max = bim[i] ;
			    maxcas = i   ;	
			}
		}
		return maxcas;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int [] a = {}            ;
		System.out.println("Le plus grand entier du tableau " +
		"est en position: "+maxpos(a));
		affiche(a)                    ;
		entree()                      ;
		inverse(a)                    ;
		affiche(a)                    ;
		System.out.print("Saisir l'indice de départ pour l'inversion : ");
		Scanner rentre=new Scanner(System.in)   ;
		int change = rentre.nextInt()           ;
		inverse(a, change)                      ;
		affiche(a)                              ;
	}
}
