package entidades;

public abstract class Pessoa {
	protected String nome; 
	protected double cpf;
	
	public Pessoa(String nome,double cpf) {
		this.cpf=cpf;
		this.nome=nome;
	}
	
	public abstract String exibirInformacoes();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	

}
