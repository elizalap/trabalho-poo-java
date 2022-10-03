package entidades;

public class Pedido {

	private String situacao;
	private int numero;
	private String data;
	private double valor;

	public Pedido(String situacao, int numero, String data, double valor) {
		this.situacao = situacao;
		this.numero = numero;
		this.data = data;
		this.valor = 0;
	}
}
