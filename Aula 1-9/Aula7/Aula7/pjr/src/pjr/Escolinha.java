package pjr;
import java.util.Scanner;
public class Escolinha {

	public static void main(String[] args) {
		
		Scanner Ler= new Scanner(System.in);
		int anonasc, anoatual, calculo;
		System.out.println("Insira o ano de nascimento do aluno:");
		
		anonasc =Ler.nextInt();
		anoatual = 2024;
		
		calculo= anoatual - anonasc;
		
		if (calculo <= 6) {
		System.out.println("o aluno é Dente de Leite");
		} else if (calculo <= 10) {
		System.out.println("O aluno é Infantil I");
		} else if (calculo <= 14) {
		System.out.println("O aluno é Infantil II");
		} else if (calculo <= 16) {
		System.out.println("O aluno é Juvenil I");
		} else if (calculo == 17) {
		System.out.println("O aluno é Juvenil II");
		} else {
		System.out.println("A escola não permite alunos com 18 anos ou mais");
		}
		Ler.close();
	}
}
