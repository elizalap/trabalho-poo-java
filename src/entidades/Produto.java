package entities;

public class Produto{
	
	private int codigo;
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public Produto(int codigo, String nome, double preco, int qtdEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public int adicionarQntEstoque (int qntd) {
		return qtdEstoque += qntd;
	}
	
	public int diminuirQntEstoque (int qntd) {
		return qtdEstoque -= qntd;
	}
}

