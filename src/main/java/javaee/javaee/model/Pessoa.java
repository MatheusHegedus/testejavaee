package javaee.javaee.model;

public class Pessoa {	
	
	double altura;
	String email;
	long cpf;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
