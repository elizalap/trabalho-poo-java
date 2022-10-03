package entidades;
import java.lang.Math;

public class Cliente {
	public String cpf;
	public String nome;
	public String endereco;
	
	public Cliente(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = null;
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the endereço
	 */
	public String getEndereço() {
		return endereco;
	}

	/**
	 * @param endereço the endereço to set
	 */
	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	

}