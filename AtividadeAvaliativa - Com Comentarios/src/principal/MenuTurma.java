package principal;

/*import entidades.Aluno;: Importa a classe Aluno do pacote entidades.
import entidades.Disciplina;: Importa a classe Disciplina do pacote entidades.
import entidades.Turma;: Importa a classe Turma do pacote entidades.*/

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Turma;

/*A classe MenuTurma ela herda todos os atributos
 * e métodos da classe Menu*/

public class MenuTurma extends Menu {

	/*
	 * private Turma turma;: Declara uma variável turma do tipo Turma.
	 * 
	 * private MenuDisciplina menuDisciplina;: Declara uma variável menuDisciplina
	 * do tipo MenuDisciplina.
	 */

	private Turma turma;
	private MenuDisciplina MenuDisciplina;

	/*
	 * public MenuTurma(Turma turma, MenuDisciplina menuDisciplina): Um construtor
	 * que recebe um objeto turma e um objeto menuDisciplina como parâmetros e
	 * atribui esses valores às variáveis correspondentes.
	 */

	public MenuTurma(Turma turma, MenuDisciplina MenuDisciplina) {
		this.turma = turma;
		this.MenuDisciplina = MenuDisciplina;
	}

	/*
	 * @Override: Indica que o método que segue é uma implementação de um método da
	 * classe pai (Menu).
	 * 
	 * O método menu() é uma implementação do método abstrato menu() da classe pai.
	 * Ele exibe um menu para o usuário, onde o usuário pode escolher uma opção
	 * relacionada à turma, usando uma estrutura switch-case. Cada opção chama um
	 * método correspondente.
	 * 
	 * listarOpcoes();: Chama o método listarOpcoes() para exibir as opções
	 * relacionadas à turma. O loop do-while continua até que o usuário escolha a
	 * opção 5.
	 * 
	 * O método listarOpcoes() imprime as opções disponíveis no menu da turma.
	 * 
	 * As opções são apresentadas numeradas:
	 * 
	 * 1: criarAluno();: Chama o método criarAluno() para criar um novo aluno.
	 * 
	 * 2: excluirAluno();: Chama o método excluirAluno() para remover um aluno.
	 * 
	 * 3: listarAlunos();: Chama o método listarAlunos() para listar todos os
	 * alunos.
	 * 
	 * 4: editarInfoAluno();: Chama o método editarInfoAluno() para editar as
	 * informações de um aluno.
	 * 
	 * 5: break;: Sai do loop e encerra o programa. Os métodos criarAluno(),
	 * excluirAluno(), listarAlunos() e editarInfoAluno() são responsáveis por
	 * realizar as ações correspondentes às opções do menu.
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
	 * O método criarAluno() solicita ao usuário que insira o nome, CPF, código da
	 * turma e disciplina do aluno. Em seguida, chama o método menu() da instância
	 * menuDisciplina para exibir o menu de disciplinas e obter a disciplina
	 * escolhida pelo usuário. Em seguida, cria uma instância da classe Aluno com as
	 * informações fornecidas e a disciplina escolhida, e adiciona o aluno à
	 * instância turma chamando o método adicionarAluno().
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
	 * O método excluirAluno() solicita ao usuário que insira o CPF do aluno e chama
	 * o método removerAluno() da instância turma para remover o aluno
	 * correspondente.
	 */

	private void excluirAluno() {
		System.out.println("Insira o CPF:");
		int cpf = entrada.nextInt();
		turma.removerAluno(cpf);
	}

	/*
	 * O método listarAlunos() é declarado como privado. Ele chama o método
	 * listarAlunos() da instância de turma, do tipo Turma, para listar os alunos
	 * presentes na turma.
	 */

	private void listarAlunos() {
		turma.listarAlunos();
	}

	/*
	 * O método editarInfoAluno() é declarado como privado. 
	 * Na linha 161, solicita a entrada do CPF do aluno. 
	 * Na linha 162 guarda o conteudo denro da variavel cpf
	 * Na linha 163, exibe a mensagem "Insira a nova Disciplina: ".
	 * Na linha 164, chama o método menu() da classe MenuDisciplina. 
	 * Na linha 165, chama o método pegarDisciplinaEscolhida() da classe MenuDisciplina
	 * para obter a disciplina escolhida pelo usuário. 
	 * Na linha 166, solicita a entrada do novo código de turma.
	 * Na linha 167 guarda o conteudo dentro da variavel codigoTurma 
	 * Na linha 168, chama o método editarInfoAluno() da instância de turma,
	 * passando o CPF, o novo código de turma e a disciplina como argumentos. 
	 * Na linha 169, exibe a mensagem "Atualizado...".
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
	 * O método listarOpcoes() é sobrescrito da classe pai (chamada Menu)
	 * O método é declarado como protegido. 
	 * Na linha 183 , é exibida a mensagem "_Menu Turma". 
	 * Nas linhas 184 a 188, são exibidas as opções do menu relacionadas às operações da turma. 
	 * Cada linha contém um número e uma descrição correspondente à ação que pode ser executada.
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
