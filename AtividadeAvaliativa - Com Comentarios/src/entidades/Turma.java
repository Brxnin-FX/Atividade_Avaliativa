/*a classe Turma no pacote entidades. Essa classe representa uma turma e 
 *contem uma lista de alunos e uma lista de professores.*/

package entidades;

import java.util.ArrayList;

/*- private ArrayList<Aluno> alunos;: Declaracao do atributo alunos, que e uma
 * lista de objetos do tipo Aluno.
  - private ArrayList<Professor> listaProfessor;: Declaracao do atributo
   listaProfessor, que e uma lista de objetos do tipo Professor`.
*/

public class Turma {
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> listaProfessor;

	/*- public Turma(): Construtor da classe Turma que inicializa as listas
	 * de alunos e professores.*/

	public Turma() {
		alunos = new ArrayList<>();
		listaProfessor = new ArrayList<>();
	}

	/*- public void adicionarAluno(Aluno aluno): Metodo para adicionar um objeto
	 *  Aluno a lista de alunos.
	*/
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	/*- public void removerAluno(int cpf): Metodo para remover um aluno da
	 * lista de alunos com base no CPF. Percorre a lista de alunos e remove
	 * o aluno cujo CPF corresponda ao valor fornecido.*/

	public void removerAluno(int cpf) {
		if (!alunos.isEmpty()) {
			for (int i = 0; i < alunos.size(); i++) {
				if (alunos.get(i).cpf == cpf) {
					alunos.remove(alunos.get(i));
					System.out.println("Aluno removido...");
				}
			}
		} else {
			System.out.println("Lista de Alunos Vazia !");
		}

	}

	/*- public void listarAlunos(): Metodo para listar os alunos presentes
	 * na turma. Percorre a lista de alunos e imprime as informacoes
	 * de cada aluno.*/

	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Nao tem Alunos na lista");
		} else {
			for (int i = 0; i < alunos.size(); i++) {
				System.out.println(alunos.get(i));
			}
		}
	}

	/*- public void editarInfoAluno(int cpf, String novoCODTURMA,
	 * Disciplina novaDISCIPLINA): 
	 * Metodo para editar as informacoes de um aluno na turma. 
	 * Percorre a lista de alunos, encontra o aluno com base no CPF fornecido 
	 * e atualiza o código da turma e a disciplina do aluno.*/

	public void editarInfoAluno(int cpf, String novoCODTURMA, Disciplina novaDISCIPLINA) {
		for (Aluno aluno : alunos) {
			if (cpf == aluno.getCpf()) {
				aluno.setCodigoTurma(novoCODTURMA);
				aluno.setDisciplinas(novaDISCIPLINA);
			}
		}
	}

	/*- public Aluno buscarAluno(int cpf): Metodo para buscar um aluno na turma
	 * com base no CPF. Percorre a lista de alunos e retorna o objeto
	 *  Aluno correspondente ao CPF fornecido.*/

	public Aluno buscarAluno(int cpf) {
		for (Aluno aluno : alunos) {
			if (cpf == aluno.getCpf()) {
				return aluno;
			}
		}
		return null;
	}

	/*
	 * - public void procurarProf(int cpf): Metodo para procurar um professor na
	 * turma com base no CPF. Percorre a lista de professores, encontra o professor
	 * com o CPF fornecido e chama o metodo Informacao() para exibir as informacoes
	 * do professor.
	 */

	public void procurarProf(int cpf) {

		for (Professor professor : listaProfessor) {
			if (cpf == professor.getCpf()) {
				professor.Informacao();
			}
		}
	}

	/*- public void AdicionarProfessor(Professor professor): Metodo para 
	 * adicionar um objeto Professor a lista de professores.*/

	public void AdicionarProfessor(Professor professor) {
		listaProfessor.add(professor);
	}

	/*- public Professor buscarProf(int cpf): Metodo para buscar um professor
	 * na turma com base no CPF. Percorre a lista de professores e 
	 * retorna o objeto Professor correspondente ao CPF fornecido.*/

	public Professor buscarProf(int cpf) {
		for (Professor professor : listaProfessor) {
			if (cpf == professor.getCpf()) {
				return professor;
			}
		}
		return null;

	}

	/*- public void removerProfessor(int cpf): Metodo para remover um professor
	 * da lista de professores com base no CPF. 
	 * Percorre a lista de professores e remove o professor cujo CPF 
	 * corresponda ao valor fornecido.*/

	public void removerProfessor(int cpf) {
		if (!listaProfessor.isEmpty()) {
			for (int i = 0; i < listaProfessor.size(); i++) {
				if (listaProfessor.get(i).cpf == cpf) {
					listaProfessor.remove(listaProfessor.get(i));
					System.out.println("Professor Removido");
				}
			}
		} else {
			System.out.println("Lista de Professores esta vazia !");
		}
	}

	/*- public void listarProfessores(): Metodo para listar os professores
	 * presentes na turma. Percorre a lista de professores e chama o metodo
	 *  Informacao() para exibir as informacoes de cada professor.*/

	public void listarProfessores() {
		if (listaProfessor.isEmpty()) {
			System.out.println("Nao tem Professores na lista");
		} else {
			for (Professor professor : listaProfessor) {
				professor.Informacao();
			}

		}
	}
}
