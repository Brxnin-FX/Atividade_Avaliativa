package principal;

public class MenuPrincipal extends Menu {
	
	private final MenuTurma menuTurma = new MenuTurma();
	private final MenuAluno menuAluno = new MenuAluno();
	private final MenuProfessor menuProfessor = new MenuProfessor();
	

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
		} while (opcao < 4);
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