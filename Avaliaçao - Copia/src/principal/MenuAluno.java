package principal;

public class MenuAluno extends Menu {

	@Override
	public void menu() {
	
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
