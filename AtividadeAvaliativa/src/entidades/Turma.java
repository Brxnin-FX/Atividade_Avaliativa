 package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> listaProfessor;
	
	
	
	public Turma() {
		alunos = new ArrayList<>();
		listaProfessor = new ArrayList<>();
	}
	
	
	//metodo para adicionar um aluno para a ArrayList 
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	//metodo para remover um aluno para a ArrayList
	public void removerAluno(int cpf) {
		for(Aluno aluno : alunos) {
			if(cpf == aluno.getCpf()) {
				alunos.remove(aluno);
			}
		}
	}
	
	//metodo para listar os alunos usando o for 
	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Nao tem Alunos na lista");
		}	else {
			for(int i = 0;i < alunos.size(); i++) {
				System.out.println(alunos.get(i));
				}	
				}
		}
	//metodo para editar o codigo da turma e a diciplina da classe aluno
	public void editarInfoAluno(int cpf, String novoCODTURMA, Disciplina novaDISCIPLINA ) {
	for(Aluno aluno : alunos) {
		if(cpf == aluno.getCpf()) {
			aluno.setCodigoTurma(novoCODTURMA);
			aluno.setDisciplinas(novaDISCIPLINA);
		}
	}
	}
	
	
	//Metodos para Professores
	public void procurarProf(int cpf) {
		
		for(Professor professor:listaProfessor) {
			if(cpf == professor.getCpf()) {
				professor.Informacao();
			}
		}
	}
	
	public void AdicionarProfessor(Professor professor) {
		listaProfessor.add(professor);	
	}
	
	public void removerProfessor(int cpf) {
		for(Professor professor : listaProfessor) {
			if(cpf == professor.getCpf()) {
				listaProfessor.remove(professor);
			}
		}
	}
	
	public void listarProfessores() {
		if (listaProfessor.isEmpty()) {
			System.out.println("Nao tem Alunos na lista");
		}	else {
			for(Professor professor : listaProfessor) {
			     professor.Informacao();
				}	
				
		}
	}
	
	
	
	
	
	
	
	
	
}
