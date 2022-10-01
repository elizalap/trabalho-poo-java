package entidades;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import entidades.Quadrado;


public class main_project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// testando o quadrado
					Quadrado beta,alpha;
					alpha = new Quadrado();
					beta = new Quadrado();
					// quadrado alpha
					System.out.println("Digite a base e a altura do quadrado");
					System.out.println("Digite a altura do quadrado alpha:");
					alpha.a = sc.nextDouble();
					System.out.println("Digite a base do quadrado alpha:");
					alpha.b = sc.nextDouble();
					// quadrado beta
					System.out.println("Digite a altura do quadrado Beta:");
					beta.a = sc.nextDouble();
					System.out.println("Digite a base do quadrado Beta");
					beta.b = sc.nextDouble();
					// Areas dos quadrados
					double alpha_area = alpha.area();
					double beta_area = beta.area();
					 // prints
					System.out.printf("Area do quadrado alpha = %.2f /n Area do quadrado Beta = %.2f",alpha_area,beta_area);

	}

}
