package principal;

/*import entidades.Disciplina;: Importa a classe Disciplina do pacote entidades.
import entidades.Professor;: Importa a classe Professor do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades.*/

import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;

/*A classe MenuProfessor ela herda todos os atributos
 * e metodos da classe Menu*/

public class MenuProfessor extends Menu {

	/*
	 * private MenuDisciplina menuDisciplina;: Declara uma variavel menuDisciplina
	 * do tipo MenuDisciplina.
	 * 
	 * private Turma turma;: Declara uma variavel turma do tipo Turma.
	 */

	private MenuDisciplina MenuDisciplina;
	private Turma turma;

	/*
	 * public MenuProfessor(MenuDisciplina menuDisciplina, Turma turma): Um
	 * construtor que recebe um objeto menuDisciplina e um objeto turma como
	 * parametros e atribui esses valores as variaveis correspondentes.
	 */

	public MenuProfessor(MenuDisciplina menuDisiplina, Turma turma) {
		this.MenuDisciplina = menuDisiplina;
		this.turma = turma;
	}

	/*
	 * @Override: Indica que o metodo que segue e uma implementacao de um metodo da
	 * classe pai (Menu).
	 * 
	 * MenuDisciplina.listarOpcoes();: Chama o metodo listarOpcoes() da instancia
	 * menuDisciplina para exibir as opcoes relacionadas as disciplinas. O loop
	 * do-while continua ate que o usuario escolha a opcao 5.
	 * 
	 * O metodo listarOpcoes() imprime as opcoes dispoiveis no menu do professor.
	 * 
	 * 1: criarProf();: Chama o metodo criarProf() para criar um professor.
	 * 
	 * 2: removerProf();: Chama o metodo removerProf() para remover um professor.
	 * 
	 * 3: exibirProf();: Chama o metodo exibirProf() para exibir informacoes de um
	 * professor.
	 * 
	 * 4: listarProf();: Chama o metodo listarProf() para listar todos os
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
	 * O metodo listarOpcoes() sao sobrescrito da classe pai (chamada Menu). O
	 * metodo listarOpcoes() declarado como protegido. A mensagem "Menu Professor"
	 * sera exibida no console Serao exibidas as opcoes do menu relacionadas a
	 * operacoes com professores. Cada linha contem um numero e uma descricao
	 * correspondente a  açao que pode ser executada. A mensagem
	 * "5 - Sair...___________" e exibida no console, indicando a opcaoo para sair
	 * do menu professor.
	 */

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
	 * O metodo exibirProf() solicita ao usuario que insira o CPF do professor e
	 * chama o metodo procurarProf() da instancia turma para exibir as informacoes
	 * do professor correspondente.
	 */

	protected void exibirProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.procurarProf(cpf);

	}

	/*
	 * O metodo removerProf() solicita ao usuario que insira o CPF do professor e
	 * chama o metodo removerProfessor() da instancia turma para remover o professor
	 * correspondente.
	 */

	public void removerProf() {
		System.out.println("Insira o cpf do Professor");
		int cpf = entrada.nextInt();
		turma.removerProfessor(cpf);
	}

	/*
	 * O metodo criarProf() solicita ao usuario que insira o nome, CPF,
	 * especialidade e periodo do professor.
	 * 
	 * Em seguida, chama o metodo menu() da instancia menuDisciplina para exibir o
	 * menu de disciplinas e obter a disciplina escolhida pelo usuario.
	 * 
	 * Em seguida, cria uma instancia da classe Professor com as informacoes
	 * fornecidas e a disciplina escolhida, e adiciona o professor a  instancia
	 * turma chamando o metodo AdicionarProfessor()
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
	 * O metodo listarProf() chama o metodo listarProfessores() da instancia turma
	 * para listar todos os professores.
	 */

	public void listarProf() {
		turma.listarProfessores();
	}

}
