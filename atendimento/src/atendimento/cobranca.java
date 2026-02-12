/**
 * 
 */
package atendimento;
import java.util.Scanner;

/**
 * 
 */
public class cobranca {

	/**
	 *@author gabriely.barreto 
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Banco do Brasil");
		System.out.println("");
		System.out.println("O valor do saldo: 1000,00");
		double saldo = 1000.00;
		System.out.println("");
		
		System.out.println("Digite 1 para: Retirada ");
		System.out.println("");
		System.out.println("Digite 2 para: Deposito");
		int retirada = scanner.nextInt();
		System.out.println("");
		
		
		switch (retirada) {
		case 1:
			System.out.println("Deposite um valor:");
			double deposito = scanner.nextDouble();
			if (deposito<=0) {
				System.out.println("O deposito de valor 0,00 não pode ser efeituado");
			} else {
				System.out.println("O deposito foi concluido ");
				System.out.println("O saldo atual é: " + (saldo+deposito));
			}
			break;
		case 2:
			System.out.println("Retirada de valor: ");
			double retirar = scanner.nextDouble();
			if (retirar>=saldo) {
				System.out.println("A retirada do valor não pode ser concluida");
			} else {
				System.out.println("Retirada concluida ");
				System.out.println("O valor atual é: " + (saldo-retirar));
			}
			break;
		default:
			System.out.println("Escolha um campo!!");
			break;
		}
		
		

	}

}
