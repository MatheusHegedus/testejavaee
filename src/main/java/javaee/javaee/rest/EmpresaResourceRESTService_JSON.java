package javaee.javaee.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javaee.javaee.model.Empresa;
import javaee.javaee.service.EmpresaService;

@Path("/empresa_json")
@RequestScoped
public class EmpresaResourceRESTService_JSON {

	@Inject
	EmpresaService empresaService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Empresa> listAll() {

		return empresaService.allFind();

	}
}
