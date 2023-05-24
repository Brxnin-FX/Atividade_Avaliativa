package principal;

import entidades.Aluno;
import entidades.Turma;

public class MenuAluno extends Menu {
	
	private Turma turma; 
	private Aluno aluno;
	
	public MenuAluno(Turma turma,Aluno aluno) {
		this.aluno=aluno;
		this.turma=turma;
	}
	
	
	
	
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
	
	
	private void adicionarNota() {
		System.out.println("Qual o cpf do Aluno:");
		int cpf =entrada.nextInt();
		Aluno aluno = turma.buscarAluno(cpf);
		aluno.setNotas(aluno.adicionarNota());
	}
	
	
	private void listarNotas() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		System.out.println("____Lista de Notas___");
		Aluno aluno = turma.buscarAluno(cpf);
		aluno.listarNotas();
		System.out.println("_____________________");
	}
	

	private void removerNota() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		
		Aluno aluno = turma.buscarAluno(cpf);
		aluno.listarNotas();
		double nota = entrada.nextDouble();
		aluno.removerNota(nota);
		}
		
	
	
	private void calcularMedia() {
		System.out.println("Insira o cpf");
		int cpf =entrada.nextInt();
		 Aluno aluno = turma.buscarAluno(cpf);
	     Double media = aluno.calcularNota();
	     System.out.printf("Media= %.2f", media);
		if(media >= 6 ) {
			System.out.println("Esse Aluno foi Aprovado");
		}
		
		else {
			System.out.println("Esse Aluno foi Reprovado");
		}
		
	}
	

	@Override
	protected void listarOpcoes() {
		System.out.println("______Menu Aluno______");
		System.out.println("__1 - Adicionar Nota__");
		System.out.println("__2 - remover Nota____");
		System.out.println("__3 - Listar Notas____");
		System.out.println("__4 - Calc Media______");
		System.out.println("__5 - Sair____________");
	}

}
