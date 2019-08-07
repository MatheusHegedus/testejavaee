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
		
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Capitao");
		endereco1.setNumero("1234");
		endereco1.setComplemento("Fundo");
		endereco1.setBairro("Pinheiros");
		
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf(123456789l);
		funcionario1.setNome("João silva");
		funcionario1.setTelefone("(11) 98765-4321");
		funcionario1.setEndereco(endereco1);
		
		listadefuncionario.add(funcionario1);

		return listadefuncionario;

	}

}
