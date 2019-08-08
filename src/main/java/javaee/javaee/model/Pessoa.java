package javaee.javaee.model;

public class Pessoa {

	private String nome;
	private int idade;
	private String email;
	private double altura;
	private long cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [altura=" + altura + ", email=" + email + ", cpf=" + cpf + "]";
	}

}
