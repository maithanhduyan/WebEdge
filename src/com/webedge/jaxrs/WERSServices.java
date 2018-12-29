/**
 * WebEdge 2018
 */
package com.webedge.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Mai Thành Duy An
 */
@Path("/")
public class WERSServices {
	
	@GET
	@Path("/hello/{msg}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(@PathParam(value = "msg") String msg) {
		return "Hello " + msg;
	}
}
