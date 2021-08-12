package de.gedoplan.showcase.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("platform")
public class PlatformEndpoint {

  @Path("bm")
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getBeanManagerClass() {
    return BeanManager.class.getName();
  }

  @Path("em")
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getEntityManagerClass() {
    return EntityManager.class.getName();
  }
}
