package principal;

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;

public class MenuPrincipal extends Menu {
	
	
	Turma turma = new Turma();
	Aluno aluno = new Aluno(null, null,null,null);
	MenuDisciplina disciplina = new MenuDisciplina();
	Professor professor = new Professor(null, null, null, null, null);

	private final MenuTurma menuTurma = new MenuTurma(turma,disciplina);
	private final MenuAluno menuAluno = new MenuAluno(turma,aluno);
	private final MenuProfessor menuProfessor = new MenuProfessor(disciplina,turma);
	
	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch(opcao) {
				case 1: menuTurma.menu();
				    break;
				case 2:menuAluno.menu();
					break;
				case 3:menuProfessor.menu();
					break;
				
			}
		} while (opcao != 4);
	}

	@Override
	protected void listarOpcoes() {
		System.out.println("______menu_____");
		System.out.println("__1 - turma____");
		System.out.println("__2 - aluno____");
		System.out.println("__3 - professor");
		System.out.println("__4 - Sair_____");
		System.out.println("escolha: ");
	}
	
}