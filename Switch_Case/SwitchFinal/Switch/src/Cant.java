import java.util.Scanner;

public class Cant {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cod;
		System.out.println("Entre com o codigo de 1 a 5: ");
		cod=ler.nextInt();
		switch(cod) {
		case 1:
			System.out.println("Cachorro quente é R$8,00");
			break;
		case 2:
			System.out.println("Cheeseburguer é R$12,00");
			break;
		case 3:
			System.out.println("X-Salada é R$15,00");
			break;
		case 4:
			System.out.println("Misto quente é R$11,00");
			break;
		case 5:
			System.out.println("Pão na chapa R$6,00");
			break;
			default:
				System.out.println("Código Invalido");
		}
	}

}
