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

		Empresa empresa9 = new Empresa();

		empresa9.setNome("Empresa Nova");
		empresa9.setEndereco(endereco5);
		empresa9.setCnpj("99.999.999/0001-99");
		empresa9.setTelefone("11 9999-9999");
		empresa9.setRepresentante("Mario");

		listadefuncionario.add(empresa9);
		return listadefuncionario;
	}

}
