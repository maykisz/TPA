import java.util.*;
public class exercicio11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.print("Digite o elemento que deseja buscar no vetor A: ");
        int elementoX = input.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == elementoX) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elementoX + " encontrado no vetor A.");
        } else {
            System.out.println("Elemento " + elementoX + " não encontrado no vetor A.");
        }
  }
}
