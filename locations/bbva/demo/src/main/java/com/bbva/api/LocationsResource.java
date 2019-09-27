package com.bbva.api;

import com.bbva.api.beans.Location;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  Location generatedMethod2(Location data);

  @Path("/{id}")
  @GET
  @Produces("application/json")
  Location generatedMethod3(@PathParam("id") int id);

  @Path("/{id}")
  @DELETE
  void generatedMethod4(@PathParam("id") int id);
}
