package de.gedoplan.showcase.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WorldService {

  public String getWorld() {
    return "world";
  }

}
