import java.util.*;
public class exercicio12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        boolean ehPalindromo = true;
        int tamanho = vetorA.length;

        for (int i = 0; i < tamanho / 2; i++) {
            if (vetorA[i] != vetorA[tamanho - i - 1]) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("O vetor A é um palíndromo.");
        } else {
            System.out.println("O vetor A não é um palíndromo.");
        }

  }
}
