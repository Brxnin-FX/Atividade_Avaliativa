package entidades;

import java.util.ArrayList;

public class Professor extends Pessoa {
	//variaveis
	private String especialidade;
	private String periodo;
	private Disciplina disciplina;
	private ArrayList<Professor> listaProf = new ArrayList<Professor>();;
	
	
	//construtor
	public Professor(String nome, Integer cpf, String especialidade, String periodo, Disciplina disciplina) {
		super(nome,cpf);
		this.especialidade = especialidade;
		this.periodo = periodo;
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
	
	//metodo abstract
	@Override
	public void Informacao() {
		Professor prof = new Professor();
		System.out.println(super.toString());
		System.out.println("Especialidade: "+ prof.getEspecialidade());
		System.out.println("Periodo: "+prof.getPeriodo());
		System.out.println("Disciplina: "+prof.getDisciplina());
		
	}
	
	public void addProfessor(Professor professor) {
		listaProf.add(professor);
		System.out.println("Professor adicionado");
	}
	
	public void buscarProf(String nome){
		for(Professor professor : listaProf) {
			if(nome == professor.getNome()) {
				System.out.println(super.toString());
				System.out.println("Especialidade: "+ professor.getEspecialidade());
				System.out.println("Periodo: "+professor.getPeriodo());
				System.out.println("Disciplina: "+professor.getDisciplina());
				
			}
			else {
				System.out.println("Nao foi possivel encontrar esse professor");
			}
		}
	}
	
	
}
