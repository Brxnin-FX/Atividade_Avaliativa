package principal;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;

public abstract class Menu {
	
	
	protected final Scanner entrada = new Scanner(System.in);
	protected int opcao;
	
	public abstract void menu();
	
	protected abstract void listarOpcoes();

}
