package de.gedoplan.showcase.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.BeanManager;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
