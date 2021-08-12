package de.gedoplan.showcase.service;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface HelloServiceHome extends EJBLocalHome {

  public HelloService create() throws RemoteException, CreateException;

}
