
/*@Autor: Felipe, Bruno, Gabriela
 * */

package principal;

/*- public class Principal {: Declaracao da classe Principal.*/

public class Principal {

	/*- public static void main(String[] args) {: Declaracao do metodo main,
	 * que e o ponto de entrada do programa. 
	 * Recebe um array de strings args como parametro.*/

	public static void main(String[] args) {

		/*
		 * new MenuPrincipal().menu();: Cria uma instancia da classe MenuPrincipal e
		 * chama o metodo menu(). Isso inicia a execucao do programa.
		 */

		new MenuPrincipal().menu();

		/*
		 * A classe Principal e responsavel por iniciar a execucao do programa,
		 * criando uma instancia da classe MenuPrincipal e chamando o metodo menu().
		 * O restante do codigo relacionado ao menu e suas funcionalidades
		 * esta presente na classe MenuPrincipal.
		 */

	}

}
