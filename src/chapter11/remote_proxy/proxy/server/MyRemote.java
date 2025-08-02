package chapter11.remote_proxy.proxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface must extend java.rmi.Remote
 * All the remote methods must declare RemoteException
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
