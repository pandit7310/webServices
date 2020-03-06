package com.niit.martian.myrest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("countries")
public class CountryResource {
	
	CountryService cs=new CountryService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries()
	{
		List loc=cs.getAllCountries();
		return loc;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id")int id)
	{
		return cs.getCountry(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country updateCountry(Country country)
	{
	return cs.updateCountry(country);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteteCountry(@PathParam("id")int id)
		{
		cs.deleteCountry(id);
		}
}
