package entidades;
/**
 * 
 * @author Aluno will
 * class abstrata
 * 
 * aqui temos as variaveis nome e cpf e um construtor exigindo elas 
 * tambem temos gets e sets e um toString(Para exibir os dados de Pessoa)
 * e o metodo abstract
 * 
 *
 */
public abstract class Pessoa {
	//atributos
	protected String nome;
	protected Integer cpf;
	
	/*
	 * construtor para instanciar os seguintes parametros
	 * e cpf 
	 */
	
	public Pessoa(String nome, Integer cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//gets e sets
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
	
	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + "\ncpf: " + cpf + "]";
	}

	//metodo abstrato
	public abstract void Informacao();

	
	
	

}
