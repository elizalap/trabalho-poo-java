package entidades;

import entidades.Cliente;

public class ClienteEspecial extends Cliente{

	public String area;
	
	public ClienteEspecial(String cpf, String nome, String endereco, String area) {
		super(cpf, nome, endereco);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "ClienteEspecial [area=" + area + "]";
	}
	
	

}
