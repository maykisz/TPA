import java.util.*;
public class exercicio13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
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
  }
}
