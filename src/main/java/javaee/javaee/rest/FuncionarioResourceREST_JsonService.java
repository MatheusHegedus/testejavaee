package javaee.javaee.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javaee.javaee.model.Funcionario;
import javaee.javaee.service.FuncionarioService;

@Path("/funcionario_json")
@RequestScoped
public class FuncionarioResourceREST_JsonService {
	
	@Inject
	FuncionarioService funcionarioService;
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Funcionario> todosFuncionarios(){
		
		
		return funcionarioService.buscatudo();
		
		
	}
		
	
}
