package client;

import shared.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

  public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {

    User stub = (User) Naming.lookup("rmi://localhost:1020/rmi");
    stub.getUser("1", "John Doe", "30");
  }

}
