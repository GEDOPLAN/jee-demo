package de.gedoplan.showcase.rest;

import de.gedoplan.showcase.service.HelloService;
import de.gedoplan.showcase.service.HelloServiceHome;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.naming.InitialContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("hello")
public class HelloEndpoint {

  HelloService helloService;

  @PostConstruct
  void postConstruct() {
    try {
      InitialContext context = new InitialContext();
      HelloServiceHome helloServiceHome = (HelloServiceHome) context.lookup("java:module/HelloService!de.gedoplan.showcase.service.HelloServiceHome");
      this.helloService = helloServiceHome.create();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String get() {
    return this.helloService.getHello();
  }
}
