/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.apirest;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Administrateur
 */
public class DvdResource {

    private String id;

    /**
     * Creates a new instance of DvdResource
     */
    private DvdResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the DvdResource
     */
    public static DvdResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of DvdResource class.
        return new DvdResource(id);
    }

    /**
     * Retrieves representation of an instance of com.rachelmartin.apirest.DvdResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
return "{DVD : " + this.id + "}";
    }

    /**
     * PUT method for updating or creating an instance of DvdResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource DvdResource
     */
    @DELETE
    public void delete() {
    }
}
