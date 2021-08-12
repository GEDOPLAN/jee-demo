package de.gedoplan.showcase.rest;

import de.gedoplan.showcase.service.HelloService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("hello")
public class HelloEndpoint {

  @Inject
  HelloService helloService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String get() {
    return this.helloService.getHello();
  }
}
