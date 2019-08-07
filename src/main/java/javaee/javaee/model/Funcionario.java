package javaee.javaee.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Funcionario {
	
	
	private Endereco endereco;
	private Long cpf;
	private String nome;
	private String telefone;
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String i) {
		this.telefone = i;
	}
}
