import java.util.Scanner;
public class Nota1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade total de alunos: ");
	        int totalAlunos = scanner.nextInt();
	        if (totalAlunos <= 0) {
	            System.out.println("Quantidade total de alunos deve ser maior que zero.");
	        }
	        System.out.print("Digite a quantidade de alunos com men��o MB: ");
	        int MB = scanner.nextInt();
	        System.out.print("Digite a quantidade de alunos com men��o B: ");
	        int B = scanner.nextInt();
	        System.out.print("Digite a quantidade de alunos com men��o R: ");
	        int R = scanner.nextInt();
	        System.out.print("Digite a quantidade de alunos com men��o I: ");
	        int I = scanner.nextInt();
	        int Men = MB + B + R + I;
	        if (Men != totalAlunos) {
	            System.out.println("A soma das quantidades de men��es n�o corresponde ao total de alunos.");
	        } else {	            
	            System.out.println("Escolha uma men��o para exibir a porcentagem:");
	            System.out.println("1. MB");
	            System.out.println("2. B");
	            System.out.println("3. R");
	            System.out.println("4. I");

	            int escolha = scanner.nextInt();

	            double porcentagem;
	            String men;
	            
	            switch (escolha) {
	                case 1:
	                    porcentagem = (double) MB / totalAlunos * 100;
	                    men = "MB";
	                    break;
	                case 2:
	                    porcentagem = (double) B / totalAlunos * 100;
	                    men = "B";
	                    break;
	                case 3:
	                    porcentagem = (double) R / totalAlunos * 100;
	                    men = "R";
	                    break;
	                case 4:
	                    porcentagem = (double) I / totalAlunos * 100;
	                    men = "I";
	                    break;
	                default:
	                    System.out.println("Escolha inválida.");
	                    scanner.close();
	                    return;
	            }

	            System.out.println("Porcentagem de alunos com men��o invalida: "+ men+ porcentagem);
	        }

	        scanner.close();
	    }
	}
