/**
 * 
 */
package insercaodedados;
import java.util.Scanner;

/**
 * 
 */
public class LeituraTeclado {

	/**
	 * @author gabriely.barreto
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		// Scanner: é uma classe da biblioteca padrão do Java usada para ler dados de entrada (como numeros, textos e etc)
		
		//scanner: é o nome da variável que estamos criando, que vai armazenar o objeto responsável pela a leitura
		
		// newScanner: (System.in): cria um novo objeto Scanner que vai ler dados a partir da entrada padrão do sistema, ou seja, o teclado
		
		// lendo um número inteiro
		
		System.out.println("Digite um número inteiro");
		int numero =  scanner.nextInt() ;
		
		//Limpando o buffer antes de ler uma String
		
		System.out.println("Digite o seu nome ");
		String nome = scanner.next(); //quando for nexline é para a String como texto.
		
		
		System.out.println("Número digitado: "+numero);
		System.out.println("O nome digitado: "+nome);
		
		scanner.close();
		
		//Sempre limpe o buffer com nextline() após utilizar métados como nextint() ou nextDouble()

	}

}
