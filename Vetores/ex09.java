import java.util.*;
import java.util.Scanner;
public class exercicio9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10]; 

        System.out.println("Digite 10 elementos para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite 10 elementos para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }

        int indexC = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    boolean exists = false;
                    for (int k = 0; k < indexC; k++) {
                        if (C[k] == A[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        C[indexC] = A[i];
                        indexC++;
                    }
                    break;
                }
            }
        }

        System.out.println("\nInterseção de A e B (Vetor C):");
        for (int i = 0; i < indexC; i++) {
            System.out.print(C[i] + " ");
        }
  }
}
