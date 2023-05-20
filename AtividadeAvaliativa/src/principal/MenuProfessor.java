package principal;

import entidades.Disciplina;
import entidades.Professor;

public class MenuProfessor extends Menu {
	
	Professor prof = new Professor(null, null, null, null, null);
	private MenuDisciplina menuDisciplina = new MenuDisciplina();

	@Override
	public void menu() {
		
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch(opcao) {
			//criar professor
			case 1:adicionarProfessor();
				break;
			//exibir professor
			case 2:exibirProf();
				break;
			}
			
		}while(opcao > 2);
		
	}

	@Override
	protected void listarOpcoes() {
		System.out.println("_____Menu Professor_____");
		System.out.println("_1 - Criar Professor____");
		System.out.println("_2 - Exibir Informa�oes_");
		System.out.println("_3 - Sair...____________");
	}

	
	protected void adicionarProfessor() {
		System.out.println("Insira o Nome do Professor");
		String nome = entrada.next();
		
		System.out.println("Insria o CPF do Professor: ");
		int cpf = entrada.nextInt();
		
		System.out.println("Insira o a Especialidade: ");
		String especialidade = entrada.next();
		
		System.out.println("Insira o Periodo");
		String periodo = entrada.next();
		
		
		menuDisciplina.menu();
		Disciplina disciplina = menuDisciplina.pegarDisciplinaEscolhida();
		
		Professor professor = new Professor(nome,cpf,especialidade,periodo,disciplina);
	    prof.addProfessor(professor);
	
	}
	
	protected void exibirProf() {
		System.out.println("Insira o nome do professor: ");
		String nome = entrada.next();
		
		prof.buscarProf(nome);
		
	
	}
}
