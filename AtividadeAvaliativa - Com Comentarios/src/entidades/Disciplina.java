/*Enum chamado Disciplina no pacote entidades.*/

package entidades;

/*/*O Enum herda todos os atributos
 * e metodos da classe Pessoa.*/

public enum Disciplina {

	/*
	 * FPOO("Fundamentos de Programacao Oriebtada a Objetos"),
	 * LM("Linguagem de Maracacao"), SO("Sistema Operacional"), REDES("Redes");`:
	 * Declaração dos valores do enum. São quatro disciplinas representadas por
	 * constantes: FPOO com o valor
	 * "Fundamentos de Programacao Oriebtada a Objetos", LM com o valor
	 * "Linguagem de Maracacao", SO com o valor "Sistema Operacional" e REDES com o
	 * valor "Redes".
	 */

	FPOO("fpoo"), LM("lm"), SO("Sistema Operacional"), REDES("Redes");

	private String materias;

	/*
	 *- private Disciplina(String mateira): Construtor do enum Disciplina que recebe
	 * um parametro para instanciar um objeto Disciplina com o valor fornecido.
	 */

	private Disciplina(String materia) {
		this.materias = materia;
	}

	/*
	 * - public String getMaterias(): Metodo getter para obter o nome da
	 * disciplina.
	 */

	public String getMaterias() {
		return materias;
	}

}
