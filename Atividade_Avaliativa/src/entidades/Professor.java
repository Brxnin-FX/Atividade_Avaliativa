package entidades;

public class Professor extends Pessoa{
	
	
	String especialidade;
	String periodo;
	Diciplina diciplina;

	public Professor(String nome, double cpf,String especialidade,String periodo,Diciplina diciplina) {
		super(nome, cpf);
		this.diciplina=diciplina;
		this.especialidade=especialidade;
		this.periodo=periodo;
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

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public String exibirInformacoes() {
		return "Professor [nome ="+nome 
				+ "CPF="+ cpf 
				+"especialidade=" + especialidade 
				+ ", periodo=" + periodo 
				+ ", diciplina=" + diciplina + "]";
	}

	

}
