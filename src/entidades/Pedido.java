package entities;
import java.util.ArrayList;

public class Pedido {

	public Status situacao;
	public int numero;
	private String data;
	private double valor;
	
	private Cliente cliente;
	private ArrayList<Item> listaitem;
	
	public Pedido(Status situacao, int numero, String data, double valor) {
		this.situacao = situacao;
		this.numero = numero;
		this.data = data;
		this.valor = 0;
		this.listaitem = new ArrayList<Item>();
	}

	public Status getSituacao() {
		return situacao;
	}

	public void setSituacao(Status situacao) {
		this.situacao = situacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor += valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getListaItem() {
		return listaitem;
	}
	
	

}