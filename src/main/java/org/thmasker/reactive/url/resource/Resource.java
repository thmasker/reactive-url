package org.thmasker.reactive.url.resource;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.thmasker.reactive.url.services.Service;

@Path("/resource")
public class Resource {

  private final Service service;

  public Resource(Service service) {
    this.service = service;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Uni<Response> getEntity() {
    return service.getEntities()
        .map(entities -> Response.ok(entities).build())
        .onFailure().recoverWithItem(failure -> Response.serverError().build());
  }

}
