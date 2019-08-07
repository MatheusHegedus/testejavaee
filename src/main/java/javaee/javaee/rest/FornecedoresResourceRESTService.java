package javaee.javaee.rest;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javaee.javaee.model.Fornecedores;
import javaee.javaee.service.FornecedoresService;

@Path("/Fornecedores")
@RequestScoped
public class FornecedoresResourceRESTService {
	
	@Inject
	FornecedoresService fornecedoresService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedores> obtemTodosFornecedores(){
			
		return fornecedoresService.findAll();
			
	}
		
}



