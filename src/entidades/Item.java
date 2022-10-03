package entidades;

public class Item {
	
	public int sequencial;
	public int qntd;
	
	public Pedido ped;
	
	public Item(int sequencial, double qtd, Pedido ped, Produto prod) {
		this.sequencial = sequencial;
		this.qtd = qtd;
		this.ped = ped;
		this.prod = prod;
		this.prod.diminuiQtdEstoque(qtd);
	}
		

}
