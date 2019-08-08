package javaee.javaee.model;

import javaee.javaee.model.Endereco;

public class Fornecedores {
	
//atributos
	
	private String nomE;
	
	private String telefone;
	
	private String cnpj;
	
	private Endereco endereco;
	
	
// Getters and Setters
	
	public String getNome() {
		return nomE;
	}

	public void setNome(String nome) {
		this.nomE = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
