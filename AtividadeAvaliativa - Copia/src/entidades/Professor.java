package entidades;



public class Professor extends Pessoa {
	//variaveis
	private String especialidade;
	private String periodo;
	private Disciplina disciplina;
	
	
	
	//construtor
	public Professor(String nome, Integer cpf, String especialidade, String periodo, Disciplina disciplina) {
		super(nome,cpf);
		this.especialidade = especialidade;
		this.periodo = periodo;
		this.disciplina = disciplina;
		
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
	//construtor vazio
	public Professor(String nome, Integer cpf) {
		super(nome,cpf);
	}
	
	
	//gets e sets
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
	@Override
	public void Informacao() {
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "Professor [nome="+getNome() +" CPF="+ getCpf() + "especialidade=" + especialidade + ", periodo=" + periodo + ", disciplina=" + disciplina
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
}
