package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criando classe clientes
		Cliente cliente_1,cliente_2;
		cliente_1 = new Cliente(null, null, null);
		cliente_2 = new Cliente(null, null, null);
		
		// Dados do cliente 1
		
		System.out.println("Digite os dados do cliente 1");
		System.out.println("Digite o CPF de cliente 1:");
		cliente_1.cpf = sc.nextLine();
		System.out.println("Digite o nome de cliente 1:");
		cliente_1.nome = sc.nextLine();
		System.out.println("Digite o endereco de cliente 1:");
		cliente_1.endereco = sc.nextLine();
		
		//Dados do cliente 2
		
		System.out.println("Digite os dados do cliente 2");
		System.out.println("Digite o CPF de cliente 2:");
		cliente_2.cpf = sc.nextLine();
		System.out.println("Digite o nome de cliente 2:");
		cliente_2.nome = sc.nextLine();
		System.out.println("Digite o endereco de cliente 1:");
		cliente_2.endereco = sc.nextLine();
		
		//Impressao dos dados dos clientes
		System.out.printf("Sobre o cliente 1: Nome = %s, CPF = %s, Endereco = %s \n",cliente_1.nome,cliente_1.cpf,cliente_1.endereco);
		System.out.printf("Sobre o cliente 2: Nome = %s, CPF = %s, Endereco = %s",cliente_2.nome,cliente_2.cpf,cliente_2.endereco);
						
	}
}