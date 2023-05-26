
package principal;

/*import entidades.Aluno;: Importa a classe Aluno do pacote entidades.
import entidades.Professor;: Importa a classe Professor do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades*/

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;

/*A classe MenuPrincipal ela herda todos os atributos
 * e metodos da classe Menu */

public class MenuPrincipal extends Menu {

	/*
	 * Turma turma = new Turma();: Cria uma nova instancia da classe Turma
	 * chamada turma.
	 * 
	 * Aluno aluno = new Aluno(null, null,null,null);: 
	 * Cria uma nova instancia da classe Aluno chamada aluno
	 *  com parametros nulos.
	 * 
	 * MenuDisciplina disciplina = new MenuDisciplina();: 
	 * Cria uma nova instancia da classe MenuDisciplina chamada disciplina.
	 * 
	 * Professor professor = new Professor(null, null, null, null, null);: 
	 * Cria uma nova instancia da classe Professor
	 * chamada professor com parametros nulos.
	 */
	
	Turma turma = new Turma();
	Aluno aluno = new Aluno(null, null, null, null);
	MenuDisciplina disciplina = new MenuDisciplina();
	Professor professor = new Professor(null, null, null, null, null);

	/*
	 * private final MenuTurma menuTurma = new MenuTurma(turma,disciplina);: 
	 * Cria uma nova instancia da classe MenuTurma chamada menuTurma
	   passando as instancias de turma e disciplina como argumentos.
	 * 
	 * private final MenuAluno menuAluno = new MenuAluno(turma,aluno);: 
	 * Cria uma nova instancia da classe MenuAluno chamada menuAluno
	   passando as instancias de turma e aluno como argumentos.
	 * 
	 * private final MenuProfessor menuProfessor = new
	 * MenuProfessor(disciplina,turma);: 
	 * Cria uma nova instancia da classe MenuProfessor chamada 
	 * menuProfessor passando as instancias de disciplina e turma
	 * como argumentos.
	 */

	private final MenuTurma menuTurma = new MenuTurma(turma, disciplina);
	private final MenuAluno menuAluno = new MenuAluno(turma, aluno);
	private final MenuProfessor menuProfessor = new MenuProfessor(disciplina, turma);

	/*
	 * @Override: Indica que o metodo que segue e uma implementacao de
	 *  um metodo da classe pai (Menu).
	 * 
	 * O metodo menu() e uma implementacao do metodo abstrato menu()
	   da classe pai, ele exibe um menu para o usuario, onde o usuario
	   pode escolher uma opcao  relacionada a  turma, aluno ou professor,
	   usando uma estrutura switch-case.
	   Cada opcao chama o metodo menu() correspondente da classe apropriada
	 * (menuTurma, menuAluno ou menuProfessor).
	 * 
	 * O metodo listarOpcoes() e uma implementacao do metodo abstrato
	 *  listarOpcoes() da classe pai.
	 *  Ele imprime as opcoes disponiveis no menu principal
	 * 
	 * 
	 * 1: menuTurma.menu();: Chama o metodo menu() da classe MenuTurma
	 *  para exibir o menu relacionado a  turma.
	  
	 * 2: menuAluno.menu();: Chama o metodo menu() da classe MenuAluno
	   para exibir o menu relacionado ao aluno. 
	 
	 * 3: menuProfessor.menu();: Chama o metodo menu() da classe
	 *  MenuProfessor para exibir o menu relacionado ao professor. 
	 * O loop do-while continua ate que o usuario escolha a opcao 4,
	 */

	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				menuTurma.menu();
				break;
			case 2:
				menuAluno.menu();
				break;
			case 3:
				menuProfessor.menu();
				break;

			}
		} while (opcao != 4);
	}

	/*
	 * O metodo listarOpcoes() e sobrescrito da classe pai 
	 * (Menu). O metodo e declarado como protegido.
	 *  
	 * A mensagem "_Menu" sera exibida no console.
	 *  
	 * Sera exibidas as opcoes do menu, cada
	 * uma em uma linha separada. Cada linha contem um numero
	 * e uma descricao correspondente. 
	 * A mensagem "Escolha: " sera exibida no console.
	 */

	@Override
	protected void listarOpcoes() {
		System.out.println("______Menu_____");
		System.out.println("__1 - Turma____");
		System.out.println("__2 - Aluno____");
		System.out.println("__3 - Professor");
		System.out.println("__4 - Sair_____");
		System.out.println("Escolha: ");
	}

}
