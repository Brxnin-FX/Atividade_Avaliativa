/* Classe abstrata chamada Pessoa no pacote entidades.*/

package entidades;

public abstract class Pessoa {

	/*
	 * - protected String nome;: Declaracao de um atributo protegido chamado nome,
	 * que representa o nome da pessoa. 
	 * - protected Integer cpf;: Declaracao de um atributo protegido chamado cpf,
	 * que representa o CPF da pessoa.
	 */

	protected String nome;
	protected Integer cpf;

	/*
	 *- public Pessoa(String nome, Integer cpf): Construtor da classe Pessoa que
	 * recebe dois parametros: nome e cpf para instanciar um objeto Pessoa com
	 * os valores fornecidos.
	 */

	public Pessoa(String nome, Integer cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	/*
	 * Getters e setters: Metodos de acesso para os atributos nome e cpf,
	 * permitindo obter e definir seus valores.
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	/*
	 * @Override public String toString(): Sobrescrita do metodo toString() para
	 * retornar uma representacao em formato de string dos dados da pessoa,
	 * incluindo o nome e o CPF.
	 */

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + "\ncpf: " + cpf + "]";
	}

	/*
	 * public abstract void Informacao();: Declaracao de um metodo abstrato chamado
	 * Informacao(). O metodo abstrato nao possui implementacao nesta classe e
	 * deve ser implementado por qualquer classe que herde Pessoa. Isso significa
	 * que toda classe que herdar de Pessoa e obrigada a implementar esse metodo.
	 */
	public abstract void Informacao();

}
