/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.apirest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Administrateur
 */
@Path("/bonjour")
public class BonjourResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BonjourResource
     */
    public BonjourResource() {
    }

    /**
     * Retrieves representation of an instance of com.rachelmartin.apirest.BonjourResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
      return "<texte>BONJOUR l'API</texte>";
    }

    /**
     * PUT method for updating or creating an instance of BonjourResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {

    }
}
