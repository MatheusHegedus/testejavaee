package javaee.javaee.service;

import java.util.ArrayList;
import java.util.List;
import javaee.javaee.model.Endereco;
import javaee.javaee.model.Fornecedores;

public class FornecedoresService {
	
	public List<Fornecedores> findAll(){
	
		List<Fornecedores> listaFornec = new ArrayList<Fornecedores>();
		
		Endereco end5 = new Endereco();
		end5.setBairro("Jardins");
		end5.setComplemento("Bloco C");
		end5.setLogradouro("Rua dos Pineheiros");
		end5.setNumero("485");
		
		Fornecedores fornec8 = new Fornecedores();
		fornec8.setNome("Empresa de Adesivos");
		fornec8.setCnpj("12302914660");
		fornec8.setTelefone("98462-2119");
		fornec8.setEndereco(end5);
	
		listaFornec.add(fornec8);
		
		return listaFornec;
	
	}
}
