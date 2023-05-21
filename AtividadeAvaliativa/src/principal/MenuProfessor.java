package principal;

import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;

public class MenuProfessor extends Menu {
	
	Professor prof = new Professor(null, null, null, null, null);
	Turma turma = new Turma();
	private MenuDisciplina menuDisciplina = new MenuDisciplina();

	@Override
	public void menu() {
		
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch(opcao) {
			//criar professor
			case 1:criarProf();
				break;
			//exibir professor
			case 2:removerProf();
				break;
				
			case 3:exibirProf();
				break;
				
			case 4:listarProf();
				break;
				
			case 5:
				break;
				
			}
			
		}while(opcao != 5);
		
	}

	@Override
	protected void listarOpcoes() {
		System.out.println("_____Menu Professor_____");
		System.out.println("_1 - Criar Professor____");
		System.out.println("_2 -Remover Professores_");
		System.out.println("_3 - Exibir Informacoes_");
		System.out.println("_4 -Listar Professores__");
		System.out.println("_5 - Sair...____________");
	}

	
	
	
	protected void exibirProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.procurarProf(cpf);
		
	}
	
	
	
	
	public void removerProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.removerProfessor(cpf);
	}
	
	protected void criarProf() {
		System.out.println("Insira o Nome do Aluno");
		String nome = entrada.next();
		
		System.out.println("Insria o CPF do Aluno: ");
		int cpf = entrada.nextInt();
		
		System.out.println("Insira a Especialidade: ");
		String especialidade = entrada.next();
		
		
		System.out.println("Insira o Periodo: ");
		String periodo = entrada.next();
		
		menuDisciplina.menu();
		Disciplina disciplina = menuDisciplina.pegarDisciplinaEscolhida();
	

		Professor professor = new Professor(nome, cpf, especialidade, periodo, disciplina);
	    turma.AdicionarProfessor(professor);
	}
	
	public void listarProf() {
		turma.listarProfessores();
	}
	
	
}
