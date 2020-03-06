package com.niit.martian.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class Hello {
@GET
@Produces(MediaType.TEXT_PLAIN)

public String sayPlainTextHello() {
										return "Hello Jersey Plain";
								  }


@GET
@Path("/xmlhello")
@Produces(MediaType.TEXT_XML)

public String sayXmlHello() {

						return "<?xml version=\"1.0\"?>"+"<hello>Hello Jersey"+"</hello>";

						    }



@GET
@Path("/HTMLlhello")
@Produces(MediaType.TEXT_HTML)

public String sayHTMLHello() {

						return"<HTML>"+"<TITLE>"+"<Hello Jersey>"+"</TITLE>"+"<BODY>"
						+"<h1>"+"Hello Jersey HTML"+"</h1></BODY>"+"</HTML>";

						    }








}