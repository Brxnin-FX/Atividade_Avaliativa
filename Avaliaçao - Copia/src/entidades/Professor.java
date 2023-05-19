package entidades;

public class Professor extends Pessoa {
	//variaveis
	private String especialidade;
	private String periodo;
	private Disciplina disciplina;
	
	
	//construtor
	public Professor(String nome, int cpf, String especialidade, String periodo, Disciplina disciplina) {
		super(nome,cpf);
		this.especialidade = especialidade;
		this.periodo = periodo;
		this.disciplina = disciplina;
	}
	//construtor vazio
	public Professor(String nome, int cpf) {
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
	
	//metodo abstract
	@Override
	public void Informacao() {
		System.out.println(super.toString());
		System.out.println("Especialidade: "+especialidade);
		System.out.println("Periodo: "+periodo);
		System.out.println("Disciplina: "+disciplina);
		
	}
	
}
