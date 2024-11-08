import java.util.*;
public class exercicio5 {
  public static void main(String[] args) {

    int[] A = {10, 15, 21, 8, 30, 12, 18, 25, 7, 14};

    for (int elemento : A) {
        System.out.println("Elemento: " + elemento);
        System.out.print("Divisores: ");

        for (int i = 1; i <= elemento; i++) {
            if (elemento % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
  }
}
}
