package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*Classe Aluno no pacote entidades, que herda da classe abstrata Pessoa
*/

public class Aluno extends Pessoa {

	/*
	 * private Turma turma;: Declaracao de um atributo turma, que representa a 
	 * turma a qual o aluno esta associado.
	 */

	private Turma turma;

	/*
	 * - private String codigoTurma;: Declaracao de um atributo codigoTurma, que
	 * representa o codigo da turma do aluno.
	 * 
	 * - private Disciplina disciplinas;: Declaracao de um atributo disciplinas, 
	 * que representa a disciplina do aluno. E utilizado o tipo Disciplina, que
	 * provavelmente e uma enumeracao.
	 * 
	 * - private ArrayList<Double> notas;: Declaracao de um atributo notas, que
	 * representa as notas do aluno. E uma lista de valores Double.
	 */
	private String codigoTurma;
	private Disciplina disciplinas;
	private ArrayList<Double> notas;

	/*
	 *- public Aluno(String nome, Integer cpf, String codigoTurma, Disciplina
	 * disciplinas): Construtor da classe Aluno que recebe varios parametros para
	 * instanciar um objeto Aluno com os valores fornecidos.
	 */

	Scanner entrada = new Scanner(System.in);

	public Aluno(String nome, Integer cpf, String codigoTurma, Disciplina disciplinas) {
		super(nome, cpf);
		this.codigoTurma = codigoTurma;

		this.disciplinas = disciplinas;
		notas = new ArrayList<Double>();

	}

	/*
	 *- public ArrayList<Double> getNotas(): Metodo getter para obter a lista de
	 * notas do aluno.
	 */

	public ArrayList<Double> getNotas() {
		return notas;
	}

	/*- public void setNotas(ArrayList<Double> notas): Metodo setter para 
	 * definir a lista de notas do aluno.*/

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	/*- public Aluno(String nome, Integer cpf): Construtor padrao da classe 
	 * Aluno que recebe apenas o nome e o CPF.*/

	public Aluno(String nome, Integer cpf) {
		super(nome, cpf);
	}

	/*
	 * Getters e setters: Metodos de acesso para os atributos codigoTurma e
	 * disciplinas, permitindo obter e definir seus valores.
	 */

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public Disciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}

	/*- public ArrayList<Double> adicionarNota(): Metodo para adicionar notas a
	 * lista de notas do aluno. Solicita ao usuário a quantidade de notas 
	 * a serem adicionadas e, em seguida, solicita cada nota individualmente.
	*/

	public ArrayList<Double> adicionarNota() {
		ArrayList<Double> notaAserAdd = new ArrayList<>();
		System.out.println("Quantas notas deseja adicionar? ");
		int qtdNota = entrada.nextInt();
		for (int i = 0; i < qtdNota; i++) {
			System.out.println("Nota " + i);
			double notaAdd = entrada.nextDouble();
			notaAserAdd.add(notaAdd);
			System.out.println("Nota adicionada...");
		}
		return notaAserAdd;
	}

	/*- public void removerNota(Double nota): Metodo para remover 
	 * uma nota especifica da lista de notas do aluno.*/

	public void removerNota(Double nota) {
		notas.remove(nota);
	}

	/*- public void listarNotas(): Metodo para listar as notas do aluno*/

	public void listarNotas() {
		System.out.println("Notas: " + notas);
	}

	/*
	 * - public Double calcularNota(): Metodo para calcular a media das notas do
	 * aluno. Percorre a lista de notas e realiza a soma dos valores, em seguida,
	 * divide a soma pelo número de notas para obter a media.
	 */

	public Double calcularNota() {
		Double media;
		Double soma = 0.0;

		for (Double n : notas) {
			soma = n.doubleValue() + soma;
		}
		media = soma / notas.size();

		return media;

	}

	/*- @Override public String toString(): Sobrescrita do metodo toString()
	 * para retornar uma representação em formato de string dos dados do aluno,
	 * incluindo o nome, CPF, codigo da turma, disciplinas e notas.*/

	@Override
	public String toString() {
		return "Aluno [nome=" + getNome() + " CPF=" + getCpf() + "   codigoTurma=" + codigoTurma + ", disciplinas="
				+ disciplinas + ", notas=" + notas + "]";
	}

	/*- @Override public void Informacao(): Implementacao do metodo abstrato
	 * Informacao() herdado da classe Pessoa. Imprime as informacoess do aluno
	 * usando o metodo toString().
	*/

	@Override
	public void Informacao() {

		System.out.println(toString());
	}

}
