
import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 10;
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		System.out.println("Digite os valores para o vetor A:");
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os valores para o vetor B:");
		for (int i = 0; i < n; i++) {
			B[i] = scanner.nextInt();
		}
		
        for (int i = 0; i < n; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.println("O resultado no vetor C é:");
        for (int i = 0; i < n; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
        
        scanner.close();
		
		
	}

}
