/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dish.services;

import com.dish.app.PIDPlatformException;
import com.dish.controller.ProjectController;
import com.dish.models.Projects;
import com.dish.models.ResponseWS;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author cperalta
 */
@Path("/auth/projectos")
public class ServicesResourceAuth {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PizzasRecurso
     */
    public ServicesResourceAuth() {
    }

    /**
     * Retrieves representation of an instance of pizzaPackage.ServicesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public ResponseWS getXml() throws PIDPlatformException {
        //TODO return proper representation object
//        return "<dato>Ejemplo coleccion</dato>";
        ResponseWS rs;
        Projects exp= new ProjectController().findProject();
        System.out.println(exp.getName());
        if(exp.getName()!= null)
        rs= new ResponseWS(200, "PeticionCompleta", exp);
        else
        rs= new ResponseWS(400, "El id de usuario no existe");   

        return rs;
    }

    /**
     * POST method for creating an instance of ProjectRecurso
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    public Response postXml(String content) {
        //TODO
//        return Response.created(context.getAbsolutePath()).build();
          System.out.println("por aqui");
          return Response.ok().build();
    }

   
}
