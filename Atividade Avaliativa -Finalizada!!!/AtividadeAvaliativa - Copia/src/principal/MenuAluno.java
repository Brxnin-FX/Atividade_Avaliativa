package principal;

import entidades.Aluno;
import entidades.Turma;


/*@author Aluno Bruno
 * Classe MenuAluno
 * nesta classe "filha" da classe menu
 * herdando todos os atributos do Menu contendo a entrada e saida de dados
 * separando a entrada/saida de dados e processamento de dados onde a classe
 * Aluno faz.
 * 
 * 
 */
public class MenuAluno extends Menu {
	
	private Turma turma; 
	private Aluno aluno;
	
	public MenuAluno(Turma turma,Aluno aluno) {
		this.aluno=aluno;
		this.turma=turma;
	}
	
	
	//o metodo menu é um metodo herdado da classe Menu
	
	//Menu do Aluno contendo um Do while e um Switch case
	//para que o usuario possa transitar entre os metodos presentes no Menu
	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao=entrada.nextInt();
			switch(opcao) {
			case 1:adicionarNota();
				break;
				
			case 2:removerNota();
				break;
				
			case 3:listarNotas();
				break;
				
			case 4:calcularMedia();
				break;
			}
		}while(opcao != 5);
	
	}
	
	//Metodo de entrada e saida de dados para o metodo
	//adicionarNota presente tambem na classe Alunos
	private void adicionarNota() {
		System.out.println("Qual o cpf do Aluno:");
		int cpf =entrada.nextInt();
		Aluno aluno = turma.buscarAluno(cpf);
		if(aluno != null) {
		aluno.setNotas(aluno.adicionarNota());
		}
		else {
			System.out.println("Não foi possivel encontrar o aluno");
		}
	}
	
	//Metodo de entrada e saida de dados para o metodo
	//listarNotas presente tambem na classe Alunos
	private void listarNotas() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		System.out.println("____Lista de Notas___");
		Aluno aluno = turma.buscarAluno(cpf);
		aluno.listarNotas();
		System.out.println("_____________________");
	}
	
	//Metodo de entrada e saida de dados para o metodo
	//RemoverNota presente tambem na classe Alunos
	private void removerNota() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		Aluno aluno1 = turma.buscarAluno(cpf);
		aluno1.listarNotas();
		double nota = entrada.nextDouble();
		System.out.println("Qual nota deseja remover? ");
		aluno1.removerNota(nota);
		}
		
	
	//Metodo de entrada e saida de dados para o metodo
	//calcularMedia presente tambem na classe Alunos
	private void calcularMedia() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		 Aluno aluno = turma.buscarAluno(cpf);
	     Double media = aluno.calcularNota();
	     System.out.printf("Media= %.2f", media);
		if(media >= 6 ) {
			System.out.println("  Esse Aluno foi Aprovado");
		}
		
		else {
			System.out.println("Esse Aluno foi Reprovado");
		}
		
	}
	

	//Outro metodo herdado da classe Menu
	//onde aqui ele listará as opçoes desse menu
	@Override
	protected void listarOpcoes() {
		System.out.println("|----------------------|");
		System.out.println("|      Menu Aluno      |");
		System.out.println("|  1 - Adicionar Nota  |");
		System.out.println("|  2 - remover Nota    |");
		System.out.println("|  3 - Listar Notas    |");
		System.out.println("|  4 - Calc Media      |");
		System.out.println("|  5 - Sair            |");
		System.out.println("|----------------------|");
	}

}
