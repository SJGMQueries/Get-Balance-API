package com.example.employee.search;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class JerseyRestService {

	@Path("/getBalance/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public SearchResponse getBalance(@PathParam("id") int id) {
		double balance = 0;
		SearchResponse response = new SearchResponse();
		try {
			balance = CustomerDAO.getBalance(id);
			response.setBalance(balance);
			response.setFlag("success");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getLocalizedMessage());
			response.setBalance(0);
			response.setFlag("false");
		}
		return response;

	}

}
