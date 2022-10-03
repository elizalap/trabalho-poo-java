package entities;
import entities.Pedido;

public class Item extends Pedido {

	public void Pedido(int numero, Status situacao,String data, double valor) {
		super(numero,situacao,data,valor);
	}
	
	public int sequencial;
	public int qtd;
	

		
	public void Item(int sequencial, int qtd) {
		
		this.sequencial = sequencial;
		this.qtd = qtd;
		// TODO Auto-generated constructor stub
	}
	
		

}
