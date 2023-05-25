package principal;

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Turma;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("n",500,"1mds",Disciplina.FPOO);
	
		Aluno aluno2 = new Aluno("B",700,"1mds",Disciplina.FPOO);
		Turma turma = new Turma();
		MenuAluno menuAl = new MenuAluno(turma, aluno1);
		
		
		turma.adicionarAluno(aluno1);
		turma.adicionarAluno(aluno2);
		
		aluno1.adicionarNota();
		aluno1.listarNotas();
		
		
		
		
		
	
	}

}
