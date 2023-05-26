package entidades;

/* Classe Professor no pacote entidades, que herda da classe abstrata Pessoa
 */

public class Professor extends Pessoa {

	/*
	 * - private String especialidade;: Declaração do atributo especialidade, que
	 * representa a area de especialidade do professor.
	 * 
	 * - private String periodo;: Declaracao do atributo periodo, que representa o
	 * periodo em que o professor leciona.
	 * 
	 * - private Disciplina disciplina;: Declaracao do atributo disciplina, que
	 * representa a disciplina lecionada pelo professor.
	 */

	private String especialidade;
	private String periodo;
	private Disciplina disciplina;

	/**
	 * 
	 * - public Professor(String nome, Integer cpf, String especialidade, String
	 * periodo, Disciplina disciplina): Construtor da classe Professor que recebe
	 * como parâmetros o nome, CPF, especialidade, periodo e disciplina do
	 * professor. Utiliza o construtor da superclasse Pessoa para inicializar o nome
	 * e CPF
	 */

	public Professor(String nome, Integer cpf, String especialidade, String periodo, Disciplina disciplina) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.periodo = periodo;
		this.disciplina = disciplina;

	}

	/*- public Professor(String nome, Integer cpf): Construtor vazio da classe 
	 * Professor que recebe apenas o nome e CPF do professor. 
	 * Utiliza o construtor da superclasse Pessoa para inicializar o nome e CPF.*/

	public Professor(String nome, Integer cpf) {
		super(nome, cpf);
	}

	/*
	 * - Metodos getter e setter para os atributos especialidade, periodo e
	 * Disciplina.
	 */

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPEriodo(String periodo) {
		this.periodo = periodo;
	}

	/*- public void Informacao(): Implementacao do metodo abstrato Informacao
	 * herdado da classe Pessoa, que imprime as informacoes do professor.*/

	@Override
	public void Informacao() {
		System.out.println(toString());

	}

	/*- public String toString(): Sobrescrita do metodo toString
	 * para retornar uma representacao em string dos atributos do professor.
	*/

	@Override
	public String toString() {
		return "Professor [nome=" + getNome() + " CPF=" + getCpf() + "especialidade=" + especialidade + ", periodo="
				+ periodo + ", disciplina=" + disciplina + "]";
	}

}
