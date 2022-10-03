package entidades;

public class Item extends Pedido {
	public Item(int cpf, String nome, String endereço, int numero, int data, String situacao, double valor) {
		super(cpf, nome, endereço, numero, data, situacao, valor);
		// TODO Auto-generated constructor stub
	}
	public int sequencial;
	public int qntd;
		

}
