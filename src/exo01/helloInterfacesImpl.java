package exo01;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class helloInterfacesImpl extends UnicastRemoteObject implements IHelloInterfaces{
    protected helloInterfacesImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }
}
