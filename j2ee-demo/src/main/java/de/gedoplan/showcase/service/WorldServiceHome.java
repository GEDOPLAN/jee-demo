package de.gedoplan.showcase.service;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface WorldServiceHome extends EJBLocalHome {

  public WorldService create() throws RemoteException, CreateException;

}
