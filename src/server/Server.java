package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
  public static void main(String[] args) throws RemoteException, MalformedURLException {

    // Define and reserve the port
    LocateRegistry.createRegistry(1020);

    UserImpl rmi = new UserImpl();

    // Naming to save the server objects and the port
    Naming.rebind("rmi://localhost:1020/rmi", rmi);

    System.out.println(rmi.toString());

  }
}
