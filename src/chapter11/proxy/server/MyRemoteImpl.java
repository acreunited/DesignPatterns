package chapter11.proxy.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Extending UnicasteRemoteObject is the easiest way to make a remote object
 * We must implement out remote interface
 * In these methods, here we don't need to declare RemoteException
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {
        // empty---
    }

    @Override
    public String sayHello() {
        return "Server says 'Hey'";
    }

    /**
     * Make the remote object, then "bind" it to the rmiregistry using the static Naming.rebind().
     * The name registered is the name clients will use to loop it up in the RMI registry
     *
     * @param args no args
     */
    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
