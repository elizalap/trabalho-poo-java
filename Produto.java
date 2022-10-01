package entidades;

public class Produto extends Item {
	

	public Produto(int cpf, String nome, String endereço, int numero, int data, String situacao, double valor) {
		super(cpf, nome, endereço, numero, data, situacao, valor);
		// TODO Auto-generated constructor stub
	}
	public int codigo;
	public String nome;
	public int preco;
	public int qntdestoque;

	
	
}
