package com.ps.tutorial.rest.controllers;

import com.ps.tutorial.rest.data.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexController {

    @GET @Path("greet") @Produces(MediaType.APPLICATION_JSON)
    public Greeting greet(@QueryParam("name") String name) {
        return new Greeting("Hello", name);
    }

}
