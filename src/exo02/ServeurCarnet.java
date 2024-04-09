package exo02;

import exo02.Carnet.CarnetImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurCarnet {
    public static void main(String[] args) {
        try {
            CarnetImpl carnet = new CarnetImpl();
            CarnetImpl carnet01 = new CarnetImpl();

            // creation du registre sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            java.rmi.Naming.rebind("rmi://localhost:1099/carnet", carnet);
            java.rmi.Naming.rebind("rmi://localhost:1099/carnet01", carnet01);

            // Use the Registry.list method to print out all the names bound in the registry
            String[] boundNames = registry.list();
            System.out.println("All bound names:");
            for (String name : boundNames) {
                System.out.println(name);
            }
            System.out.println("Serveur prêt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
