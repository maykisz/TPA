import java.util.*;
public class exercicio14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite 10 elementos para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;  
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0; 
            } else {
                vetorC[i] = -1;
            }
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
  }
}
