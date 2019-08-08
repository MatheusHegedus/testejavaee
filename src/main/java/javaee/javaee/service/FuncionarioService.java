package javaee.javaee.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import javaee.javaee.model.Endereco;
import javaee.javaee.model.Funcionario;


@Stateless
public class FuncionarioService {
	
	public List<Funcionario> buscatudo() {
		List<Funcionario> listadefuncionario = new ArrayList<Funcionario>();
		
		Endereco endereco5 = new Endereco();
		endereco5.setLogradouro("Rua Capitao");
		endereco5.setNumero("1234");
		endereco5.setComplemento("Fundo");
		endereco5.setBairro("Pinheiros");
		
		Funcionario funcionario5 = new Funcionario();
		funcionario5.setCpf(123456789l);
		funcionario5.setNome("João silva");
		funcionario5.setTelefone("(11) 98765-4321");
		funcionario5.setEndereco(endereco5);
		

		listadefuncionario.add(funcionario5);


		return listadefuncionario;

	}

}
