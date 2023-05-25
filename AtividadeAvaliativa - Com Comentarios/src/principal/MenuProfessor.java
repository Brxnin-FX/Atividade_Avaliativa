package principal;

/*import entidades.Disciplina;: Importa a classe Disciplina do pacote entidades.
import entidades.Professor;: Importa a classe Professor do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades.*/

import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;

/*A classe MenuProfessor ela herda todos os atributos
 * e métodos da classe Menu*/

public class MenuProfessor extends Menu {

	/*
	 * private MenuDisciplina menuDisciplina;: Declara uma variável menuDisciplina
	 * do tipo MenuDisciplina.
	 * 
	 * private Turma turma;: Declara uma variável turma do tipo Turma.
	 */

	private MenuDisciplina MenuDisciplina;
	private Turma turma;

	/*
	 * public MenuProfessor(MenuDisciplina menuDisciplina, Turma turma): Um
	 * construtor que recebe um objeto menuDisciplina e um objeto turma como
	 * parâmetros e atribui esses valores às variáveis correspondentes.
	 */

	public MenuProfessor(MenuDisciplina menuDisiplina, Turma turma) {
		this.MenuDisciplina = menuDisiplina;
		this.turma = turma;
	}

	/*
	 * @Override: Indica que o método que segue é uma implementação de um método da
	 * classe pai (Menu).
	 * 
	 * MenuDisciplina.listarOpcoes();: Chama o método listarOpcoes() da instância
	 * menuDisciplina para exibir as opções relacionadas às disciplinas. O loop
	 * do-while continua até que o usuário escolha a opção 5.
	 * 
	 * O método listarOpcoes() imprime as opções disponíveis no menu do professor.
	 * 
	 * 1: criarProf();: Chama o método criarProf() para criar um professor.
	 * 
	 * 2: removerProf();: Chama o método removerProf() para remover um professor.
	 * 
	 * 3: exibirProf();: Chama o método exibirProf() para exibir informações de um
	 * professor.
	 * 
	 * 4: listarProf();: Chama o método listarProf() para listar todos os
	 * professores.
	 * 
	 * 5: break;: Sai do loop e encerra o programa.
	 */

	@Override
	public void menu() {

		MenuDisciplina.listarOpcoes();

		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				criarProf();
				break;
			case 2:
				removerProf();
				break;

			case 3:
				exibirProf();
				break;

			case 4:
				listarProf();
				break;

			case 5:
				break;

			}

		} while (opcao != 5);

	}

	/*
	 * O método listarOpcoes() é sobrescrito da classe pai (chamada
	 * Menu).
	 * O método é declarado como protegido.
	 * Na linha 106, a mensagem "Menu Professor" é exibida no console
	 * Nas linhas 107 a 110, são exibidas as opções do menu relacionadas
	 * a operações com professores. 
	 * Cada linha contém um  número e uma descrição correspondente à ação que pode ser executada.
	 * Na linha 111, a mensagem "5 - Sair...___________" é exibida no console, indicando a
	 * opção para sair do menu professor.*/

	@Override
	protected void listarOpcoes() {
		System.out.println("_____Menu Professor_____");
		System.out.println("_1 - Criar Professor____");
		System.out.println("_2 -Remover Professores_");
		System.out.println("_3 - Exibir Informacoes_");
		System.out.println("_4 -Listar Professores__");
		System.out.println("_5 - Sair...____________");
	}

	/*
	 * O método exibirProf() solicita ao usuário que insira o CPF do professor e
	 * chama o método procurarProf() da instância turma para exibir as informações
	 * do professor correspondente.
	 */

	protected void exibirProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.procurarProf(cpf);

	}

	/*
	 * O método removerProf() solicita ao usuário que insira o CPF do professor e
	 * chama o método removerProfessor() da instância turma para remover o professor
	 * correspondente.
	 */

	public void removerProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.removerProfessor(cpf);
	}

	/*
	 * O método criarProf() solicita ao usuário que insira o nome, CPF,
	 * especialidade e período do professor.
	 * 
	 * Em seguida, chama o método menu() da instância menuDisciplina para exibir o
	 * menu de disciplinas e obter a disciplina escolhida pelo usuário.
	 * 
	 * Em seguida, cria uma instância da classe Professor com as informações
	 * fornecidas e a disciplina escolhida, e adiciona o professor à instância turma
	 * chamando o método AdicionarProfessor()
	 */

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

	/*
	 * O método listarProf() chama o método listarProfessores() da instância turma
	 * para listar todos os professores.
	 */

	public void listarProf() {
		turma.listarProfessores();
	}

}
