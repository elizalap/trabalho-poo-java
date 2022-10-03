package aplicacao;
import java.util.Locale;
import java.util.Scanner;


import entidades.Cliente;
import entidades.Item;
import entidades.Pedido;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criando classe clientes
		Cliente cliente_1,cliente_2;
		cliente_1 = new Cliente(null, null, null);
		cliente_2 = new Cliente(null, null, null);
		
		// Dados do cliente 1
		
		System.out.println("CLIENTE 01");
		System.out.println("Digite o CPF de cliente 1:");
		cliente_1.cpf = sc.nextLine();
		System.out.println("Digite o nome de cliente 1:");
		cliente_1.nome = sc.nextLine();
		System.out.println("Digite o endereco de cliente 1:");
		cliente_1.endereco = sc.nextLine();
		
		//Dados do cliente 2
		
		System.out.println("CLIENTE 02");
		System.out.println("Digite o CPF de cliente 2:");
		cliente_2.cpf = sc.nextLine();
		System.out.println("Digite o nome de cliente 2:");
		cliente_2.nome = sc.nextLine();
		System.out.println("Digite o endereco de cliente 1:");
		cliente_2.endereco = sc.nextLine();
		
		//Impressao dos dados dos clientes
		System.out.printf("Sobre o cliente 1: Nome = %s, CPF = %s, Endereco = %s \n",cliente_1.nome,cliente_1.cpf,cliente_1.endereco);
		System.out.printf("Sobre o cliente 2: Nome = %s, CPF = %s, Endereco = %s",cliente_2.nome,cliente_2.cpf,cliente_2.endereco);
					
		
		// dados dos pedidos ligados aos clientes
		Pedido pedido_1,pedido_2;
		pedido_1 = new Pedido(null, 0, null, 0);
		pedido_2 = new Pedido(null, 0, null, 0);
		
		System.out.println("Digite os dados do pedido 1");
		System.out.println("Digite o numero:");
		pedido_1.numero = sc.nextInt();
		System.out.println("Digite a data:");
		pedido_1.data = sc.nextLine();
		System.out.println("Digite o valor:");
		pedido_1.valor = sc.nextDouble();
		pedido_1.situacao = "ANALISE";
		
		//DADOS PEDIDO 2
		
		System.out.println("Digite os dados do pedido 2");
		System.out.println("Digite o numero:");
		pedido_2.numero = sc.nextInt();
		System.out.println("Digite a data:");
		pedido_2.data = sc.nextLine();
		System.out.println("Digite o valor:");
		pedido_2.valor = sc.nextDouble();
		
		pedido_2.situacao = "ANALISE";
		
		// adicionar a lista clientes
			System.out.println("digite o numero do pedido do cliente 1");
			System.out.printf("As opcoes sao %d e %d",pedido_1.numero, pedido_2.numero);
			cliente_1.pedidos.add(sc.nextInt());
			
		
		//pedido do cliente 2
			System.out.println("digite o numero do pedido do cliente 2");
			System.out.printf("As opcoes sao %d e %d",pedido_1.numero, pedido_2.numero);
			cliente_2.pedidos.add(sc.nextInt());
			
			// dados dos itens ligados aos pedidos
			Item item_1, item_2;
			item_1 = new Item();
			item_2 = new Item();
			
			// item 1
			
			System.out.println("Digite os dados do item 1:");
			System.out.println("Sequencial:");
			item_1.sequencial = sc.nextInt();
			System.out.println("Quantidade:");
			item_1.qtd = sc.nextInt();
			
			//item 2
			System.out.println("Digite os dados do item 2:");
			System.out.println("Sequencial:");
			item_2.sequencial = sc.nextInt();
			System.out.println("Quantidade:");
			item_2.qtd = sc.nextInt();
			
			//Linkando os itens aos pedidos
			System.out.println("Digite o nomero sequencial do pedido 1:");
			System.out.printf("As opcoes sao %d e %d",item_1.sequencial, item_2.sequencial);
			pedido_1.listaitem.add(sc.nextInt());
			
			// item 2 
			System.out.println("Digite o nomero sequencial do pedido 2:");
			System.out.println("As opcoes sao %d e %d",item_1.sequencial, item_2.sequencial);
			pedido_2.listaitem.add(sc.nextInt());
		
		
		sc.close();
	}
}