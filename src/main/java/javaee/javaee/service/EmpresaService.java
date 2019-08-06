package javaee.javaee.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import javaee.javaee.model.Empresa;
import javaee.javaee.model.Endereco;

@Stateless
public class EmpresaService {

	public List<Empresa> allFind() {
		List<Empresa> listadefuncionario = new ArrayList<Empresa>();

		Endereco endereco1 = new Endereco();

		endereco1.setLogradouro("Av Paulista");
		endereco1.setNumero("1234");
		endereco1.setComplemento("10º Andar");
		endereco1.setBairro("Jardins");
		endereco1.setCidade("São Paulo");
		endereco1.setUf("SP");

		Empresa empresa1 = new Empresa();

		empresa1.setNome("Empresa");
		empresa1.setEndereco(endereco1);
		empresa1.setCnpj("99.999.999/0001-99");
		empresa1.setTelefone("11 9999-9999");
		empresa1.setRepresentante("Mario");

		listadefuncionario.add(empresa1);
		return listadefuncionario;
	}

}
