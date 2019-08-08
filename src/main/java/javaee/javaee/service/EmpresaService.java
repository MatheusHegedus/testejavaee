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

		Endereco endereco5 = new Endereco();

		endereco5.setLogradouro("Av Paulista");
		endereco5.setNumero("1234");
		endereco5.setComplemento("10º Andar");
		endereco5.setBairro("Jardins");
		endereco5.setCidade("São Paulo");
		endereco5.setUf("SP");

		Empresa empresa5 = new Empresa();

		empresa5.setNome("Empresa");
		empresa5.setEndereco(endereco5);
		empresa5.setCnpj("99.999.999/0001-99");
		empresa5.setTelefone("11 9999-9999");
		empresa5.setRepresentante("Mario");

		listadefuncionario.add(empresa5);
		return listadefuncionario;
	}

}
