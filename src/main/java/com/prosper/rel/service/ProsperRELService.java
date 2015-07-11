package com.prosper.rel.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
 
@Path("/")
public class ProsperRELService {
	
	@GET
	@Path("/{pathParameter}")
	public Response responseMsg( @PathParam("pathParameter") String pathParameter,
			@DefaultValue("Nothing to say") @QueryParam("queryParameter") String queryParameter) {

		String response = "pathParameter: " + pathParameter + " ;queryParameter: " + queryParameter;

		return Response.status(200).entity(response).build();
	}
	
}
