package pjr;
import java.util.Scanner;
public class Meninos {
	
	public static void main(String[] args) {
		float meninos, meninas, porcMeninos, porcMeninas, t;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de meninos:");
		meninos = Ler.nextFloat();
		
		System.out.println("Digite o numero de meninas:");
		meninas = Ler.nextFloat();
		
		t = meninos + meninas;
		
		porcMeninos = ((meninos/t)*100);
		porcMeninas = ((meninas/t)*100);
		
		System.out.println("O total de alunos é: " + t);
		System.out.println("A porcentagem total de meninos na turma é: " + porcMeninos);
		System.out.println("A porcentagem total de meninas na turma é: " + porcMeninas);
		
		Ler.close();
		
	}

}
