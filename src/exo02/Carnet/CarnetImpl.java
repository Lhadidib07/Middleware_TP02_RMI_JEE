package exo02.Carnet;

import exo02.Adresse;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class CarnetImpl extends UnicastRemoteObject implements Carnet{
    private HashMap<String, Adresse> carnet = new HashMap<>();
    public CarnetImpl() throws RemoteException {
    }


    public synchronized void enregistrer(String nom, Adresse adresse) throws RemoteException {
        carnet.put(nom, adresse);
    }

    public  synchronized void effacer(String nom) throws RemoteException {
        carnet.remove(nom);
    }

    public synchronized Adresse chercher(String nom) throws RemoteException {
        return carnet.getOrDefault(nom, null);
    }

    public synchronized HashMap<String, Adresse> lister() throws RemoteException {
        return carnet;
    }
}
