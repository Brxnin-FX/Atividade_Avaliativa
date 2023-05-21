package principal;

import java.util.Scanner;

public abstract class Menu {
	
	protected final Scanner entrada = new Scanner(System.in);
	protected int opcao;
	
	public abstract void menu();
	
	protected abstract void listarOpcoes();

}
