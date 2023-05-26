package principal;

/*import entidades.Aluno; : Importa a classe Aluno do pacote entidades.
 *import entidades.Turma; : Importa a classe Turma do pacote entidades*/

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
	 * O construtor (MenuAluno)recebe um objeto Turma e um objeto Aluno como
	 * parametros e atribui esses valores as variaveis correspondentes.
	 */

	public MenuAluno(Turma turma, Aluno aluno) {
		this.aluno = aluno;
		this.turma = turma;
	}

	/*
	 * O metodo menu() e uma implementacao do metodo abstrato menu() da classe pai.
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
	 * O metodo adicionarNota() e declarado como privado.
	 * 
	 * A mensagem "Qual o cpf do Aluno:" sera exibida no console.
	 * 
	 * Sera lido um valor inteiro da entrada do usuario e armazenado na
	 * variavel cpf.
	 * 
	 * O metodo buscarAluno(cpf) sera chamado na instancia da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * Verifica-se se o aluno e diferente de null. Se o aluno for
	 * diferente de null.
	 * 
	 * O metodo adicionarNota() e chamado no objeto aluno para
	 * adicionar uma nota. Caso contrario ira para, a mensagem,
	 * "Nao foi possivel encontrar o aluno" sera exibida no console.
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
	 * O metodo listarNotas() e declarado como privado.
	 * 
	 * A mensagem "Insira o cpf" sera exibida no console.
	 * 
	 * Sera lido um valor inteiro da entrada do usuario e armazenado na
	 * variavel cpf.
	 * 
	 * A mensagem "_Lista de Notas" sera exibida no console.
	 * 
	 * O metodo buscarAluno(cpf) e chamado na instancia da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 *O metodo listarNotas() e chamado no objeto aluno para exibir as
	 * notas.
	 * 
	 * A mensagem "_____________________" sera exibida no console como
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
	 * O metodo removerNota() e declarado como privado.
	 * 
	 * A mensagem "Insira o cpf" sera exibida no console.
	 * 
	 * Sera lido um valor inteiro da entrada do usuario e armazenado na
	 * variavel cpf.
	 * 
	 * O metodo buscarAluno(cpf) e chamado na instancia da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * O metodo listarNotas() sera chamado no objeto aluno1 para exibir
	 * as notas.
	 * 
	 * Sera lido um valor decimal da entrada do usuario e armazenado na
	 * variavel nota.
	 * 
	 * A mensagem "Qual nota deseja remover?" sera exibida no console.
	 * 
	 * O metodo removerNota(nota) e chamado no objeto aluno1 para
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
	 * O metodo calcularMedia() e declarado como privado.
	 * 
	 * A mensagem "Insira o cpf" sera exibida no console.
	 * 
	 * Sera lido um valor inteiro da entrada do usuario e armazenado na
	 * variavel cpf.
	 * 
	 * O metodo buscarAluno(cpf) sera chamado na instancia da classe
	 * turma para obter o objeto Aluno correspondente ao CPF fornecido.
	 * 
	 * O metodo calcularNota() sera chamado no objeto aluno para calcular
	 * a media das notas.
	 * 
	 * A media sera exibida no console formatada com duas casas decimais
	 * utilizando o printf.
	 * 
	 * Verifica-se se a media e maior ou igual a 6. Se a media for
	 * menor ou igual a 6,
	 * 
	 * A mensagem "Esse Aluno foi Aprovado" sera exibida no console. Caso
	 * contrario,
	 * 
	 * A mensagem "Esse Aluno foi Reprovado" sera exibida no console.
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
			System.out.println("Esse Aluno foi Reprovado");
		}

	}

	/*
	 * A anotacao @Override indica que o metodo esta¡ sobrescrevendo um metodo da
	 * classe pai.
	 *
	 * O metodo listarOpcoes() e declarado como protegido.
	 * 
	 * A mensagem "|----------------------|" sera exibida no console para
	 * decoracao.
	 * 
	 * A mensagem "| Menu Aluno |"sera exibida no console.
	 * 
	 * Sao exibidas as opcoes do menu com numeros e descricao
	 * correspondentes.
	 * 
	 * A mensagem "|----------------------|" sera exibida no console como
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
