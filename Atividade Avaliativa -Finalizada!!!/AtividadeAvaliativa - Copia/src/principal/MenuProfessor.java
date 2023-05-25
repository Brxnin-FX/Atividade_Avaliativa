package principal;

import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;

public class MenuProfessor extends Menu {
	
	
	private MenuDisciplina MenuDisciplina;
	private Turma turma; 
	
	public MenuProfessor(MenuDisciplina menuDisiplina,Turma turma) {
		this.MenuDisciplina=menuDisiplina;
		this.turma=turma;
	}

	@Override
	public void menu() {
		
		MenuDisciplina.listarOpcoes();
		
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
		System.out.println("Insira o Nome do Professor");
		String nome = entrada.next();
		
		System.out.println("Insria o CPF do Professor: ");
		int cpf = entrada.nextInt();
		
		System.out.println("Insira a Especialidade: ");
		String especialidade = entrada.next();
		
		
		System.out.println("Insira o Periodo: ");
		String periodo = entrada.next();
		
		MenuDisciplina.menu();
		Disciplina disciplina = MenuDisciplina.pegarDisciplinaEscolhida();
	

		Professor professor = new Professor(nome, cpf, especialidade, periodo, disciplina);
	    turma.AdicionarProfessor(professor);
	}
	
	public void listarProf() {
		turma.listarProfessores();
	}
	
	
}
