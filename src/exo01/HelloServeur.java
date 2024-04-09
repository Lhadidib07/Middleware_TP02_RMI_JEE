package exo01;

import java.rmi.RemoteException;

public class HelloServeur  {

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("Serveur lance");
            java.rmi.Naming.rebind("rmi://localhost:1099/helloInterfacesImpl", new helloInterfacesImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
