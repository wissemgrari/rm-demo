package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface User extends Remote {
  void getUser(String ID, String name, String age) throws RemoteException;
}
