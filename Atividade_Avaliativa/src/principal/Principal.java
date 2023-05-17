package principal;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Diciplina;
import entidades.Professor;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		
		
		Scanner entrada = new Scanner(System.in);
		do {
		System.out.println("Escolha sua opção");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		System.out.println("3 - Turma");
		System.out.println("4 - Sair");
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			Aluno aluno1 = new Aluno("Bruno",508.50058805,Diciplina.FPOO,"1MDS");
			aluno1.MenuAluno();
			opcao=entrada.nextInt();
			do{
				switch(opcao) {
				case 1:
					System.out.println("Insira a nota a ser adicionada");
					double nota;
					nota = entrada.nextDouble();
					aluno1.adicionarNotas(10);
					break;
					
				case 2:
					System.out.println("Insira a nota a ser removida");
					nota = entrada.nextDouble();
					aluno1.removerNotas(nota);
					break;
					
				case 3:
					aluno1.listarNotas();
					break;
					
				case 4:
					double Media = aluno1.calcularMedia();
					System.out.println(Media);
					break;
					
				case 5:
					break;
				}
				break;
			}while(opcao != 5);
			
		}
		
		
		
		
		Professor professor1 = new Professor("Eduardo", 663.4, "Programador","Manha / Tarde", Diciplina.FPOO);
		

		Aluno aluno1 = new Aluno("Bruno",508.50058805,Diciplina.FPOO,"1MDS");
		
		aluno1.calcularMedia();
		
	}while(opcao != 4);
	}
	
	

}
