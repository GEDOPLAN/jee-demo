package de.gedoplan.showcase.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelloService {

  @EJB
  WorldService worldService;

  public String getHello() {
    return "Hello, " + this.worldService.getWorld();
  }

}
