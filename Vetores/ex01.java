import java.util.*;
public class exercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int i = 0;

    final int TAM=20;
    int a[] = new int [TAM];
    int b[] = new int [TAM];

    for (i=0; i<TAM; i++){
      System.out.print("Digite um valor para A: ");
      a[i] = input.nextInt();
        if (a[i]%2 == 0){
          b[i] = a[i];
        }
        else{
          a[i] = a[i];
        }
    }

    System.out.print("A = [");
    for (i=0; i<TAM; i++){
      System.out.print(a[i]+", ");
    }
    System.out.print("]\n");

    System.out.print("B = [");
    for (i=0; i<TAM; i++){
      System.out.print(b[i]+", ");
    }
    System.out.print("]\n");
  }
}
