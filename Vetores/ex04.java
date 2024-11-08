import java.util.*;
public class exercicio4 {
	public static void main(String[] args) {
		int[] A = {5, 7, 3, 9, 6, 2, 8, 1, 4, 10};

		for (int elemento : A) {
				System.out.println("Elemento: " + elemento);
				System.out.print("Pares até o elemento: ");
				
				for (int i = 0; i <= elemento; i++) {
						if (i % 2 == 0) {
								System.out.print(i + " ");
						}
				}
				System.out.println("\n");
	}
}
}
