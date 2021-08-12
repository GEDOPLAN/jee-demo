package de.gedoplan.showcase.service;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.enterprise.inject.CreationException;
import javax.naming.InitialContext;

public class HelloServiceBean implements SessionBean {

  private WorldService worldService;

  public String getHello() {
    return "Hello, " + this.worldService.getWorld();
  }

  public void ejbCreate() throws RemoteException, CreateException {
    try {
      InitialContext context = new InitialContext();
      WorldServiceHome worldServiceHome = (WorldServiceHome) context.lookup("java:comp/env/WorldService");
      this.worldService = worldServiceHome.create();
    } catch (Exception e) {
      throw new CreationException(e);
    }
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
