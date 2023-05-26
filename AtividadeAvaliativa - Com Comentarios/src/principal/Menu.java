package principal;

/*Essa classe serve como uma estrutura base 
 * para implementar diferentes menus.*/


/*import java.util.Scanner;: Importa a classe Scanner do pacote java.util, 
 * que sera usada para ler a entrada do usuario.
 import entidades.Aluno;: Importa a classe Aluno do pacote entidades.
 import entidades.Professor;: Importa a classe Professor do pacote entidades.
 import entidades.Turma;: Importa a classe Turma do pacote entidades.*/

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;


/*A classe Menu e declarada como abstract, 
 * o que significa que nao pode ser instanciada diretamente, 
 * mas serve como base para outras classes que a estendem.
*/

public abstract class Menu {
	
/*protected final Scanner entrada = new Scanner(System.in);: 
 * Declara uma variavel protegida
*(acessïvel pelas classes filhas) chamada entrada do tipo Scanner,
* que sera usada para ler a entrada do usuario a partir do sistema de entrada
* padrao (System.in).*/
		
	protected final Scanner entrada = new Scanner(System.in);
	
	/*protected int opcao;: Declara uma variavel protegida chamada opcao
	* do tipo int, que sera usada para armazenar a opcao escolhida pelo 
	* usuario.
	* */
	protected int opcao;
	
	
	/*public abstract void menu();: Declara um metodo abstrato chamado menu()
	* que sera implementado nas classes filhas. 
	* Esse metodo representa o menu principal do programa.*/
	
	public abstract void menu();
	
	
	/*protected abstract void listarOpcoes();`: Declara um metodo abstrato 
	 * chamado listarOpcoes(), que sera implementado nas classes filhas. 
	 * Esse metodo  responsavel por listar as opcoes disponiveis no menu.*/
	
	protected abstract void listarOpcoes();

}
