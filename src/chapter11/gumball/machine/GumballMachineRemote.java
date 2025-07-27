package chapter11.gumball.machine;

import chapter11.gumball.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    /**
     * All the return types must be Serializable
     * So, State must extend Serializable & all classes that implement State must have a serialVersionUID
     * Also need to use the 'transient' keyword, since we don't want to send the entire Gumball Machine
     *
     * @return the current state of the Gumball Machine
     * @throws RemoteException if there's an error with the network
     */
    public State getState() throws RemoteException;
}
