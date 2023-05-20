package principal;

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Turma;

public class MenuTurma extends Menu {
	
	private Turma turma = new Turma();
	private MenuDisciplina menuDisciplina = new MenuDisciplina();
	
	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				criarAluno();
				break;
			case 2:
				excluirAluno();
				break;
				
			//Opcao 3 de Turma
			case 3:
				listarAlunos();
				break;
				
			//Opcao 4 de Turma
			case 4:
				editarInfoAluno();
				break;
				
			//Opcao 5 de Turma
			case 5:
				break;
				
				
			//Opcoes Invalidas para Menu Turma
			default:
				break;
			}
			
		//while para sar do menu do Turma
		}while(opcao != 5);
	}

	private void criarAluno() {
		System.out.println("Insira o Nome do Aluno");
		String nome = entrada.next();
		
		System.out.println("Insria o CPF do Aluno: ");
		int cpf = entrada.nextInt();
		
		System.out.println("Insira o Codigo da turma: ");
		String codigoTurma = entrada.next();
		
		menuDisciplina.menu();
		Disciplina disciplina = menuDisciplina.pegarDisciplinaEscolhida();
		
		Aluno aluno = new Aluno(nome, cpf, codigoTurma, disciplina);
		turma.adicionarAluno(aluno);
		System.out.println("Aluno adicionado");
	}
	
	private void excluirAluno() {
		System.out.println("Insira o CPF:");
		int cpf = entrada.nextInt();
		turma.removerAluno(cpf);
		System.out.println("Aluno removido...");
	}
	
	private void listarAlunos() {
		turma.listarAlunos();
	}
	
	private void editarInfoAluno() {
		System.out.println("Insira o cpf do Aluno");
		int cpf = entrada.nextInt();
		System.out.println("Insira a nova Disciplina: ");
		menuDisciplina.menu();
		Disciplina discplina=menuDisciplina.pegarDisciplinaEscolhida();
		System.out.println("Insira o novo codigo de Turma");
		String codigoTurma=entrada.next();
		turma.editarInfoAluno(cpf,codigoTurma,discplina);
		System.out.println("Atualizado...");

	}
	
	@Override
	protected void listarOpcoes() {
		System.out.println("____Menu Turma___");
        System.out.println("1-Adicionar aluno");
        System.out.println("2-remover aluno");
        System.out.println("3-listar alunos");
        System.out.println("4-Editar informacoes de um aluno");
        System.out.println("5-sair");
	}
	
}
