package principal;

/*import entidades.Aluno;: Importa a classe Aluno do pacote entidades.
import entidades.Disciplina;: Importa a classe Disciplina do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades.*/

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Turma;

/*A classe MenuTurma ela herda todos os atributos
 * e metodos da classe Menu*/

public class MenuTurma extends Menu {

	/*
	 * private Turma turma;: Declara uma variavel turma do tipo Turma.
	 * 
	 * private MenuDisciplina menuDisciplina;: Declara uma variavel menuDisciplina
	 * do tipo MenuDisciplina.
	 */

	private Turma turma;
	private MenuDisciplina MenuDisciplina;

	/*
	 * public MenuTurma(Turma turma, MenuDisciplina menuDisciplina): Um construtor
	 * que recebe um objeto turma e um objeto menuDisciplina como parametros e
	 * atribui esses valores as variaveis correspondentes.
	 */

	public MenuTurma(Turma turma, MenuDisciplina MenuDisciplina) {
		this.turma = turma;
		this.MenuDisciplina = MenuDisciplina;
	}

	/*
	 * @Override: Indica que o metodo que segue a uma implementacao de um metodo da
	 * classe pai (Menu).
	 * 
	 * O metodo menu() e uma implementacao do metodo abstrato menu() da classe pai.
	 * Ele exibe um menu para o usuario, onde o usuario pode escolher uma opcao
	 * relacionada a† turma, usando uma estrutura switch-case. Cada opcao chama um
	 * metodo correspondente.
	 * 
	 * listarOpcoes();: Chama o metodo listarOpcoes() para exibir as opcoes
	 * relacionadas a† turma. O loop do-while continua ate que o usuario escolha a
	 * opcao 5.
	 * 
	 * O metodo listarOpcoes() imprime as opcoes disponiveis no menu da turma.
	 * 
	 * As opcoes s√£o apresentadas numeradas:
	 * 
	 * 1: criarAluno();: Chama o metodo criarAluno() para criar um novo aluno.
	 * 
	 * 2: excluirAluno();: Chama o metodo excluirAluno() para remover um aluno.
	 * 
	 * 3: listarAlunos();: Chama o metodo listarAlunos() para listar todos os
	 * alunos.
	 * 
	 * 4: editarInfoAluno();: Chama o metodo editarInfoAluno() para editar as
	 * informacoes de um aluno.
	 * 
	 * 5: break;: Sai do loop e encerra o programa. Os metodos criarAluno(),
	 * excluirAluno(), listarAlunos() e editarInfoAluno() serao responsaveis por
	 * realizar as acoes correspondentes as opcoes do menu.
	 */

	@Override
	public void menu() {
		do {

			listarOpcoes();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				criarAluno();
				break;
			case 2:
				excluirAluno();
				break;
			case 3:
				listarAlunos();
				break;
			case 4:
				editarInfoAluno();
				break;
			case 5:
				break;
			}

			// while para sar do menu do Turma
		} while (opcao != 5);
	}

	/*
	 * O metodo criarAluno() solicita ao usario que insira o nome, CPF, codigo da
	 * turma e disciplina do aluno. Em seguida, chama o metodo menu() da instancia
	 * menuDisciplina para exibir o menu de disciplinas e obter a disciplina
	 * escolhida pelo usuario. Em seguida, cria uma instancia da classe Aluno com as
	 * informacoes fornecidas e a disciplina escolhida, e adiciona o aluno a†
	 * instancia turma chamando o metodo adicionarAluno().
	 */

	private void criarAluno() {
		System.out.println("Insira o Nome do Aluno");
		String nome = entrada.next();

		System.out.println("Insria o CPF do Aluno: ");
		int cpf = entrada.nextInt();

		System.out.println("Insira o Codigo da turma: ");
		String codigoTurma = entrada.next();

		MenuDisciplina.menu();
		Disciplina disciplina = MenuDisciplina.pegarDisciplinaEscolhida();

		Aluno aluno = new Aluno(nome, cpf, codigoTurma, disciplina);
		turma.adicionarAluno(aluno);
		System.out.println("Aluno adicionado");
	}

	/*
	 * O metodo excluirAluno() solicita ao usuario que insira o CPF do aluno e chama
	 * o metodo removerAluno() da instancia turma para remover o aluno
	 * correspondente.
	 */

	private void excluirAluno() {
		System.out.println("Insira o CPF:");
		int cpf = entrada.nextInt();
		turma.removerAluno(cpf);
	}

	/*
	 * O metodo listarAlunos() e declarado como privado. Ele chama o metodo
	 * listarAlunos() da instancia de turma, do tipo Turma, para listar os alunos
	 * presentes na turma.
	 */

	private void listarAlunos() {
		turma.listarAlunos();
	}

	/*
	 * O metodo editarInfoAluno() e declarado como privado. 
	 * Solicita a entrada do CPF do aluno. 
	 * Guarda o conteudo denro da variavel cpf
	 * Exibe a mensagem "Insira a nova Disciplina: ".
	 * Chama o metodo menu() da classe MenuDisciplina. 
	 * Cama o metodo pegarDisciplinaEscolhida() da classe MenuDisciplina
	 * para obter a disciplina escolhida pelo usuario. 
	 * Solicita a entrada do novo codigo de turma.
	 * Guarda o conteudo dentro da variavel codigoTurma 
	 * Chama o metodo editarInfoAluno() da instancia de turma,
	 * passando o CPF, o novo codigo de turma e a disciplina como argumentos. 
	 * Exibe a mensagem "Atualizado...".
	 */

	private void editarInfoAluno() {
		System.out.println("Insira o cpf do Aluno");
		int cpf = entrada.nextInt();
		System.out.println("Insira a nova Disciplina: ");
		MenuDisciplina.menu();
		Disciplina discplina = MenuDisciplina.pegarDisciplinaEscolhida();
		System.out.println("Insira o novo codigo de Turma");
		String codigoTurma = entrada.next();
		turma.editarInfoAluno(cpf, codigoTurma, discplina);
		System.out.println("Atualizado...");

	}

	/*
	 * O metodo listarOpcoes() e sobrescrito da classe pai (chamada Menu)
	 * O metodo e declarado como protegido. 
	 * Sera exibida a mensagem "_Menu Turma". 
	 * Sao exibidas as opcoes do menu relacionadas as operacoes da turma. 
	 * Cada linha contem um numero e uma descricao correspondente a†
	 * acao que pode ser executada.
	 */

	@Override
	protected void listarOpcoes() {
		System.out.println("____Menu Turma___");
		System.out.println("1-Adicionar aluno");
		System.out.println("2-remover aluno");
		System.out.println("3-listar alunos");
		System.out.println("4-Editar informacoes de um aluno");
		System.out.println("5-sair");
	}

}
