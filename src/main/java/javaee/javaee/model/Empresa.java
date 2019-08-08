package javaee.javaee.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Empresa {

	private String nomes1;
	private Endereco endereco;
	private String cnpj;
	private String telefone;
	private String representante;

	public String getNome() {
		return nomes1;
	}

	public void setNome(String nome) {
		this.nomes1 = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}
}
