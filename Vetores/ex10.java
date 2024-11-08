
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 10; 
        int[] A = new int[n];
        int[] B = new int[n]; 
        int[] C = new int[n]; 
        int k = 0; 

  
        System.out.println("Digite os valores para o vetor A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

     
        System.out.println("Digite os valores para o vetor B:");
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

     
        for (int i = 0; i < n; i++) {
            boolean existsInB = false;
            for (int j = 0; j < n; j++) {
                if (A[i] == B[j]) {
                    existsInB = true;
                    break;
                }
            }
          
            if (!existsInB) {
                C[k] = A[i];
                k++; 
            }
        }

        System.out.println("A diferença dos conjuntos A e B é:");
        for (int i = 0; i < k; i++) {
            System.out.println(C[i]); 
        }
        
        scanner.close();
    }
}
