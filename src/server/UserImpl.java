package server;

import shared.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserImpl extends UnicastRemoteObject implements User {

  public UserImpl() throws RemoteException {
    super();
  }

  @Override
  public void getUser(String ID, String name, String age) throws RemoteException {
    System.out.println("--- User Information ---");
    System.out.println("ID: "+ID+", name: "+name+", age: "+age);
  }
}
