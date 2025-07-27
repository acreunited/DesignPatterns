package chapter11.proxy.client;

import chapter11.proxy.server.MyRemote;

import java.rmi.Naming;

public final class MyRemoteClient {

    private MyRemoteClient() {
        // empty
    }

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    /**
     * Runs the client side
     * 127.0.0.1 is the localhost
     */
    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(service.sayHello());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
