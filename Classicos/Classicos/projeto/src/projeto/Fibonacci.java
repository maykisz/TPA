package projeto;
import java.util.Scanner;
public class Fibonacci {
    
	public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int a = 1, b = 1, i = 2, n;
        
        System.out.print("Digite o n�mero de termos da sequ�ncia de Fibonacci: ");
        n = Ler.nextInt();
        
        System.out.print(a + " " + b + " ");
        
        // Enquanto n�o alcan�amos o en�simo termo
        while (i < n) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            
            a = b;
            b = proximo;
            i++;
        }
        Ler.close();
    }
}

