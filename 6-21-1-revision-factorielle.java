// Révision Factorielle

public class Factorielle
{
  public static int fact(int n){
    if(n<0) return -1;
    int acc=1;
    for(int i=1;i<n;i++){
    acc*=i;
    }
    return acc;
  }

  public static void main(String[] args){
    for(int i=0;i<30;i++){
    System.out.println(i+"!="+facto(i));
    }
  }
}
