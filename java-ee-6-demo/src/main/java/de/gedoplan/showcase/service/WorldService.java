package de.gedoplan.showcase.service;

import javax.ejb.Stateless;

@Stateless
public class WorldService {

  public String getWorld() {
    return "world";
  }

}
