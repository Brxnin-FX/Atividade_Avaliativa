
package principal;

/*import entidades.Aluno;: Importa a classe Aluno do pacote entidades.
import entidades.Professor;: Importa a classe Professor do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades*/

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;

/*A classe MenuPrincipal ela herda todos os atributos
 * e métodos da classe Menu */

public class MenuPrincipal extends Menu {

	/*
	 * Turma turma = new Turma();: Cria uma nova instância da classe Turma
	 * chamada turma.
	 * 
	 * Aluno aluno = new Aluno(null, null,null,null);: 
	 * Cria uma nova instância da classe Aluno chamada aluno
	 *  com parâmetros nulos.
	 * 
	 * MenuDisciplina disciplina = new MenuDisciplina();: 
	 * Cria uma nova instância da classe MenuDisciplina chamada disciplina.
	 * 
	 * Professor professor = new Professor(null, null, null, null, null);: 
	 * Cria uma nova instância da classe Professor
	 * chamada professor com parâmetros nulos.
	 */
	
	Turma turma = new Turma();
	Aluno aluno = new Aluno(null, null, null, null);
	MenuDisciplina disciplina = new MenuDisciplina();
	Professor professor = new Professor(null, null, null, null, null);

	/*
	 * private final MenuTurma menuTurma = new MenuTurma(turma,disciplina);: 
	 * Cria uma nova instância da classe MenuTurma chamada menuTurma
	   passando as instâncias de turma e disciplina como argumentos.
	 * 
	 * private final MenuAluno menuAluno = new MenuAluno(turma,aluno);: 
	 * Cria uma nova instância da classe MenuAluno chamada menuAluno
	   passando as instâncias de turma e aluno como argumentos.
	 * 
	 * private final MenuProfessor menuProfessor = new
	 * MenuProfessor(disciplina,turma);: 
	 * Cria uma nova instância da classe MenuProfessor chamada 
	 * menuProfessor passando as instâncias de disciplina e turma
	 * como argumentos.
	 */

	private final MenuTurma menuTurma = new MenuTurma(turma, disciplina);
	private final MenuAluno menuAluno = new MenuAluno(turma, aluno);
	private final MenuProfessor menuProfessor = new MenuProfessor(disciplina, turma);

	/*
	 * @Override: Indica que o método que segue é uma implementação de
	 *  um método da classe pai (Menu).
	 * 
	 * O método menu() é uma implementação do método abstrato menu()
	   da classe pai, ele exibe um menu para o usuário, onde o usuário
	   pode escolher uma opção  relacionada à turma, aluno ou professor,
	   usando uma estrutura switch-case.
	   Cada opção chama o método menu() correspondente da classe apropriada
	 * (menuTurma, menuAluno ou menuProfessor).
	 * 
	 * O método listarOpcoes() é uma implementação do método abstrato
	 *  listarOpcoes() da classe pai.
	 *  Ele imprime as opções disponíveis no menu principal
	 * 
	 * 
	 * 1: menuTurma.menu();: Chama o método menu() da classe MenuTurma
	 *  para exibir o menu relacionado à turma.
	  
	 * 2: menuAluno.menu();: Chama o método menu() da classe MenuAluno
	   para exibir o menu relacionado ao aluno. 
	 
	 * 3: menuProfessor.menu();: Chama o método menu() da classe
	 *  MenuProfessor para exibir o menu relacionado ao professor. 
	 * O loop do-while continua até que o usuário escolha a opção 4,
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
	 * O método listarOpcoes() é sobrescrito da classe pai 
	 * (Menu). O método é declarado como protegido.
	 *  
	 * Na linha 119, a mensagem "_Menu" é exibida no console.
	 *  
	 * Nas linhas 120 a 123, são exibidas as opções do menu, cada
	 * uma em uma linha separada. Cada linha contém um número
	 * e uma descrição correspondente. 
	 * Na linha 124, a mensagem "Escolha: " é exibida no console.
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
