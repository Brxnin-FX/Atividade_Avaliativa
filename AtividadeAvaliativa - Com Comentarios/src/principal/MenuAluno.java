package principal;

/*import entidades.Aluno; : Importa a classe `Aluno` do pacote entidades.
 *import entidades.Turma; : Importa a classe `Turma` do pacote entidades*/

import entidades.Aluno;
import entidades.Turma;

/*A classe (MenuAluno) e uma subclasse da classe (Menu)
 * Ela herda todos os atributos e metodos da classe (Menu).
*/

public class MenuAluno extends Menu {

	/*
	 * private Turma turma; : Declara uma variavel privada do tipo Turma chamada
	 * turma, que sera usada para representar a turma a qual os alunos pertencem.
	 * 
	 * private Aluno aluno; : Declara uma variavel privada do tipo Aluno chamada
	 * aluno, que sera usada para representar o aluno selecionado.
	 */

	private Turma turma;
	private Aluno aluno;

	/*
	 * O construtor (MenuAluno)recebe um objeto `Turma` e um objeto Aluno como
	 * parametros e atribui esses valores as variaveis correspondentes.
	 */

	public MenuAluno(Turma turma, Aluno aluno) {
		this.aluno = aluno;
		this.turma = turma;
	}

	/*
	 * O metodo menu() � uma implementacao do metodo abstrato menu() da classe pai.
	 * Ele exibe um menu para o usuario e permite que ele escolha diferentes opcoes
	 * por meio de um loop do-while e uma estrutura switch-case
	 * 
	 * 1:adicionarNota(): Chama o metodo adicionarNota() para adicionar uma nota
	 * para um aluno.
	 * 
	 * 2:removerNota(): Chama o metodo removerNota() para remover uma nota de um
	 * aluno.
	 * 
	 * 3:listarNotas(): Chama o metodo listarNotas() para exibir a lista de notas de
	 * um aluno.
	 * 
	 * 4:calcularMedia(): Chama o metodo calcularMedia() para calcular e exibir a
	 * media de um aluno.
	 * 
	 * }while(opcao != 5): O loop continua ate que o usuario escolha a opcao 5 que
	 * representa sair do menu.
	 */

	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				adicionarNota();
				break;

			case 2:
				removerNota();
				break;

			case 3:
				listarNotas();
				break;

			case 4:
				calcularMedia();
				break;
			}
		} while (opcao != 5);

	}

	/*
	 * O método adicionarNota() é declarado como privado.
	 * 
	 * Na linha 103, a mensagem "Qual o cpf do Aluno:" é exibida no console.
	 * 
	 * Na linha 104, é lido um valor inteiro da entrada do usuário e armazenado na
	 * variável cpf.
	 * 
	 * Na linha 105, o método buscarAluno(cpf) é chamado na instância da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * Na linha 106, verifica-se se o aluno é diferente de null. Se o aluno for
	 * diferente de null.
	 * 
	 * Na linha 107, o método adicionarNota() é chamado no objeto aluno para
	 * adicionar uma nota. Caso contrário ira para, a linha 109,
	 * "Nao foi possivel encontrar o aluno" é exibida no console.
	 */

	private void adicionarNota() {
		System.out.println("Qual o cpf do Aluno:");
		int cpf = entrada.nextInt();
		Aluno aluno = turma.buscarAluno(cpf);
		if (aluno != null) {
			aluno.setNotas(aluno.adicionarNota());
		} else {
			System.out.println("Nao foi possivel encontrar o aluno");
		}
	}

	/*
	 * O método listarNotas() é declarado como privado.
	 * 
	 * Na linha 134, a mensagem "Insira o cpf" é exibida no console.
	 * 
	 * Na linha 135, é lido um valor inteiro da entrada do usuário e armazenado na
	 * variável cpf.
	 * 
	 * Na linha 136, a mensagem "_Lista de Notas" é exibida no console.
	 * 
	 * Na linha 137, o método buscarAluno(cpf) é chamado na instância da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * Na linha 138, o método listarNotas() é chamado no objeto aluno para exibir as
	 * notas.
	 * 
	 * Na linha 139 , a mensagem "_____________________" é exibida no console como
	 * decoracao.
	 */

	private void listarNotas() {
		System.out.println("Insira o cpf");
		int cpf = entrada.nextInt();
		System.out.println("____Lista de Notas___");
		Aluno aluno = turma.buscarAluno(cpf);
		aluno.listarNotas();
		System.out.println("_____________________");
	}

	/*
	 * O método removerNota() é declarado como privado.
	 * 
	 * Na linha 166, a mensagem "Insira o cpf" é exibida no console.
	 * 
	 * Na linha 167, é lido um valor inteiro da entrada do usuário e armazenado na
	 * variável cpf.
	 * 
	 * Na linha 168, o método buscarAluno(cpf) é chamado na instância da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * Na linha 169, o método listarNotas() é chamado no objeto aluno1 para exibir
	 * as notas.
	 * 
	 * Na linha 170, é lido um valor decimal da entrada do usuário e armazenado na
	 * variável nota.
	 * 
	 * Na linha 171, a mensagem "Qual nota deseja remover?" é exibida no console.
	 * 
	 * Na linha 172, o método removerNota(nota) é chamado no objeto aluno1 para
	 * remover a nota especificada.
	 */

	private void removerNota() {
		System.out.println("Insira o cpf");
		int cpf = entrada.nextInt();
		Aluno aluno1 = turma.buscarAluno(cpf);
		aluno1.listarNotas();
		double nota = entrada.nextDouble();
		System.out.println("Qual nota deseja remover? ");
		aluno1.removerNota(nota);
	}

	/*
	 * O método calcularMedia() é declarado como privado.
	 * 
	 * Na linha 202, a mensagem "Insira o cpf" é exibida no console.
	 * 
	 * Na linha 203, é lido um valor inteiro da entrada do usuário e armazenado na
	 * variável cpf.
	 * 
	 * Na linha 204, o método buscarAluno(cpf) é chamado na instância da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * Na linha 205, o método calcularNota() é chamado no objeto aluno para calcular
	 * a média das notas.
	 * 
	 * Na linha 206, a média é exibida no console formatada com duas casas decimais
	 * utilizando o printf.
	 * 
	 * Na linha 207, verifica-se se a média é maior ou igual a 6. Se a média for
	 * maior ou igual a 6,
	 * 
	 * Na linha 208, a mensagem "Esse Aluno foi Aprovado" é exibida no console. Caso
	 * contrário,
	 * 
	 * Na linha 212, a mensagem "Esse Aluno foi Reprovado" é exibida no console.
	 */

	private void calcularMedia() {
		System.out.println("Insira o cpf");
		int cpf = entrada.nextInt();
		Aluno aluno = turma.buscarAluno(cpf);
		Double media = aluno.calcularNota();
		System.out.printf("Media= %.2f", media);
		if (media >= 6) {
			System.out.println("Esse Aluno foi Aprovado");
		}

		else {
			System.out.println("Esse Aluno nao foi Reprovado");
		}

	}

	/*
	 * A anotação @Override indica que o método está sobrescrevendo um método da
	 * classe pai.
	 *
	 * O método listarOpcoes() é declarado como protegido.
	 * 
	 * Na linha 237, a mensagem "|----------------------|" é exibida no console para
	 * decoracao.
	 * 
	 * Na linha 238, a mensagem "| Menu Aluno |" é exibida no console.
	 * 
	 * Nas linhas 239 a 243, são exibidas as opções do menu com números e descrições
	 * correspondentes.
	 * 
	 * Na linha 244, a mensagem "|----------------------|" é exibida no console como
	 * decoracao.
	 */

	@Override
	protected void listarOpcoes() {
		System.out.println("|----------------------|");
		System.out.println("|      Menu Aluno      |");
		System.out.println("|  1 - Adicionar Nota  |");
		System.out.println("|  2 - remover Nota    |");
		System.out.println("|  3 - Listar Notas    |");
		System.out.println("|  4 - Calc Media      |");
		System.out.println("|  5 - Sair            |");
		System.out.println("|----------------------|");
	}

}
