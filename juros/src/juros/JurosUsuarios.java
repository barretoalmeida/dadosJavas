/**
 * 
 */
package juros;
import java.util.Scanner;

/**
 * 
 */
public class JurosUsuarios {

	/**
	 * @author gabriely.barreto
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Juros Simples e Juros Compostos");
		
		System.out.println("Digite o seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o Capital");
		double capital = scanner.nextDouble();
		
		System.out.println("Digite o Tempo");
		double tempo = scanner.nextDouble();
		
		System.out.println("Digite a taxa de Juros");
		double juros = scanner.nextDouble();
		
		
		//double taxa = juros/100;
		double js = capital * tempo * (tempo/100);
		String fr = String.format("%.2f", js);
		double jc = capital * Math.pow((1+ (tempo/100)), tempo);
		String fmat = String.format("%.2f", jc);
		
		System.out.println("");
		System.out.println("Nome: "+nome);
		System.out.printf("Se o valor for aplicado em Juros Simples será: %.2f: ",js);
		System.out.println("");
		System.out.printf("Se o valor for aplicado em Juros Compostos será: %.2f ",jc);
		System.out.println("");
		
		scanner.close();
		
	}

}
