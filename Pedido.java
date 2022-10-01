package entidades;

public class Pedido extends Cliente {
		public int numero;
		public int data;
		public String situacao;
		public double valor;
			public Pedido(int cpf, String nome, String endereço, int numero, int data, String situacao, double valor) {
				super(cpf,nome,endereço);
				this.numero = numero;
				this.data = data;
				this.situacao = situacao;
				this.valor = valor;
			}
}
