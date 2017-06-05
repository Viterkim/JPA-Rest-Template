
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.TempEnt;
import facade.Facade;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;


@Path("temp")
public class TempResource {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Facade facade = new Facade();
    @Context
    private UriInfo context;


    public TempResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        TempEnt te = new TempEnt(85, "dav");
        facade.saveTemp(te);
        return gson.toJson(te);
    }

   
}
