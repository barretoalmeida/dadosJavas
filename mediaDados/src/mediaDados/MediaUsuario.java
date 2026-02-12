/**
 * 
 */
package mediaDados;
import java.util.Scanner;

/**
 * 
 */
public class MediaUsuario {

	/**
	 * @author gabriely.barreto
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a sua segunda nota:");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Digite a sua terceira nota:");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Digite a sua quarta nota:");
		double nota4 = scanner.nextDouble();
		System.out.println("");
		
		double media = (nota1+ nota2 + nota3 + nota4 ) /4;
		
		if (media>=7) {
			System.out.println("A sua media final é " +media+ " Você foi aprovado :)");
		}else if (media>=5) {
			System.out.println("A sua media final é "+media+ " Você está de recuperação");
		}else {
			System.out.println("A sua media final é "+media+ " Você foi reprovado :(");
		}
		
		System.out.println("");
		
		scanner.close();

	}

}
