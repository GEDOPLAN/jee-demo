package de.gedoplan.showcase.service;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class WorldServiceBean implements SessionBean {

  public String getWorld() {
    return "world";
  }

  public void ejbCreate() throws RemoteException, CreateException {
  }

  public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
  }

  public void ejbRemove() throws EJBException, RemoteException {
  }

  public void ejbActivate() throws EJBException, RemoteException {
  }

  public void ejbPassivate() throws EJBException, RemoteException {
  }

}
