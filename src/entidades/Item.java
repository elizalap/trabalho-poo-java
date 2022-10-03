package entidades;

public class Item {
	
	public int sequencial;
	public int qntd;
	
	public Pedido pedido;
	
	
	public Item(int sequencial, double qntd, Pedido pedido, Produto prod) {
		this.sequencial = sequencial;
		this.qntd = qntd;
		this.pedido = pedido;
		this.pedido = pedido;
	}
		

}
