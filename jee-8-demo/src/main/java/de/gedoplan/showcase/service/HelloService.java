package de.gedoplan.showcase.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HelloService {

  @Inject
  WorldService worldService;

  public String getHello() {
    return "Hello, " + this.worldService.getWorld();
  }

}
